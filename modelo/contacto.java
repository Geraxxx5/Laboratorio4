package modelo;

public class contacto {
    String nombre;
    String telefono;
    
    
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
     * @return String
     */
    public String getTelefono() {
        return telefono;
    }

    
    /** 
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
}
