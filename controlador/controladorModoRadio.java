package controlador;

import java.lang.reflect.Array;
import java.util.ArrayList;

import modelo.IRadio;
import modelo.IReproducir;
import modelo.ITelefono;
import modelo.IVistaRadio;
import modelo.canciones;
import modelo.modeloRadio;

public class controladorModoRadio implements IVistaRadio, IRadio, ITelefono{

    modeloRadio mR = new modeloRadio();

    public controladorModoRadio(modeloRadio mR){
        this.mR = mR;
    }

    public void power(){
        if(mR.isPower()){
            mR.setPower(false);
        }else{
            mR.setPower(true);
        }
    }

    public void cancionAdelante(){
        if(mR.getPosCancion() < mR.getCanciones().get(mR.getPosReproduccion()).getCancion().size()){
            mR.setPosCancion(mR.getPosCancion()+1);
        }
    }

    public void cancionAtras(){
        if(mR.getPosCancion() != 0){
            mR.setPosCancion(mR.getPosCancion()-1);
        }
    }

    public String escucharCancion(){
        canciones c = mR.getCanciones().get(mR.getPosReproduccion()).getCancion().get(mR.getPosCancion());
        return "Nombre: "+c.getNombre()+", duracion: "+c.getTiempo()+", autor: "+c.getAutor()+", genero: "+c.getGenero();
    }

    public void subirVolumen(){
        if(mR.getVolumen() != 40){
            mR.setVolumen(mR.getVolumen() +1);
        }
    }

    public void bajarVolumen(){
        if(mR.getVolumen() != 0){
            mR.setVolumen(mR.getVolumen() -1);
        }
    }

    public void cambiarAModoRadio(){
        mR.setModoReproduccion(false);
        //mR.setModoTelefono(false);
        Encender();
    }
    
    public void cambiarAmodoReproducir(){
        Apagar();
        //mR.setModoTelefono(false);
        mR.setModoReproduccion(true);
    }

    @Override
    public void Encender() {
        mR.setModoRadio(true);
    }

    
    @Override
    public void Apagar() {
        mR.setModoRadio(false);
    }


    @Override
    public void cambiarEmisora() {
        // TODO Auto-generated method stub
        if(mR.getEmisora() != 50){
            mR.setEmisora(mR.getEmisora()+0.5);
        }
    }

    public void bajarEmisora(){
        if(mR.getEmisora() != 0){
            mR.setEmisora(mR.getEmisora()-0.5);
        }
    }

    @Override
    public double guardarEmisora() {
        mR.getEmisorasGuardadas().add(mR.getEmisora());
        return 0;
    }

    @Override
    public void cargarEmisora() {
        
    }

    public void cargarLaEmisora(int pos){
        mR.setEmisora(mR.getEmisorasGuardadas().get(pos));
    }

    @Override
    public void IntercambiarBanda() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void conectarTelefono() {
        if(mR.isConectar()){
            mR.setConectar(false);
        }else{
            mR.setConectar(true);
        }
        
    }

    @Override
    public void mostrarContactos(Array contactos) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void LlamarContacto(int contacto) {
        mR.setPosContacto(contacto);
        mR.setEnLlamada(true);  
    }

    @Override
    public void FinalizarLlamada() {
        mR.setEnLlamada(false);
        
    }

    @Override
    public void llamarUltimoContacto(int ultimoContacto) {
        mR.setPosContacto(ultimoContacto);
        mR.setEnLlamada(true);  
    }

}