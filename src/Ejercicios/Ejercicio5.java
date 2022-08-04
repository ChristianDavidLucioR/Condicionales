package Ejercicios;

import javax.swing.*;

/*
UN OBRERO NECESITA CALCULAR SU SALARIO SEMANAL, EL CUAL SE OBTIENE DE LA SIGUIENTE MANERA:
-SI TRABAJA 40 HORAS O MENOS SE LE PAGA $16 POR HORA.
-SI TRABAJA MAS DE 40 HORAS SE LE PAGA $16 POR CADA UNA DE LAS PRIMERAS 40 HORAS Y $20 POR CADA HORA EXTRA.
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        String nombre;
        int hora, salario;

        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del trabajador ");
        hora = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese las horas trabajas de: "+nombre));

        if (hora <= 40){
            hora *= 16;
            salario = hora;

            JOptionPane.showMessageDialog(null,"El trabajador: " +nombre+ " Tiene un salario semanal de: "+salario+"US");
        }else {
            salario = (40*16) + (hora -40)*20; // INGRESAN LAS 40 HORAS * 16 LUEGO LA HORA EXTRA SE MULTIPLICA * 20
            JOptionPane.showMessageDialog(null,"El trabajador: "+nombre+ " Tiene un salario semanal de: "+salario+"US");
        }

    }
}
