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

    @Override
    public void conectarTelefono() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mostrarContactos(Array contactos) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void LlamarContacto(int contacto) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void FinalizarLlamada() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void llamarUltimoContacto(int ultimoContacto) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void IntercambiarBanda() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void cambiarEmisora() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public double guardarEmisora() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void cargarEmisora() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void Encender() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void Apagar() {
        // TODO Auto-generated method stub
        
    }
 
}
