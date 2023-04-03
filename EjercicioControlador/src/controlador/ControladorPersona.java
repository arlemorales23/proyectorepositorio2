package controlador;

import java.util.ArrayList;
import modelo.Persona;

public class ControladorPersona {

    Persona[] personas;
    private ArrayList<Persona> listaPersonas;

    public ControladorPersona() {
        personas = new Persona[3];
        listaPersonas = new ArrayList<>();
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public boolean guardarPersona(Persona persona) {
        Persona auxiliar = buscarPersona(persona.getCedula());
        if (auxiliar == null) {
            for (int i = 0; i < personas.length; i++) {
                if (personas[i] == null) {
                    personas[i] = persona;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean guardarListaPersonas(Persona persona) {
        Persona auxiliar = buscarListaPersona(persona.getCedula());
        if (auxiliar == null) {
            listaPersonas.add(persona);
            return true;
        }
        return false;
    }

    public Persona buscarPersona(String cedula) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null
                    && personas[i].getCedula().equals(cedula)) {
                return personas[i];
            }
        }
        return null;
    }

    public Persona buscarListaPersona(String cedula) {
        for (int i = 0; i < listaPersonas.size(); i++) {
            if (listaPersonas.get(i).getCedula().equals(cedula)) {
                return listaPersonas.get(i);
            }

        }
        return null;
    }

    public boolean editarPersona(Persona nuevaPersona) {
        Persona auxPersona = buscarListaPersona(nuevaPersona.getCedula());
        if (auxPersona != null) {
            auxPersona.setNombre(nuevaPersona.getNombre());
            auxPersona.setCedula(nuevaPersona.getCedula());
            auxPersona.setEdad(nuevaPersona.getEdad());

            return true;

        }
        return false;

    }

    public boolean eliminarPersona(String cedula) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null && personas[i].getCedula().equals(cedula)) {
                personas[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean eliminarListaPersona(String cedula) {
        for (int i = 0; i < listaPersonas.size(); i++) {
            if (listaPersonas.get(i).getCedula().equals(cedula)) {
                listaPersonas.remove(i);
                return true;
            }
        }
        return false;
    }

//    persona auxiliar = buscarListaPersona(cedula);
//        if (auxiliar != null) {
//            listaPersonas.remove(auxiliar);
//            return true;
//        }
//            return false;
//
// Eliminado por referencia!!
}
