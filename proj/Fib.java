import java.util.Scanner;

public class Fib {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int rep;
        do{
        System.out.println("Informe o número que deseja operar:");
        n = in.nextInt();
        } while (n < 0);
        in.close();
        rep = fibonacci(n);
        System.out.println("O resultado é: " + rep);
    }

    public static int fibonacci(int n){
        int rep = 0;

        if (n < 2) {

            return n;
        }
        else{
            for (int i = 0; i < n; i++ ) {
                rep = fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
        return rep;
    }

}