import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
      System.out.print("Informe o primeiro valor lógico (true/false): ");
      boolean val1 = sc.nextBoolean();
      
      System.out.print("Informe o segundo valor lógico (true/false): ");
      boolean val2 = sc.nextBoolean();
      
      boolean resultE = val1 && val2;
      boolean resultOU = val1 || val2;
      
      System.out.println("O resultado do operador 'e' sobre os valores é: " + resultE);
      System.out.println("O resultado do operador 'ou' sobre os valores é: " + resultOU);
      
    }
}

