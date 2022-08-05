package Ejercicios;

import javax.swing.*;

/*
Hacer un programa que simule un cajero automatico con un saldo inicial de 1000 dolares, con el siguiente menu de opciones:
1:Ingresar dinero a la cuenta
2:Retirar dinero
3:Salir
 */
public class Ejercicio13 {

    public static void main(String[] args) {

        final int saldoI= 1000;
        int saldoT, saldoR;
        byte menu;

        menu = Byte.parseByte(JOptionPane.showInputDialog(null, """
                Bienvenido al menu del cajero\s
                Ingrese la opción del menu\s
                1:Ingresar dinero a la cuenta
                2:Retirar dinero
                3:Salir"""));

        switch (menu){
            case 1 : saldoT = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de dinero que va a guardar"));
                saldoT += saldoI;
            JOptionPane.showMessageDialog(null,"El nuevo saldo disponible es: "+saldoT+ "US");
            break;

            case 2: saldoR = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de dinero para retirar"));

            if (saldoR > saldoI){
                JOptionPane.showMessageDialog(null,"El monto ingresado: "+saldoR+ "US \nSupera el saldo de la cuenta"
                +"\nActualmente cuenta con: "+saldoI+"US");
            }else {
                saldoT = saldoI - saldoR;
                JOptionPane.showMessageDialog(null,"El Nuevo saldo disponible es: "+saldoT+"US");
            }
            break;

            case 3 :break;

            default: JOptionPane.showMessageDialog(null, "El número" +menu+ " es incorrecto");
            break;
        }
    }
}
