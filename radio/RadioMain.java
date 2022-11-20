/*
 * @author Gabriel Pineda, Brandon No
 * @version 1
 * @date 19/11/2022
 * 
 */
package radio;

import java.util.Scanner;

import controlador.controladorModoRadio;
import modelo.canciones;
import modelo.modeloRadio;

public class RadioMain{

    /** 
     * @param args
     */
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
                if(mR.isModoReproduccion()){
                    System.out.println("Reproductora: "+mR.getCanciones().get(mR.getPosReproduccion()).getNombre());
                    System.out.println("Cancion actual: "+mR.getCanciones().get(mR.getPosReproduccion()).getCancion().get(mR.getPosCancion()).getNombre());
                }
                if(mR.isConectar()){
                    System.out.println("Estado celular: "+encendidoApagado(mR.isConectar()));
                    if(mR.isEnLlamada()){
                        System.out.println("Hablando con: "+mR.getContactos().get(mR.getPosContacto()).getNombre());
                    }
                }
            }
            System.out.println("1) Salir\n2) Encender/Apagar\n3) Cambiar Volumen"+
                                "\n4) Modo Radio\n5) Modo Reproduccion\n6) Modo Telefono\n7) Tarjetas de presentacion");
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
            if(menu.equals("5")){
                if(mR.isPower()){
                    cmr.cambiarAmodoReproducir();
                    System.out.println("Que desea reproducir\n1) CD\n2) MP3\n3) Spotify");
                    menu = sc.nextLine();
                    if(menu.equals("1")){
                        mR.setPosReproduccion(2);
                    }else if(menu.equals("2")){
                        mR.setPosReproduccion(1);
                    }else{
                        mR.setPosReproduccion(0);
                    }
                    boolean reproducir = true;
                    mR.setPosCancion(0);
                    while(reproducir){
                        System.out.println("Reproductora: "+mR.getCanciones().get(mR.getPosReproduccion()).getNombre());
                        System.out.println("Cancion actual: "+mR.getCanciones().get(mR.getPosReproduccion()).getCancion().get(mR.getPosCancion()).getNombre());
                        System.out.println("Que desea realizar\n1) Salir modo Reproducir\n2) Cambiar Cancion\n3) Escuchar Cancion\nSeleccione una opcion");
                        menu = sc.nextLine();
                        if(menu.equals("1")){
                            reproducir = false;
                        }
                        if(menu.equals("2")){
                            System.out.println("1) Cancion para adelante\n2) Cancion para atras\nSeleccione la opcion:");
                            menu = sc.nextLine();
                            if(menu.equals("1")){
                                //cmr.cambiarEmisora();
                                cmr.cancionAdelante();
                            }else{
                                //cmr.bajarEmisora();
                                cmr.cancionAtras();
                            }
                        }
                        if(menu.equals("3")){
                            System.out.println(cmr.escucharCancion());
                        }

                    }
                }else{
                    System.out.println("Se necesita encender el carro primero");
                }
            }
            if(menu.equals("6")){
                if(mR.isPower()){
                    boolean modoTelefono = true;
                    while(modoTelefono){
                        System.out.println("Estado celular: "+encendidoApagado(mR.isConectar()));
                        if(mR.isEnLlamada()){
                            System.out.println("Hablando con: "+mR.getContactos().get(mR.getPosContacto()).getNombre());
                        }
                        System.out.println("1) Salir modo Telefono\n2) Conectar/Desconectar\n3) Mostrar Contactos\n4) Llamar a contacto\n5) Finalizar llamada"+
                                        "\n6) Llamar a ultimo contacto con el que hablo");
                        menu = sc.nextLine();
                        if(menu.equals("1")){
                            modoTelefono = false;
                        }
                        if(menu.equals("2")){
                            mR.setModoRadio(false);
                            mR.setModoReproduccion(false);
                            cmr.conectarTelefono();
                        }
                        if(menu.equals("3")){
                            if(mR.isConectar()){
                                mostarContactos(mR);
                            }else{
                                System.out.println("Conecta el telefono antes");
                            }
                        }
                        if(menu.equals("4")){
                            if(mR.isConectar()){
                                mostarContactos(mR);
                                System.out.println("Seleccione la opcion que desea: ");
                                try {
                                    int opc = sc.nextInt();
                                    sc.nextLine();
                                    if(opc >= 0 && opc < mR.getContactos().size()){
                                        cmr.LlamarContacto(opc);
                                    }else{
                                        System.out.println("No selecciono ninguna opcion");
                                    }
                                } catch (Exception e) {
                                    System.out.println("No selecciono ninguna opcion");
                                }
                            }else{
                                System.out.println("Conecta el telefono antes");
                            }
                        }
                        if(menu.equals("5")){
                            if(mR.isConectar()){
                                mR.setEnLlamada(false);
                            }else{
                                System.out.println("Conecta el telefono antes");
                            }
                        }
                        if(menu.equals("6")){
                            if(mR.isConectar()){
                                if(mR.getPosContacto() != -1){
                                    cmr.FinalizarLlamada();
                                }else{
                                    System.out.println("No hay ultimo contacto");
                                }
                            }else{
                                System.out.println("Conecta el telefono antes");
                            }
                        }
                    }   
                }else{
                    System.out.println("Se necesita encender el carro primero");
                }
            }
            if(menu.equals("7")){
                if(mR.isPower()){
                    System.out.println(mR.getTarjetas());
                }else{
                    System.out.println("Se necesita encender el carro primero");
                }
            }
        }

    }

    /** 
     * @param power
     * @return String
     */
    public static String encendidoApagado(boolean power){
        if(power){
            return "Encendido";
        }
        return "Apagado";
    }

    /** 
     * @param power
     * @return String
     */
    public static String encendidoApagadoT(boolean power){
        if(power){
            return "Encendido";
        }
        return "Apagado";
    }

    /** 
     * @param mR
     */
    public static void mostarContactos(modeloRadio mR){
        for (int i = 0; i < mR.getContactos().size(); i++) {
            System.out.println(i+") "+mR.getContactos().get(i).getNombre());
        }
    }

}