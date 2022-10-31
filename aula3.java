import javax.swing.*;

public class aula3 {
    public static void main (String entrada[]){
        
        int num;
        char op=0;
        String msg = "";

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        op = JOptionPane.showInputDialog("Digite 1 para par/ímpar \n Digite 2 para positivo/negativo").charAt(0);

        switch(op){
            case '1':
            {
                if(num % 2 == 0){
                    msg = "O numero " + num + "é par";
                }else{
                    msg = "O numero " + num + "é ímpar";
                }
                break;
            }
            case '2':
            {
                if(num > 0){
                    msg = "O numero " + num + "é positivo";
                }else{
                    msg = "O numero " + num + "é negativo";
                }
                break;
            }
            default: JOptionPane.showMessageDialog(null, "Opção inválida. Cálculos não realizados.");
        }

        if(op == '1'|| op == '2'){
            JOptionPane.showMessageDialog(null, msg);
        }
        System.exit(0);
    }
}
