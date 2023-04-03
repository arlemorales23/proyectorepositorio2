
package modelo.Beans;


public class Usuario {
    
    private String nombres;
    private String apellidos;
    private String contraseña;
    private String correo;
    private String usuario;
    private String rol;

    public Usuario(String nombres, String apellidos, String contraseña, String correo, String usuario, String rol) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.correo = correo;
        this.usuario = usuario;
        this.rol = rol;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    
      
}