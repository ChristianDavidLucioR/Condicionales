package Ejercicios;

import javax.swing.*;

/*
Hacer un programa que pase de Kg a otra unidad de medida de masa, mostrar en pantalla un menú con las opciones disponibles.
 */
public class Ejercicio14 {

    public static void main(String[] args) {

        float masa;
        byte opciones;

        masa = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la cantidad de Kilogramos"));
        opciones = Byte.parseByte(JOptionPane.showInputDialog(null, """
                Menú de opciones, Ingresa la opción disponible
                1: Hectogramos
                2: Decagramos
                3: Gramos
                4: Decigramos
                5: Centigramos
                6: Miligramos"""));
        switch (opciones) {
            case 1 -> {
                masa *= 10;
                JOptionPane.showMessageDialog(null, "La nueva medida es:\n" + masa + " Hectogramos");
            }
            case 2 -> {
                masa *= 100;
                JOptionPane.showMessageDialog(null, "La nueva medida es:\n" + masa + " Decagramos");
            }
            case 3 -> {
                masa *= 1000;
                JOptionPane.showMessageDialog(null, "La nueva medida es:\n" + masa + " Gramos");
            }
            case 4 -> {
                masa *= 10000;
                JOptionPane.showMessageDialog(null, "La nueva medida es:\n" + masa + " Decigramos");
            }
            case 5 -> {
                masa *= 100000;
                JOptionPane.showMessageDialog(null, "La nueva medida es:\n" + masa + " Centigramos");
            }
            case 6 -> {
                masa *= 1000000;
                JOptionPane.showMessageDialog(null, "La nueva medida es:\n" + masa + " Miligramos");
            }
            default -> JOptionPane.showMessageDialog(null, "El numero: " + opciones + " No esta disponible");
        }
    }
}
