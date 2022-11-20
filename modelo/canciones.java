package modelo;

public class canciones {
    String nombre;
    String tiempo;
    String autor;
    String genero;
    
    public canciones(String nombre, String tiempo, String autor, String genero) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.autor = autor;
        this.genero = genero;
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
     * @return String
     */
    public String getTiempo() {
        return tiempo;
    }
    
    /** 
     * @param tiempo
     */
    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
    
    /** 
     * @return String
     */
    public String getAutor() {
        return autor;
    }
    
    /** 
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    /** 
     * @return String
     */
    public String getGenero() {
        return genero;
    }
    
    /** 
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
