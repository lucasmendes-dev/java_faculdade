import javax.swing.*;

public class aula6_exercicio {
    
    public static void soma (int vetor[]){
        
        int soma = 0;
        for(int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }
        JOptionPane.showMessageDialog(null, "A somatoria eh: " + soma);
    }
    
    public static int produto (int vetor[]){

        int p = 1;

        for(int i = 0; i < vetor.length; i++){
            
            p *= vetor[i];
        }

        return p;
    }
    
       
    public static void main (String entrada[]){
        
        int prod;
        int vet1[] = {3, 5, 8, 13, 21};
        int vet2[] = {1, 2, 4, 6, 8};

        soma(vet1);
        prod = produto(vet2);
        JOptionPane.showMessageDialog(null, "A produtoria eh: " + prod);
        
        System.exit(0);
    }
}
