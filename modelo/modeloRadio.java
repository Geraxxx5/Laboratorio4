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

    public boolean isConectar() {
        return conectar;
    }

    public void setConectar(boolean conectar) {
        this.conectar = conectar;
    }

    public int getPosContacto() {
        return posContacto;
    }

    public void setPosContacto(int posContacto) {
        this.posContacto = posContacto;
    }

    public boolean isEnLlamada() {
        return enLlamada;
    }

    public void setEnLlamada(boolean enLlamada) {
        this.enLlamada = enLlamada;
    }

    public ArrayList<contacto> getContactos() {
        return contactos;
    }

    public int getPosCancion() {
        return posCancion;
    }

    public void setPosCancion(int posCancion) {
        this.posCancion = posCancion;
    }

    public void setContactos(ArrayList<contacto> contactos) {
        this.contactos = contactos;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public int getPosReproduccion() {
        return posReproduccion;
    }

    public void setPosReproduccion(int posReproduccion) {
        this.posReproduccion = posReproduccion;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public ArrayList<Double> getEmisorasGuardadas() {
        return emisorasGuardadas;
    }

    public void setEmisorasGuardadas(ArrayList<Double> emisorasGuardadas) {
        this.emisorasGuardadas = emisorasGuardadas;
    }

    public ArrayList<Reproductora> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Reproductora> canciones) {
        this.canciones = canciones;
    }

    public double getEmisora() {
        return emisora;
    }

    public void setEmisora(double emisora) {
        this.emisora = emisora;
    }

    public modeloRadio(){
        generarListas();
        generarContactos();
        setTarjetas();
    }

    public boolean isModoRadio() {
        return modoRadio;
    }

    public String getEstadoRadio() {
        return estadoRadio;
    }

    public void setEstadoRadio(String estadoRadio) {
        this.estadoRadio = estadoRadio;
    }

    public void setModoRadio(boolean modoRadio) {
        this.modoRadio = modoRadio;
    }

    public boolean isModoReproduccion() {
        return modoReproduccion;
    }

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

    public String getTarjetas(){
        String gT = "";
        for (int index = 0; index < tarjetas.size(); index++) {
            gT+=tarjetas.get(index)+"\n";
        }
        return gT;
    }
    @Override
    public void verTarjetas(ArrayList<String> tarjetas) {
        // TODO Auto-generated method stub
        
    }


}
