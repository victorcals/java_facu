
import java.util.Random;

public class rand {
    public static void main(String[] args) {
        Random rand = new Random();
        int c = 1;
        int num;
        double media;
        long soma = 0;
        while (c <= 1000) {
            num = 1 + rand.nextInt(100);
            soma += num;
            System.out.println(num);
            c++;
            
        }
        media = soma /1000.0d;
        System.out.println(media + " oi");
    }
}