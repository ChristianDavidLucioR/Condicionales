package Ejercicios;

import javax.swing.*;

/*
CONSTRUIR UN PROGRAMA QUE SIMULE EL FUNCIONAMIENTO DE UNA CALCULADORA QUE PUEDA REALIZAR LAS CUATRO OPERACIONES
ARITMÉTICAS BÁSICAS (SUMA, RESTA, PRODUCTO Y DIVISIÓN). CON VALORES NÚMERICOS ENTEROS.
EL USUARIO DEBE ESPECIFICAR LA OPERACIÓN CON EL PRIMER CARÁCTER DEL PRIMER PARÁMETRO DE LÍNEA DE COMANDOS:
S O s LA SUMA, R O r PARA LA RESTA, P, p, M o m PARA EL PRODUCTO Y D O d PARA LA DIVISIÓN.
 */
public class Ejercicio11 {

    public static void main(String[] args) {

        char calculadora;
        int numero1, numero2,suma, resta,
                multiplicacion, divicion;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor ingrese el numero uno para la " +
                "operación"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor ingrese el número dos para la " +
                "operación"));

        calculadora = JOptionPane.showInputDialog(null,"Ingrese el nombre de la operación que desea realizar ").charAt(0);

        switch (calculadora) {
            case 's', 'S' -> {
                suma = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "La suma de: " + numero1 + " + " + numero2 + "\nTiene como resultado: " + suma);
            }
            case 'r', 'R' -> {
                resta = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "La resta de: " + numero1 + " - " + numero2 + "\nTiene como resultado: " + resta);
            }
            case 'M', 'm', 'P', 'p' -> {
                multiplicacion = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "La multiplicación de: " + numero1 + " * " + numero2 + "\nTiene como resultado: " + multiplicacion);
            }
            case 'D', 'd' -> {
                divicion = numero1 / numero2;
                JOptionPane.showMessageDialog(null, "La divición de: " + numero1 + " ÷ " + numero2 + "\nTiene como resultado: " + divicion);
            }
            default -> JOptionPane.showMessageDialog(null, "Error, no existe la operación ingresada");
        }
    }
}
