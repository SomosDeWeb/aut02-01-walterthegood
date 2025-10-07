package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static final String ROJO = "\u001b[31m";
    public static final String RESET = "\u001b[0m";
    public static final String VERDE = "\u001b[32m";
    public static final String AMARILLO = "\u001b[33m";
    public static final String AZUL = "\u001b[34m";
    private static final Scanner sc;

    public static void main(String[] args) {

        Boolean salir = true;

        do {
            System.out.println(VERDE+" === Gestor de Estudiantes === ");
            System.out.println("1. Añadir estudiante");
            System.out.println("2. Listar estudiantes");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Calcular nota media general");
            System.out.println("5. Mostrar mejor estudiante");
            System.out.println("6. Salir"+RESET);
            System.out.print(AMARILLO+"Seleccione opción:"+RESET);

            Integer opcion;
            try {
                opcion = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException var4) {
                System.out.println(ROJO+"ERROR: ingresa un número entero\n"+RESET);
                sc.nextLine();
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    NuevoEstudiante();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    salir = false;
                    break;
                default:
                    System.out.println(ROJO+"Un numero del 1-6  B.o.b.\n"+RESET);
            }
        } while(salir);

        sc.close();
        System.out.println("Has salido adios");
    }

    //La clase del swivht uno
    private static void NuevoEstudiante() {
        String nombre = pedirStringNoVacio(AZUL+ "Indroduce Nombre:"+RESET);
        int edad = pedirEnteroValidado(AZUL+"Introduce edad:"+RESET, 1, 100);
        double nota = pedirDoubleValidado(AZUL+"Introduce nota media:"+RESET, (double)0.0F, (double)10.0F);
        boolean matriculado = pedirBooleanoMatricula(AZUL+"¿Está matriculado (true/false)?: "+RESET);
        StudiantesController.guardarEstudiante(nombre, edad, nota, matriculado);
        System.out.println(AZUL+"Estudiante añadido correctamente."+RESET);
    }

    // balidadores de 1ra opcion NOMBRE
    private static String pedirStringNoVacio(String mensaje) {
        while(true) {
            System.out.println(mensaje);
            String valor = sc.nextLine().trim();
            if (!valor.isEmpty()) {
                return valor;
            }

            System.out.println(ROJO+"El campo no puede estar vacío."+RESET);
        }
    }

    // balidadores de 1ra opcion EDAD
    private static int pedirEnteroValidado(String mensaje, int min, int max) {
        int valor = 0;
        boolean v = true;

        while(v) {
            try {
                System.out.println(mensaje);
                valor = Integer.parseInt(sc.nextLine().trim());
                if (valor >= min && valor <= max) {
                    v = false;
                } else {
                    System.out.println(ROJO+"Error: El valor debe estar entre " + min + " y " + max + "."+RESET);
                }
            } catch (NumberFormatException var6) {
                System.out.println(ROJO+"Introduce un número entero válido."+RESET);
            }
        }

        return valor;
    }

    // balidadores de 1ra opcion NOTA MEDIA
    private static double pedirDoubleValidado(String mensaje, double min, double max) {
        double valor = (double)0.0F;
        boolean v = true;

        while(v) {
            try {
                System.out.println(mensaje);
                String entrada = sc.nextLine().trim().replace(',', '.');
                valor = Double.parseDouble(entrada);
                if (valor >= min && valor <= max) {
                    v = false;
                } else {
                    System.out.println(ROJO+"Error: La nota debe estar entre " + min + " y " + max +RESET);
                }
            } catch (NumberFormatException var9) {
                System.out.println( ROJO+"Debes introducir un número decimal válido"+RESET);
            }
        }

        return valor;
    }

    // validadores de 1ra opcion ¿SOCIO MATRICULADO?
    private static boolean pedirBooleanoMatricula(String mensaje) {
        while(true) {
            System.out.println(mensaje);
            String valor = sc.nextLine().trim().toLowerCase();
            if (valor.equals("true")) {
                return true;
            }

            if (valor.equals("false")) {
                return false;
            }

            System.out.println(ROJO+"Error: Debe escribir exactamente true o false"+RESET);
        }
    }







    static {
        sc = new Scanner(System.in);
    }

}