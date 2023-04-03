/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
import java.util.StringTokenizer;
import modelo.Beans.Usuario2;

public class PersonalLocalDao {

    File archivoTemporal = new File("PersonalLocal.txt");
    ArrayList<Usuario2> usuarios = new ArrayList();
    ArrayList<Usuario2> usuarios1 = new ArrayList();
    public Usuario2 usuario2;

    public PersonalLocalDao() {

    }

    public void verificarArchivo() throws IOException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String valida = "valido";
        if (!archivoTemporal.exists()) {
            archivoTemporal.createNewFile();
            valida = "creado";
        } else {
            System.out.println("El archivo existe");

        }
    }

    public ArrayList<Usuario2> leerArchivoFile() throws FileNotFoundException, IOException {
        String validacion = "no leido";
        int numeroRegistros = 0;
       ArrayList<Usuario2> usuarios = new ArrayList();
        BufferedReader leerFichero = new BufferedReader(new FileReader(archivoTemporal));
        while ((leerFichero.readLine()) != null) {
            numeroRegistros += 1;
        }
        leerFichero.close();
        if (numeroRegistros == 0) {
            validacion = "no registro";
        } else {

            try ( BufferedReader leerArchivo = new BufferedReader(new FileReader(archivoTemporal))) {
                String line = null;
                while ((line = leerArchivo.readLine()) != null) {
                    StringTokenizer mistokens = new StringTokenizer(line, "\t");

                    String x1 = mistokens.nextToken().trim();
                    String x2 = mistokens.nextToken().trim();
                    String x3 = mistokens.nextToken().trim();
                    String x4 = mistokens.nextToken().trim();
                    String x5 = mistokens.nextToken().trim();
                    String x6 = mistokens.nextToken().trim();
                    String x7 = mistokens.nextToken().trim();
                    String x8 = mistokens.nextToken().trim();
                    usuarios.add(new Usuario2(x1, x2, x3, x4, x5, x6, x7, x8));
                }
            }
        }
        return usuarios;
    }

    public boolean insertar(Usuario2 usuario) {
        try {
            BufferedWriter escribirArchivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivoTemporal, true), "utf-8"));
            escribirArchivo.write(usuario.getNombres() + "\t" + usuario.getApellidos() + "\t" + usuario.getUsuario() + "\t" + usuario.getContraseña() + "\t" + usuario.getCorreo() + "\t" + usuario.getRol() + "\t" + usuario.getLocal() + "\t" + usuario.getUsuarioAutenticado() + "\n");
            escribirArchivo.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean insertarTodos(ArrayList<Usuario2> usuarios1) {
        try {    
            archivoTemporal.delete();
            archivoTemporal.createNewFile();
            for (int i = 0; i < usuarios1.size(); i++) {
                BufferedWriter escribirArchivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivoTemporal, true), "utf-8"));
            escribirArchivo.write(usuarios1.get(i).getNombres() + "\t" + usuarios1.get(i).getApellidos() + "\t" + usuarios1.get(i).getUsuario() + "\t" + usuarios1.get(i).getContraseña() + "\t" + usuarios1.get(i).getCorreo() + "\t" + usuarios1.get(i).getRol() + "\t" + usuarios1.get(i).getLocal() + "\t" + usuarios1.get(i).getUsuarioAutenticado() + "\n");
            escribirArchivo.close();
            }
 
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
  
}
