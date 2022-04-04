

import java.util.Random;
import java.util.Scanner;

public class jogo {
    public static void main (String[] args) {
        int x, y, tentativas = 10;
        Scanner in = new Scanner(System.in);
        Random dado = new Random();
      

        x = dado.nextInt(100);

        System.out.println("Digite um número: ");
        do {
            String n = "";
            y = in.nextInt();

            if (x > y) {
                n = " \n\nta indo bem, porem o numero sorteado é maior \n\n";
            }
            else if (x < y) {
                n = "\n\nta indo bem, porem o numero sorteado é menor\n\n";
            }
            else if (x == y) {
                n = "Você acertou!";
            }
            System.out.println("Você tem " + tentativas + " tentativas");
            tentativas--;
            System.out.println(n);
        } while (tentativas > 0);

        if (tentativas == 0) {
           System.out.println("Tente novamente mais tarde");
        }

        in.close();
    }
}
