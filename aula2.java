public class aula2 {
    public static void main(String entrada[])
    {
    double raiz, pot;
    int Num1, Num2, mod, quo;
    
    Num1 = Integer.parseInt(entrada[0]);
    Num2 = Integer.parseInt(entrada[1]);
    
    mod = Num1 % Num2;
    quo = Num1 / Num2;
    raiz = Math.sqrt(Num1);
    pot = Math.pow(Num1, Num2);
    
    
    System.out.println("O resto da divisão de " + Num1 + " % " + Num2 + " = " + mod);
    System.out.println("O quociente da divisão de " + Num1 + " / " + Num2 + " = " + quo);
    System.out.println("A raiz quadrada de " + Num1 + " = " + raiz);
    System.out.println("A potenciação de  " + Num1 + " elevado à " + Num2 + " = " + pot);
   
    System.exit(0);
 } 
}
