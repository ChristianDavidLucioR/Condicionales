package Ejercicios;

import javax.swing.*;

/*
HACER UN PROGRAMA QUE PIDA TRES NUMEROS Y MOSTRARLOS ORDENADOS DE MAYOR A MENOR
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        double numero1, numero2, numero3;

        numero1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el número uno"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el número dos"));
        numero3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el número tres"));

        if ((numero1 >numero2) && (numero2>numero3)){
            JOptionPane.showMessageDialog(null,"El orden es: "+numero1+" - "+numero2+" - "+numero3);

        } else if ((numero1>numero3) && (numero3> numero2)) {
            JOptionPane.showMessageDialog(null,"El orden es: "+numero1+" - "+numero3+" - "+numero2);
            
        } else if ((numero2>numero1) && (numero1>numero3)) {
            JOptionPane.showMessageDialog(null,"El orden es: "+numero2+" - "+numero1+" - "+numero3);

        } else if ((numero2>numero3) && (numero3>numero1)) {
            JOptionPane.showMessageDialog(null,"El orden es: "+numero2+" - "+numero3+" - "+numero1);

        } else if ((numero3 >numero1) && (numero1>numero2)) {
            JOptionPane.showMessageDialog(null,"El orden es: "+numero3+" - "+numero1+" - "+numero2);

        }else
            JOptionPane.showMessageDialog(null,"El orden es: "+numero3+" - "+numero2+" - "+numero1);

    }
}
