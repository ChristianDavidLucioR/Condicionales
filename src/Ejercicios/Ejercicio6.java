package Ejercicios;

import javax.swing.*;

/*
HACER UN PROGRAMA QUE TOME DOS NÚMEROS Y DIGA SI AMBOS SON PARES O IMPARES
 */
public class Ejercicio6 {

    public static void main(String[] args) {

        int numero1, numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el primer número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el segundo número"));

        if ((numero1%2 == 0) && (numero2%2 == 0) ){
            JOptionPane.showMessageDialog(null,"El primer número ingresado es: " +numero1+
                    " y el segundo número ingresado es: "+numero2+ " \nLos dos números son pares");
        } else if ((numero1%2 != 0 && numero2%2 != 0)) {
            JOptionPane.showMessageDialog(null,"El primer número ingresado es: " +numero1+
                    " y el segundo número ingresado es: " +numero2+ " \nLos dos números son impares");
        }else
            JOptionPane.showMessageDialog(null,"El primer número ingresa es: " +numero1+
                    " y el segundo número ingresado es: " +numero2+ " \nLos números ingresados son pares e impares");
    }
}
