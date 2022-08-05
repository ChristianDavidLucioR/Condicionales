package Ejercicios;
/*
Realizar un programa que le pida al usuario el dia, mes, año de una fecha e indicar si la fecha es correcta.
Suponiendo que el mes tenga 30 dias.
 */
import javax.swing.*;

public class Ejercicio9 {

    public static void main(String[] args) {

        short dia,mes,ano;

        dia = Short.parseShort(JOptionPane.showInputDialog(null,"Por favor ingresa el Dia"));
        mes = Short.parseShort(JOptionPane.showInputDialog(null,"Por favor ingresa el Mes"));
        ano = Short.parseShort(JOptionPane.showInputDialog(null,"Por favor ingresa el Año"));

        if ((dia >= 1) && (dia <= 30)) { //VALIDA SI EL DIA ES CORRECTO
            if ((mes >= 1)&& (mes <= 12)){ //VALIDA SI EL MES ES CORRECTO
                if (ano != 0){ //VALIDA SI EL AÑO ES CORRECTO
                    JOptionPane.showMessageDialog(null,"La fecha ingresada es: \nDia: "
                            + dia+ " \nMes: " +mes+ " \nAño: "+ano);
                }
                else {
                    JOptionPane.showMessageDialog(null,"El año ingresado es incorrecto: "+ano
                    +"\nDeber ser mayor a 0");
                }
            }
            else {
                JOptionPane.showMessageDialog(null,"El mes ingresado es: "+mes
                        + "\nDebe ser menor a 12");
            }
        }else {
            JOptionPane.showMessageDialog(null,"El dia ingresado es: "+dia
            + "\nDebe ser menor a 30");
        }
    }
}
