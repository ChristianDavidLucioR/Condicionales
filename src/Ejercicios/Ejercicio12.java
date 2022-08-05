package Ejercicios;

import javax.swing.*;

/*
Hacer un programa que pida una nota de 0 a 10 y mostrarla de la siguiente forma:
-Insuficiente, Aceptable, Sobresaliente, Excelente.
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        String nombre;
        byte nota;

        nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
        nota = Byte.parseByte(JOptionPane.showInputDialog("Ingrese del 0 al 10 la nota del estudiante"));

        switch (nota) {
            case '0', '1', '2', '3' -> JOptionPane.showMessageDialog(null, "El estudiante: " + nombre +
                    ", con la calificación: " + nota + "\nObtuvo una nota Insuficiente");
            case '4', '5', '6' -> JOptionPane.showMessageDialog(null, "El estudiante: " + nombre +
                    ", Con la calificación: " + nota + "\nObtuvo una nota Aceptable");
            case '7', '8', '9' -> JOptionPane.showMessageDialog(null, "El estudiante: " + nombre +
                    ", Con la calificación: " + nota + "\nObtuvo una nota Sobresaliente");
            case 10 -> JOptionPane.showMessageDialog(null, "El estudiante: " + nombre +
                    ", Con la calificación: " + nota + "\nObtuvo una nota Excelente");
            default -> JOptionPane.showMessageDialog(null, "El número ingresado: " + nota +
                    " es incorrecto");
        }
    }
}
