import javax.swing.*;

/*
Switch (dato) {
    case 1: Instrucción1;
    break;

    case 2: Instrucció2;
    break;

    default: contrario;
    break;
}
 */
public class CondicionalSwitch {

    public static void main(String[] args) {

        int dato;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        switch (dato){

            case 1: JOptionPane.showMessageDialog(null, "Este es el caso #1");
            break;

            case 2:JOptionPane.showMessageDialog(null, "Este es el caso #2");
            break;

            case 3: JOptionPane.showMessageDialog(null, "Este es el caso #3");
            break;

            case 4: JOptionPane.showMessageDialog(null, "Este es el caso #4");
            break;

            case 5: JOptionPane.showMessageDialog(null, "Este es el caso #5");
            break;

            default: JOptionPane.showMessageDialog(null, "El numero no esta en la lista");
            break;
        }
    }
}
