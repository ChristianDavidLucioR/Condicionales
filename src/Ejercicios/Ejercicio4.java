package Ejercicios;

import javax.swing.*;

/*
EN UN SUPERMERCADO SE HACE EL 20% DE DESCUESTO A LOS CLIENTES CUYA COMPRA SUPERE LOS $300
CUAL SERA LA CANTIDAD QUE PAGA UNA PERSONA POR SU COMPRA?
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        int numero = 20;
        float descuento, compra;

        compra = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el valor de la compra "));


        if (compra >= 300){
            descuento = compra *0.20f;
            compra -= descuento;

            JOptionPane.showMessageDialog(null,"El precio de la factura es: $" +compra+
                    "US, usted ha ahorrado: $" +descuento+ "US" +" con el: "+numero + "% de descuento");
        }else {
            JOptionPane.showMessageDialog(null,"El valor de su compra fue de: $" +compra+
                    " Gracias por comprar en Almacenes S.A");
            JOptionPane.showMessageDialog(null,"Recuerde que por compras superiores ha $300US, obtiene un 20% de descuento");
        }
    }
}
