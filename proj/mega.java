
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class mega {



  public static int [] usuario;

  public static int [] sorteio;



  public static void main(String[] args) {

    usuario = new int [6];
    sorteio = sorteio();
    usuario = usuario();

    System.out.println("Números da mega sena" + Arrays.toString(sorteio));
    System.out.println("Números colocados pelo jogador" + Arrays.toString(usuario));
    
    acertos();
  }



  public static int [] usuario(){
    Scanner in = new Scanner(System.in);
    int num;
    usuario = new int [6];
  
    for(int i = 0; i < 6; i++){
        do {

        System.out.println("Informe a jogada "+(i+1)+": ");
        num = in.nextInt();

      } while(num < 0 && num > 60);

      usuario [i] = num;

    }

    in.close();
    return usuario;

  }



  public static int [] sorteio(){

    int sort;

    sorteio = new int [6];

    Random rand = new Random();

    sort = 1 + rand.nextInt(60);

    for(int i = 0; i < 6; i++){

      sort = 1 + rand.nextInt(60);

      sorteio [i] = sort;

    }

    return sorteio;

  }



  public static void acertos(){

    int acerto = 0;

    for(int i = 0; i < usuario.length; i++){

      for (int j = 0; j < usuario.length; j++){

        if(usuario [i] == sorteio[j]){

        acerto++;

        }

      }

    }

    switch (acerto) {
      case 1:
      System.out.println("Acertou alguns  ");

        break;

        case 2:
        System.out.println(" GANHOU R$ 50.000,00");

        break;

        case 3:
        System.out.println(" GANHOU R$ 250.000,00");

        break;

        case 4:
        System.out.println("GANHOU R$ 1.000.000,00");

        break;
    
      default:
        break;
    }

  }

}