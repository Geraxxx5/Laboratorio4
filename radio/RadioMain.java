package radio;

import java.util.Scanner;

import controlador.controladorModoRadio;
import modelo.canciones;
import modelo.modeloRadio;

public class RadioMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        modeloRadio mR = new modeloRadio(); 
        controladorModoRadio cmr = new controladorModoRadio(mR);
        boolean repetir = true;
        //----------------------------------------------//
        while(repetir){
            
        }

    }

}