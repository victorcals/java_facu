import java.util.Scanner;

class Factorial {

   public static void main(String[] args) {
      int fat;
      Scanner in = new Scanner(System.in);
      System.out.println("Na matemática, a sucessão de Fibonacci (ou sequência de Fibonacci), é uma sequência de números inteiros");
      System.out.println("Digite um numero inteiro:");
      fat = in.nextInt();
      System.out.println("O fatorial é " + verfat(fat));
      in.close();
   }

   public static int verfat(int numero) {
      int fact = 1;
      for (int i = 1; i <= numero; i++) {
         if (numero > 0) {
            fact *= i;
            System.out.println(fact);
         } else if (numero == 0) {
            System.out.println(" = 1");
         } else{
            System.out.println("Inválido");
         }
      }
      return fact;
   }
}