package modelo.Beans;

public class Usuario2 extends Usuario {
    private String local;
    private String usuarioAutenticado;



    public Usuario2(String nombres, String apellidos,  String usuario, String contraseña, String correo, String rol, String local, String usuarioAutenticado) {
        super(nombres, apellidos, contraseña, correo, usuario, rol);
        this.local = local;
        this.usuarioAutenticado = usuarioAutenticado;
    }

    public String getUsuarioAutenticado() {
        return usuarioAutenticado;
    }

    public void setUsuarioAutenticado(String usuarioAutenticado) {
        this.usuarioAutenticado = usuarioAutenticado;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    
}
