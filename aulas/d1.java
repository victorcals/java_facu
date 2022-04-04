
import java.util.Scanner;

public class d1 {
    //atributos

    //metodos
    public static void main(String[] args) {
        int mes;
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite o mes"); 
        mes = teclado.nextInt();
        System.out.println("mes (if) =" + mostrarmesIf(mes)); 
        System.out.println("MES (SWITCH)" + mostrarMesSw(mes));
        
        teclado.close();
    }
    
        

        public static String mostrarmesIf( int mes) {
           String nomemes = " ";
        
    

        if (mes == 1){
            nomemes = ("Janeiro");
        }

        else if (mes == 2){
            nomemes = ("fevereiro");
        }

        else if (mes == 3){
            nomemes = ("março");
        }

        else
            System.out.println("dezembro");
    
        return nomemes;
    }

    public static String mostrarMesSw( int mes) {
       String nomeSw = " ";
       
       
        switch (mes) {
            case 1:
                nomeSw = "MES ONE";
                break;

            case 2: 
                nomeSw = "MES TWO";
                break;    
        
            default:
                break;
              }
              return nomeSw;
    }
}






