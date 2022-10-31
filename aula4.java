import javax.swing.*;

public class aula4 {

    public static void main (String entrada[]){

        int num;
        String msg="";
        char op=0;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para o calculo"));
        op = JOptionPane.showInputDialog("Op 1: For \n Op 2: While \n Op 3: Do/While").charAt(0);

        switch(op){
            case '1':
            {
            for(int i = 1; i <=10; i = i + 1){
                msg = msg + num + " x " + i + " = " + (num * i) + "\n";
            }
            break;
            }
            case '2':
            {
            int i = 1;
            while(i <=10){
                msg = msg + num + " x " + i + " = " + (num * i) + "\n";
                i = i + 1;
            }
            }
            break;

            case '3':
            {
                int i = 1;
                do{
                    msg = msg + num + " x " + i + " = " + (num * i) + "\n";
                    i = i + 1;
                }while(i <= 10);
            }
            break;
            
            default: JOptionPane.showMessageDialog(null, "Opcao invalida, calculos nao realizados");
        }
        if(op >= '1' || op <= '3'){
        JOptionPane.showMessageDialog(null, msg);
        }
    }

}
