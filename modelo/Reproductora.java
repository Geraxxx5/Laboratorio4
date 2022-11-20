package modelo;

import java.util.ArrayList;

public class Reproductora {
    String nombre;
    ArrayList<canciones> cancion = new ArrayList<>();

    public Reproductora(String nombre) {
        this.nombre = nombre;
    }

    
    /** 
     * @return String
     */
    public String getNombre() {
        return nombre;
    }
    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /** 
     * @return ArrayList<canciones>
     */
    public ArrayList<canciones> getCancion() {
        return cancion;
    }
    
    /** 
     * @param cancion
     */
    public void setCancion(ArrayList<canciones> cancion) {
        this.cancion = cancion;
    }

}
