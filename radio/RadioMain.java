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
            System.out.println("El carro actualemnte esta: "+encendidoApagado(mR.isPower()));
            if(mR.isPower()){
                System.out.println("Volumen Actual: "+mR.getVolumen());
                if(mR.isModoRadio()){
                    System.out.println("Estado radio: "+mR.getEstadoRadio());
                    System.out.println("Emisora Actual: "+mR.getEmisora());
                }
            }
            System.out.println("1) Salir\n2) Encender/Apagar\n3) Cambiar Volumen"+
                                "\n4) Modo Radio");
            System.out.println("Seleccione una opcion");
            String menu = sc.nextLine();
            if(menu.equals("1")){
                repetir = false;
            }
            if(menu.equals("2")){
                cmr.power();
            }
            if(menu.equals("3")){
                if(mR.isPower()){
                    System.out.println("1) Subir Volumen\n2) Bajar Volumen\nSeleccione la opcion:");
                    menu = sc.nextLine();
                    if(menu.equals("1")){
                        cmr.subirVolumen();
                    }else{
                        cmr.bajarVolumen();
                    }
                }else{
                    System.out.println("Se necesita encender el carro primero");
                }
            }
            if(menu.equals("4")){
                if(mR.isPower()){
                    cmr.cambiarAModoRadio();
                    boolean modoRadio = true;
                    while(modoRadio){
                        System.out.println("Estado radio: "+mR.getEstadoRadio());
                        System.out.println("Emisora Actual: "+mR.getEmisora());
                        System.out.println("1) Salir del modo radio\n2) Cambiar emisora\n3) Guardar emisora\n4) Cargar Emisora");
                        System.out.println("Seleccione la opcion que desea: ");
                        menu = sc.nextLine();
                        if(menu.equals("1")){
                            modoRadio = false;
                        }
                        if(menu.equals("2")){
                            System.out.println("1) Subir emisora\n2) Bajar emisora\nSeleccione la opcion:");
                            menu = sc.nextLine();
                            if(menu.equals("1")){
                                cmr.cambiarEmisora();
                            }else{
                                cmr.bajarEmisora();
                            }
                        }
                        if(menu.equals("3")){
                            if(mR.getEmisorasGuardadas().size() != 50){
                                System.out.println("Se guardo la emisora");
                                cmr.guardarEmisora();
                            }else{
                                System.out.println("Ya no tiene espacio para guardar");
                            }
                        }
                        if(menu.equals("4")){
                            if(mR.getEmisorasGuardadas().size() != 0){
                                for (int i = 0; i < (mR.getEmisorasGuardadas().size()); i++) {
                                    System.out.println(i+") "+mR.getEmisorasGuardadas().get(i));
                                }
                                System.out.println("Seleccione la emisora que desea");
                                try {
                                    int opc = sc.nextInt();
                                    sc.nextLine();
                                    if(opc >= 0 && opc < mR.getEmisorasGuardadas().size()){
                                        cmr.cargarLaEmisora(opc);
                                    }
                                } catch (Exception e) {
                                    System.out.println("No selecciono ninguna emisora");
                                }
                            }else{
                                System.out.println("No hay emisoras guardadas");
                            }
                        }

                    }
                }else{
                    System.out.println("Se necesita encender el carro primero");
                }
            }
        }

    }

    public static String encendidoApagado(boolean power){
        if(power){
            return "Encendido";
        }
        return "Apagado";
    }

}