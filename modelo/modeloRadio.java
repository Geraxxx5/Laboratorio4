package modelo;

import java.util.ArrayList;

public class modeloRadio implements IProductividad{
    
    boolean power = false;
    boolean modoRadio = false;
    boolean modoReproduccion = false;
    int volumen = 0;
    //Variables modo Radio
    double emisora = 0;
    String estadoRadio = "FM";
    ArrayList<Double> emisorasGuardadas = new ArrayList<>();
    //Variables modo Reproducir
    ArrayList<Reproductora> canciones = new ArrayList<>();
    int posReproduccion = 0;
    int posCancion = 0;
    //Variables para el modo Telefono
    boolean conectar = false;
    int posContacto = -1;
    boolean enLlamada = false;
    ArrayList<contacto> contactos = new ArrayList<>();

    
    /** 
     * @return boolean
     */
    public boolean isConectar() {
        return conectar;
    }

    
    /** 
     * @param conectar
     */
    public void setConectar(boolean conectar) {
        this.conectar = conectar;
    }

    
    /** 
     * @return int
     */
    public int getPosContacto() {
        return posContacto;
    }

    
    /** 
     * @param posContacto
     */
    public void setPosContacto(int posContacto) {
        this.posContacto = posContacto;
    }

    
    /** 
     * @return boolean
     */
    public boolean isEnLlamada() {
        return enLlamada;
    }

    
    /** 
     * @param enLlamada
     */
    public void setEnLlamada(boolean enLlamada) {
        this.enLlamada = enLlamada;
    }

    
    /** 
     * @return ArrayList<contacto>
     */
    public ArrayList<contacto> getContactos() {
        return contactos;
    }

    
    /** 
     * @return int
     */
    public int getPosCancion() {
        return posCancion;
    }

    
    /** 
     * @param posCancion
     */
    public void setPosCancion(int posCancion) {
        this.posCancion = posCancion;
    }

    
    /** 
     * @param contactos
     */
    public void setContactos(ArrayList<contacto> contactos) {
        this.contactos = contactos;
    }

    
    /** 
     * @return boolean
     */
    public boolean isPower() {
        return power;
    }

    
    /** 
     * @param power
     */
    public void setPower(boolean power) {
        this.power = power;
    }

    
    /** 
     * @return int
     */
    public int getPosReproduccion() {
        return posReproduccion;
    }

    
    /** 
     * @param posReproduccion
     */
    public void setPosReproduccion(int posReproduccion) {
        this.posReproduccion = posReproduccion;
    }

    
    /** 
     * @return int
     */
    public int getVolumen() {
        return volumen;
    }

    
    /** 
     * @param volumen
     */
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    
    /** 
     * @return ArrayList<Double>
     */
    public ArrayList<Double> getEmisorasGuardadas() {
        return emisorasGuardadas;
    }

    
    /** 
     * @param emisorasGuardadas
     */
    public void setEmisorasGuardadas(ArrayList<Double> emisorasGuardadas) {
        this.emisorasGuardadas = emisorasGuardadas;
    }

    
    /** 
     * @return ArrayList<Reproductora>
     */
    public ArrayList<Reproductora> getCanciones() {
        return canciones;
    }

    
    /** 
     * @param canciones
     */
    public void setCanciones(ArrayList<Reproductora> canciones) {
        this.canciones = canciones;
    }

    
    /** 
     * @return double
     */
    public double getEmisora() {
        return emisora;
    }

    
    /** 
     * @param emisora
     */
    public void setEmisora(double emisora) {
        this.emisora = emisora;
    }

    public modeloRadio(){
        generarListas();
        generarContactos();
        setTarjetas();
    }

    
    /** 
     * @return boolean
     */
    public boolean isModoRadio() {
        return modoRadio;
    }

    
    /** 
     * @return String
     */
    public String getEstadoRadio() {
        return estadoRadio;
    }

    
    /** 
     * @param estadoRadio
     */
    public void setEstadoRadio(String estadoRadio) {
        this.estadoRadio = estadoRadio;
    }

    
    /** 
     * @param modoRadio
     */
    public void setModoRadio(boolean modoRadio) {
        this.modoRadio = modoRadio;
    }

    
    /** 
     * @return boolean
     */
    public boolean isModoReproduccion() {
        return modoReproduccion;
    }

    
    /** 
     * @param modoReproduccion
     */
    public void setModoReproduccion(boolean modoReproduccion) {
        this.modoReproduccion = modoReproduccion;
    }

    public void generarContactos(){
        contactos.add(new contacto("Gerardo Pineda","30119946"));
        contactos.add(new contacto("Gabriel Riveiro", "46668105"));
        contactos.add(new contacto("Nathalie Fajardo", "50514220"));
        contactos.add(new contacto("Mirna Pivaral", "32067222"));
        contactos.add(new contacto("Ludving Molina", "35964578"));
        contactos.add(new contacto("Mama", "78962232"));
        contactos.add(new contacto("Papa", "78933054"));
    }

    public void generarListas(){
        //Canciones Spotify
        canciones.add(new Reproductora("Spotify"));
        canciones.get(0).getCancion().add(new canciones("La gasolina","3:12","Daddy Yankee","Reguetón"));
        canciones.get(0).getCancion().add(new canciones("506","3:00","Morat","Pop"));
        canciones.get(0).getCancion().add(new canciones("La cancion","4:02","Bad Bunny","Urbano Latino"));
        canciones.get(0).getCancion().add(new canciones("Sinfonia 5","34:50","Ludwig van Beethoven","Clasica"));
        canciones.add(new Reproductora("Mp3"));
        canciones.get(1).getCancion().add(new canciones("The Hum","3:31","Dimitri Vegas & Like Mike","R&B/Soul"));
        canciones.get(1).getCancion().add(new canciones("Wake me up","4:12","Avicii","Electronica"));
        canciones.get(1).getCancion().add(new canciones("Animals","3:08","Martin Garrix","Big room house"));
        canciones.get(1).getCancion().add(new canciones("Diosa","3:34","Myke Towers","Urbano Latino"));
        canciones.add(new Reproductora("Disco"));
        canciones.get(2).getCancion().add(new canciones("Piensan","2:53","Myke Towers","Urbano latino"));
        canciones.get(2).getCancion().add(new canciones("Anti-Hero","3:21","Taylor Swift","Pop"));
        canciones.get(2).getCancion().add(new canciones("Karma","3:25","Taylor Swift","Pop"));
        canciones.get(2).getCancion().add(new canciones("Mastermind","3:11","Taylor Swift","Pop"));
        canciones.get(2).getCancion().add(new canciones("Waka Waka","3:20","Shakira","Pop"));
    }

    public void setTarjetas(){
        tarjetas.add("Gerardo: 246+9885");
        tarjetas.add("Daniela: 78456215");
        tarjetas.add("Firulais: 6975236");
    }

    
    /** 
     * @return String
     */
    public String getTarjetas(){
        String gT = "";
        for (int index = 0; index < tarjetas.size(); index++) {
            gT+=tarjetas.get(index)+"\n";
        }
        return gT;
    }
    
    /** 
     * @param tarjetas
     */
    @Override
    public void verTarjetas(ArrayList<String> tarjetas) {
        // TODO Auto-generated method stub
        
    }


}
