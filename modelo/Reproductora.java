package modelo;

import java.util.ArrayList;

public class Reproductora {
    String nombre;
    ArrayList<canciones> cancion = new ArrayList<>();

    public Reproductora(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<canciones> getCancion() {
        return cancion;
    }
    public void setCancion(ArrayList<canciones> cancion) {
        this.cancion = cancion;
    }

}
