package Ejercicios;

import javax.swing.*;

/*
PEDIR EL DIA, AÑO Y AÑO DE UNA FECHA E INDICAR SI LA FECHA ES CORRECTA.
CON MESES DE 28,30 Y 31 DIAS. SIN AÑOS BISIESTOS.
 */
public class Ejercicio10 {

    public static void main(String[] args) {

        short dia,mes,ano;

        dia = Short.parseShort(JOptionPane.showInputDialog(null,"Por favor ingresa el Dia"));
        mes = Short.parseShort(JOptionPane.showInputDialog(null,"Por favor ingresa el Mes"));
        ano = Short.parseShort(JOptionPane.showInputDialog(null,"Por favor ingresa el Año"));

        if ((ano == 0)){
            JOptionPane.showMessageDialog(null,"Fecha incorrecta");

        } else if ((mes == 2) && (dia >= 1 && dia <= 28)) {
            JOptionPane.showMessageDialog(null,"Fecha correcta");
            
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11 && (dia >= 1 && dia <= 30))) {
            JOptionPane.showMessageDialog(null,"Fecha correcta");

        }else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia <= 1 && dia <= 31)){
            JOptionPane.showMessageDialog(null,"Fecha correcta"+mes);
        }else {
            JOptionPane.showMessageDialog(null,"Fecha incorrecta");
        }
    }
}
