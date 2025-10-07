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

    public static List<Estudiante> buscarPorNombre(String nombreBuscar) {

        List<Estudiante> encontrados = new ArrayList();

        for(Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equalsIgnoreCase(nombreBuscar) || estudiante.getNombre().contains(nombreBuscar)) {
                encontrados.add(estudiante);
            }
        }

        return encontrados;
    }



}
