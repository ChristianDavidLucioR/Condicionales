package Ejercicios;

/*
REALIZAR UN PROGRAMA QUE LEA UN CARACTER POR TECLADO Y COMPRUEBE SI ES UNA LETRA MAYUSCULA
 */

import javax.swing.*;

public class Ejercicio3 {

    public static void main(String[] args) {

        char letra;

        letra = JOptionPane.showInputDialog(null,"Ingrese la letra para validar").charAt(0);

        if (Character.isUpperCase(letra)){ // PERMITE VALIDAR SI LA PRIMERA LETRA ES MAYUSCULA
            JOptionPane.showMessageDialog(null,"la letra ´"+letra+ "´ es una letra mayuscula");
        }else {
            JOptionPane.showMessageDialog(null,"la letra ´"+letra+ "´ es una letra minuscula");
        }
    }
}
