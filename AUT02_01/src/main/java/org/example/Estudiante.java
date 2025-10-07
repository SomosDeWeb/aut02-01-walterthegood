package org.example;

public class Estudiante {

        private String nombre;
        private int edad;
        private double notaMedia;
        private boolean matriculado;

        public String getNombre() {
            return this.nombre;
        }
        public int getEdad() {
            return this.edad;
        }
        public double getNotaMedia() {
            return this.notaMedia;
        }
        public boolean isMatriculado() {
            return this.matriculado;
        }

        public void setNombre(String nombre) {
            if (nombre != null && !nombre.trim().isEmpty()) {
                this.nombre = nombre;
            }

        }
        public void setEdad(int edad) {
            if (edad >= 1 && edad <= 100) {
                this.edad = edad;
            }

        }

        public void setNotaMedia(double notaMedia) {
            if (notaMedia >= (double)0.0F && notaMedia <= (double)10.0F) {
                this.notaMedia = notaMedia;
            }

        }
        public void setMatriculado(boolean matriculado) {
            this.matriculado = matriculado;
        }


}
