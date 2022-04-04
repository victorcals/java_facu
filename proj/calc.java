import java.util.Scanner;

public class calc {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         double x;
         double y;
         int rep;
         double num;
        System.out.println("Primeiro Valor →");
        x = in.nextDouble();
        System.out.println("Segundo Valor →");
        y = in.nextDouble();
        System.out.println("#1= SOMA  #2= SUB #3= MULT #4= DIV");
        rep = in.nextInt();
        in.close();
        num = operacao(x, y, rep); 
        System.out.println("O resultado da sua operação é =" +num);
    }


    public static double operacao(double x, double y, int rep) {
        double num = 0;
		
		switch (rep) {
			case 1:
				num = x + y;
				break;
				
			case 2:
				num = x - y;
				break;

			case 3:
				num = x * y;
				break;
			
			case 4:
				 num = x / y;
				break;
						
			default:
				break;}
		return (num);
    }
}