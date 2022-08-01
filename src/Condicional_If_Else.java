import javax.swing.*;

/*
ESTRUCTURA DEL IF ELSE

if (condicional){
  Instrucción1;
  else {
  Instrucción2;
 }
}
 */

public class Condicional_If_Else {

    public static void main(String[] args) {

        int numero, dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));

        if (numero == dato){
            JOptionPane.showMessageDialog(null, "El numero es: "+numero);
        }else {
            JOptionPane.showMessageDialog(null, "El numero es distinto a: "+dato);
        }
    }
}
