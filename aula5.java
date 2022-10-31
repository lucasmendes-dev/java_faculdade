import javax.swing.*;

public class aula5 {

    public static void main (String entrada[]){

        int n1, n2, multi = 0;
        String msg = "";
        char op=0;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
        op = JOptionPane.showInputDialog("Op 1: Produto de numeros positivos \n Op 2: Produtória do primeiro numero").charAt(0);

        switch(op){
            case '1':
            {
                if(n1 > 0 && n2 > 0){
                    multi = n1 * n2;
                    msg = "O produto de " + n1 + " x " + n2 + " = " + multi;
                }else{
                    JOptionPane.showMessageDialog(null, "Os dois números precisam ser positivos");
                }      

            break;
            }

            case '2':
            {
                multi = 1;
                for(int i = 1; i <= n2; i = i + 1){
  
                    multi = multi * n1;
                }
                msg = "A produtória do número " + n1 + ", feita " + n2 + " vezes = " + multi;
            break;
            }

            default: JOptionPane.showMessageDialog(null, "Opcao invalida, calculos nao realizados");
        }
            
        if(op >= '1' || op <= '2'){
        JOptionPane.showMessageDialog(null, msg);
        }
        
        System.exit(0);
    }
}
