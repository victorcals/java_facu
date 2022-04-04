import java.util.Random;
import java.util.Scanner;

public class umacem {

    public static void dica(int palpite, int numero, int tentativas){
        if(palpite > numero){
            System.out.println("O numero escolhido é maior que o numero sorteado");
        } else {
            if(palpite < numero){
                    System.out.println("O numero escolhido é menor que o numero sorteado");
            } else {
                System.out.println("ganhou o numero " + numero);
                System.out.println("Você tentou " + tentativas + " vezes antes de acertar!");
            }
        }
            
    }

    
    public static void main(String[] args) {
        int palpite=0, 
            sorteado, 
            tentativas=10;
        
        Scanner entrada = new Scanner(System.in);
        
        Random geradorDeAleatorios = new Random();
        sorteado = geradorDeAleatorios.nextInt(100) + 1;
        System.out.println("Número entre 1 e 100 sorteado!");
        
        do{
            System.out.printf("\n\n\n\n-----------------\n");
            System.out.println("Número de tentativas: " + tentativas);
            
            System.out.print("Qual seu palpite: ");
            palpite = entrada.nextInt();
            
            tentativas++;
            
            dica(palpite,sorteado, tentativas);
        }while (palpite != sorteado);

        
        entrada.close();
    }

}