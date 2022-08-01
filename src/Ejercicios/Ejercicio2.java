package Ejercicios;

import javax.swing.*;

/*
HACER UN PROGRAMA QUE PIDA 2 NUMEROS Y DECIR CUAL ES EL MAYOR O SI SON IGUALES
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        int numero, numero2;

        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo número"));

        if (numero > numero2){
            JOptionPane.showMessageDialog(null,"El número "+numero+" es mayor al numero "+numero2);
        }
        if (numero == numero2) {
            JOptionPane.showMessageDialog(null,"Ambos numeros son iguales");
        }
        if (numero < numero2) {
            JOptionPane.showMessageDialog(null,"El numero "+numero2+" es mayor al numero "+numero);
        }
    }
}
