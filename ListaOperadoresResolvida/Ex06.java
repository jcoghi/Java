package listaoperadores;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        /* CONVERTER A VELOCIDADE DE km/h PARA m/s */
        Scanner teclado = new Scanner(System.in);
        
        float velocidadeKm;
        float velocidadeM;
        
        System.out.print("Insira uma velocidade em km/h: ");
        velocidadeKm = teclado.nextFloat();
        
        velocidadeM = velocidadeKm / 3.6f;
        
        System.out.printf("%.2f km/h corresponde a %.2f m/s \n",
                velocidadeKm, velocidadeM);
        
        teclado.close();
    }
}
