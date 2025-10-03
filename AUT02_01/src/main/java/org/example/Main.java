package org.example;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Boolean salir = true;

        do {

            System.out.print(" === Gestor de Estudiantes === \n" +
                    "1. Añadir estudiante \n"+
                    "2. Listar estudiantes \n"+
                    "3. Buscar por nombre \n"+
                    "4. Calcular nota media general \n"+
                    "5. Mostrar mejor estudiante \n"+
                    "6. Salir \n"+
                    "Seleccione opción: "
            );

            Integer opcion = sc.nextInt();
            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 6:
                    salir = false;
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }



        } while (salir);

        System.out.println("haz salido adios");

        sc.close();

    }
}