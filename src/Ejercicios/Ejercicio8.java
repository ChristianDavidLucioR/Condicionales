package Ejercicios;

import javax.swing.*;

/*
PEDIR UN NÚMERO ENTRE 0 Y 99 999 Y DECIR CUANTAS CIFRAS TIENE
 */
public class Ejercicio8 {

    public static void main(String[] args) {

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog(null, """
                Ingrese el numero para calcular las cifras
                debe de estar entre 0 y 99.999\s
                No utilices ni puntos, ni comas"""));

        if (numero < 10){
            JOptionPane.showMessageDialog(null,"El número ingresado es: " +numero+ "\nY tiene 1 cifra");

        } else if (numero <100) {
            JOptionPane.showMessageDialog(null,"El número ingresado es: " +numero+ "\nY tiene 2 cifras");

        } else if (numero <1000) {
            JOptionPane.showMessageDialog(null,"El número ingresado es: " +numero+ "\nY tiene 3 cifras");

        } else if (numero <10000) {
            JOptionPane.showMessageDialog(null,"El número ingresado es: " +numero+ "\nY tiene 4 cifras");

        } else if (numero <100000) {
            JOptionPane.showMessageDialog(null,"El número ingresado es: " +numero+ "\nY tiene 5 cifras");

        }else {
            JOptionPane.showMessageDialog(null,"El número ingresado supera el rango");
        }
    }
}
