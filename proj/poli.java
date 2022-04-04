import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;



public class poli {
    public static int [] coef;

    public static void main(String[] args) {

        List<Integer> coefic = new ArrayList<Integer>();
        Scanner in =new Scanner(System.in);


        System.out.println("Qual o grau da função ? ");
        int grau = in.nextInt();
        System.out.println("coloque os coeficientes separados por virgulas ");
        String coe = in.nextLine();
        String coef = in.nextLine();
        System.out.println("Qual o valor de X ?");  
        int X = in.nextInt();

        in.close();

     for(String cof : coef.split(",")) {

        coefic.add(Integer.parseInt(cof));
}

        System.out.println("linha 1: " + Polinomios.CY(grau, coefic, X));

        System.out.println("linha 2: " + Polinomios.CYL(grau, coefic, X));

    }
     public static class Polinomios {
        static double y = 0;
        static double z = 0;

            public static double CY(int grau, List<Integer> coefic, int X) {
    int count = 0;
    for(int i = grau; i >= 0; i--) {
    y += count < coefic.size()? coefic.get(count) * (Math.pow(X, i)) : Math.pow(X, i);
    count++;
    }
            return y;
    }
    
    public static double CYL(int grau, List<Integer> coefic, int X) {

            int count = 0;
            for (int i = grau; i >= 0; i--) {
                if (count < coefic.size() && i != 0) {
                  z += i * (coefic.get(count) * (Math.pow(X, i)));
                  count++;
                } else if (count < coefic.size()) {
                  z += coefic.get(count) * (Math.pow(X, i));
                  count++;
                } else if (i != 0) {
                  z += i * Math.pow(X, i);
                } else {
                  z += Math.pow(X, i);
                }
            z += count < coefic.size()? i * (coefic.get(count) * (Math.pow(X, i))) : i * Math.pow(X, i);
    }
      return z;

  }

}

}