
package modelo.Dao;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;


import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;


import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


import modelo.Beans.Usuario;

public class UsuarioDao {
    
    File archivo = new File("Login.txt");
    private List<Usuario> usuarios;

    public UsuarioDao() {
        usuarios = new ArrayList<>();
    }
    
    public int buscar(String usuario){
        int n=-1;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getUsuario().equals(usuario)){
                n = i;
                break;
            }
        }
        return n;
    }
    
    public boolean insertar(Usuario usuario){
        if (buscar(usuario.getUsuario())==-1){
            usuarios.add(usuario);
            try{
                BufferedWriter escribirArchivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo,true),"utf-8"));
                escribirArchivo.write(usuario.getNombres()+"\t"+usuario.getApellidos()+"\t"+usuario.getUsuario()+"\t" +usuario.getContraseña()+"\t"+usuario.getCorreo()+"\t"+usuario.getRol()+"\t"+"\n");
                escribirArchivo.close();
                
            } catch (Exception e) {
            System.out.println( e.getMessage() );
        }
            
            return true;
        }else{
            return false;
        }
    }
    
    public boolean modificar(Usuario usuario){
         if (buscar(usuario.getUsuario())!=-1){
            Usuario usuarioaux = obtener(usuario.getUsuario());
            
            usuarioaux.setContraseña(usuario.getContraseña());
            usuarioaux.setNombres(usuario.getNombres());
            usuarioaux.setApellidos(usuario.getApellidos());
            usuarioaux.setCorreo(usuario.getCorreo());
            return true;
        }else{
            return false;
        }
    }
    
    public boolean eliminar (String usuario){
        if (buscar(usuario)!=-1){
            usuarios.remove(buscar(usuario));
         return true;
        }else{
            return false;
    }
    }
    
    public Usuario obtener(String usuario){
        if(buscar(usuario)!=-1){
            return usuarios.get(buscar(usuario));
           
        }else{
             return null;
        }
    }
    
    //nuevos metodos
    
     public String verificarArchivo(String usu, String contraseña) throws IOException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String valida = "no";
        if(!archivo.exists()){
            archivo.createNewFile();
            System.out.println("Archivo de base de datos creado correctamente");
            valida = "No archivo";
        }
        else  {
            System.out.println("El archivo existe");
            valida = leerArchivo(usu, contraseña);          
        }
        return valida;
     }
     
       public String leerArchivo(String usu, String contraseña) throws FileNotFoundException, IOException{
        String validacion = "no";
        String linea = null;
        int numeroRegistros=0;
        BufferedReader leerFichero = new BufferedReader(new FileReader(archivo));
        while ((linea = leerFichero.readLine()) != null) { 
            numeroRegistros+=1;
        }
        leerFichero.close();
        if(numeroRegistros==0)
             validacion = "no registro";
        else{
            String [][]datos = new String[numeroRegistros][6];
            int posicion=0;
            String line = null;
            String tempUsuario = "";
            String tempClave = "";
            BufferedReader leerArchivo = new BufferedReader(new FileReader(archivo));
            while ((line = leerArchivo.readLine()) != null) {   
                StringTokenizer mistokens = new StringTokenizer(line,"\t");
                datos[posicion][0] = mistokens.nextToken().trim();
                datos[posicion][1] = mistokens.nextToken().trim();
                datos[posicion][2] = mistokens.nextToken().trim();
                datos[posicion][3] = mistokens.nextToken().trim();
                datos[posicion][4] = mistokens.nextToken().trim();
                datos[posicion][5] = mistokens.nextToken().trim();
                tempUsuario = datos[posicion][2];
                tempClave = datos[posicion][3];
                if(tempUsuario.equals(usu )&& tempClave.equals(contraseña) ){
                    String rol = datos[posicion][5];
                    validacion = rol;
                }
                posicion+=1;
            }
            
            leerArchivo.close();   
        } 
        return validacion;
}
}
