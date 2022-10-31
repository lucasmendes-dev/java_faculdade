import javax.swing.*;

public class matrizes {
    public static void main(String entrada[]){
       
        int vetor[] = {2, 4, 6, 8, 10};
        int matriz[][] = new int [2][3];
        String msg= "";
        String outro="";

        for(int i = 0; i < vetor.length; i++){
            msg = msg + vetor[i] + ", ";

        }
        JOptionPane.showMessageDialog(null, msg);


        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a posição " + i + " e " + j));
                outro = outro + matriz[i][j];
            }
            outro = outro + "\n";
        }
        JOptionPane.showMessageDialog(null, outro);
        System.exit(0);
    }
}
