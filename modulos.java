import javax.swing.*;

public class modulos {
    public static void soma (){
        
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero para soma: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero para soma: "));

        JOptionPane.showMessageDialog(null, "A soma é: " + (n1 + n2));

    }

    public static void subtracao (int x, int y){
        int s;

        s = x - y;
        JOptionPane.showMessageDialog(null, "A subtração é: " + s);

    }

    public static int produto(){
        
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero para multiplicacao: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero para multiplicacao: "));

        return n1 * n2;
    }

    public static double divisao(int x, int y){

        double d;

        d = (double)x / (double)y ;
        return d;

    }

    

    public static void main (String entrada[]){

        int n1, n2, s;
        double r;
        
        soma();

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para subtracao:\n Será feito divisao também "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro numero para subtracao: \n Será feito divisao também "));

        subtracao(n1, n2);

        s = produto();
        JOptionPane.showMessageDialog(null, "O produto é: " + s);

        r = divisao(n1, n2);
        JOptionPane.showMessageDialog(null, "A divisao é: " + r);
        
        System.exit(0);
    }
}
