package org.example;
import java.util.ArrayList;
import java.util.List;

public class StudiantesController {

    private static final List<Estudiante> estudiantes = new ArrayList();

    public static List<Estudiante> getListaEstudiantes() {
        return estudiantes;
    }

    public static void guardarEstudiante(String nombre, int edad, double nota, boolean matriculado) {
        Estudiante nuevo = new Estudiante();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setNotaMedia(nota);
        nuevo.setMatriculado(matriculado);
        estudiantes.add(nuevo);
    }

    //3era opcion
    public static List<Estudiante> buscarPorNombre(String nombreBuscar) {

        List<Estudiante> encontrados = new ArrayList();

        for(Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equalsIgnoreCase(nombreBuscar) || estudiante.getNombre().contains(nombreBuscar)) {
                encontrados.add(estudiante);
            }
        }

        return encontrados;
    }

    //4ta opcion
    public static double calcularNotaMediaGeneral() {
        if (estudiantes.isEmpty()) {
            return (double)0.0F;
        } else {
            double suma = (double)0.0F;

            for(Estudiante estudiante : estudiantes) {
                suma += estudiante.getNotaMedia();
            }

            return suma / (double)estudiantes.size();
        }
    }

    //5ta opcion
    public static Estudiante getMejorEstudiante() {
        if (estudiantes.isEmpty()) {
            return null;
        } else {
            Estudiante mejorEstudiante = null;
            double notaMaxima = (double)-1.0F;

            for(Estudiante estudiante : estudiantes) {
                if (estudiante.getNotaMedia() > notaMaxima) {
                    notaMaxima = estudiante.getNotaMedia();
                    mejorEstudiante = estudiante;
                }
            }

            return mejorEstudiante;
        }
    }




}
