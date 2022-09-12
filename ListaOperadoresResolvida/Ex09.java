package listaoperadores;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
            /*FAÇA UM PROGRAMA QUE CALCULA A ÁREA DE UMA CIRCUNFERÊNCIA COM
        PRECISÃO DE 2 CASAS DECIMAIS*/
            Scanner teclado = new Scanner(System.in);
            float raio;
            final double PI = Math.PI;
            
            System.out.print("Entre com um raio: ");
            raio = teclado.nextFloat();
            
            float area = (float) (PI * Math.pow(raio, 2));
            System.out.printf("The area is %.2f \n", area);
            
            teclado.close();
    }

}
