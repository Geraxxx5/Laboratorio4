package modelo;
import java.lang.reflect.Array;

public interface ITelefono {

    /** Notificar al usuario que esta en MODO TELEFONO */
    void conectarTelefono();

    /** Imprimir todos los numeros guardados en un array de contactos */
    void mostrarContactos(Array contactos);

    /*imprimir al numero que se escogio del arraylist */
    void LlamarContacto(int contacto);

    /** Terminar la llamada que se inicio con el numero del arraylist */
    void FinalizarLlamada();
     /* imprimir al ultimo contacto al que se llamo */
    void llamarUltimoContacto(int ultimoContacto);
    
}
