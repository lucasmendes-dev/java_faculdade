import javax.swing.*;

class aula2_exercicio {

    public static void main (String entrada[])
    {
        int n1, n2, div;
        double pot;
        String msg="";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número"));

        div = (int)n1 / (int)n2;
        pot = Math.pow(n1, n2);

        msg = "Resto da divisão de" + n1 + " / " + n2 + " = " + div + "\n";
        msg = msg + "A potenciação de " + n1 + " e " + n2 + " = " + pot + "\n";
        JOptionPane.showMessageDialog(null, msg);
        
        System.exit(0);
    }
}
