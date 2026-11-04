package com.meza_x19; // Paquete del programa

import java.util.Scanner; // Importamos librería Scanner

public class Main { // Creamos clase principal

    public static void main(String[] args) { // Método main

        // Creamos variables
        int opciónMenú = -1; // Opción que elige el usuario

        Scanner sc = new Scanner(System.in); // Creamos objeto Scanner

        System.out.println(""); // Bienvenida al programa
        System.out.println("\t* * * * * * * * * * * *");
        System.out.println("\t* Calculadora en Java *");
        System.out.println("\t* * * * * * * * * * * *");
        System.out.println("");

        do { // Bucle del menú principal

            try { // Controlamos input de usuario

                // Menú principal
                System.out.println("=======================================");
                System.out.println("");
                System.out.println("1 - Sumar");
                System.out.println("2 - Restar");
                System.out.println("3 - Multiplicar");
                System.out.println("4 - Dividir");
                System.out.println("0 - Salir");
                System.out.println("");
                System.out.print("Introduce tu opción: ");
                opciónMenú = sc.nextInt(); // Tomamos la opción del usuario
                System.out.println("");

                switch(opciónMenú) { // En función de la opción elegida por el usuario

                    case 1: // Caso sumar
                        //TODO
                    break;

                    case 2: // Caso restar
                        //TODO
                    break;

                    case 3: // Caso multiplicar
                        //TODO
                    break;

                    case 4: // Caso dividir
                        //TODO
                    break;

                    case 0: // Caso salir
                        System.out.print("Saliendo del programa... ");
                    break;

                    default: // Otra opción
                        System.out.println("La opción seleccionada no es válida. Inténtelo de nuevo.");
                        System.out.println("");

                }

            } catch (java.util.InputMismatchException e) { // Tipo de dato introducido incorrecto

                sc.next(); // Limpiamos búfer
                System.out.println("");
                System.out.println("El tipo de dato que has introducido es incorrecto (" + e + "). Inténtelo de nuevo");
                System.out.println("");

            } catch (Exception e) { // Otras excepciones

                sc.next(); // Limpiamos búfer
                System.out.println("");
                System.out.println("¡Ups! Hubo un error inesperado (" + e + "). Inténtelo de nuevo");
                System.out.println("");

            }

        } while (opciónMenú != 0); // Volvemos a imprimir el menú hasta que el usuario no elija salir

        // El usuario eligió salir
        sc.close(); // Cerramos Scanner
        System.out.println("¡Hasta luego!");
        System.out.println("");

    } // Aquí termina el método main

} // Aquí termina la clase
