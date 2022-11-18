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
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTiempo() {
        return tiempo;
    }
    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
