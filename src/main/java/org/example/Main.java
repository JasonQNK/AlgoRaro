package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //System.out.println("Comienza aca: ");

        //Diseñar un algoritmo que permita el ingreso
        //de un usuario con correo y contraseña
        //se permitira 3 intentos antes de bloquearlo


        //ENTRADAS DEL ALGORITMO 1
        Scanner leerTeclado=new Scanner(System.in);
        String colorBlanco="\u001B[29m";
        String colorNegro="\u001B[30m";
        String colorRojo="\u001B[31m";
        String colorVerde="\u001B[32m";
        String colorNaranja="\u001B[33m";
        String colorAzul="\u001B[34m";
        String colorMorado="\u001B[35m";

        String correoDigitadoUsuario="";
        String contrasenaDigitadaUsuario="";
        String correoGuardadoBaseDatos="jason@gmail.com";
        String contrasenaGuardadaBaseDatos= "1234";

        boolean accesoPermitido= false;
        int intentos=0;

        //PROCESO
        System.out.println(colorNaranja+"**********************");
        System.out.println("GESTOR APP by JAY 2025 🤢");
        System.out.println("**********************");

        while (intentos <3 && !accesoPermitido) {
            System.out.print(colorAzul+"Ingrese su correo: ");
            correoDigitadoUsuario=leerTeclado.nextLine();

            System.out.print(colorAzul+"Ingrese su contraseña: ");
            contrasenaDigitadaUsuario=leerTeclado.nextLine();

            if (correoDigitadoUsuario.equals(correoGuardadoBaseDatos) &&
                    contrasenaDigitadaUsuario.equals(contrasenaGuardadaBaseDatos))
            {
                accesoPermitido= true;
                System.out.println(colorVerde+"Acceso permitido. Bienvenido " + correoDigitadoUsuario);
            } else {
                intentos++;
                System.out.println(colorRojo+"Acceso denegado, " + intentos + " de 3 ");
            }
        }
        //Si se supera el numero de intentos fallidos el sistema termina la ejecucion//
        //! significa NEGACION, en este caso seria si acceso permitido falso proceda a denegar el acceso//
        if (!accesoPermitido) {
            System.out.println(colorRojo + "Acceso Denegado Por Maximo De Intentos");
        }

        //Menu//

        System.out.println(colorNaranja + "===== MENÚ PRINCIPAL =====");
        System.out.println(colorVerde + "1. Registrar venta");
        System.out.println(colorAzul + "2. Mostrar ventas del día");
        System.out.println(colorMorado + "3. Salir");
        System.out.println(colorNaranja + "==========================");

        System.out.print(colorBlanco+"Elija una opcion del 1 al 3: ");
        int opcion = leerTeclado.nextInt();

        //Opciones multiples  :) //
        switch (opcion) {
            case 1:
                System.out.println(colorVerde + "Opcion 1: Registrar Venta");
                break;
            case 2:
                System.out.println(colorAzul+"Opcion 2: Ventas del dia");
                break;
            case 3:
                System.out.println(colorRojo+"Saliendo...");
                break;
            default:
                System.out.println("Opcion Invalida");
        }
        //Diseñar un algoritmo que permita mostrar un menu de opciones
        //si el usuario se autentico conn exito, el menu sera el siguiente:
        //1. Registrar venta
        //2. Mostrar ventas del dia
        //3. sali
        //NOTA: una venta se considera en el sistema como una variante
        //con los siguientes datos:
        //id-->entero
        //fecha-->LocalDate
        //descripcion-->Cadena
        //Lista de productos-->Lista
        //total-->doble

        //NOTA2: un producto tiene:
        //id
        //precioUnitario
        //fotografia
        //cantidad
    }
}