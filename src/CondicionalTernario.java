import javax.swing.*;

/*
EL OPERADOR TERNARIO ´?´

VALOR = (condición) ? valor1 : valor2

 */
public class CondicionalTernario {

    public static void main(String[] args) {

        int numero;
        String mensaje;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        mensaje = (numero%2 ==0) ? "Es par" : "Es impar";

        JOptionPane.showMessageDialog(null, "El numero "+numero+" "+mensaje);
    }
}
