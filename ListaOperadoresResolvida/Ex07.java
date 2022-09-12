package listaoperadores;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        /* PEÇA AO USUÁRIO INSERIR UM NÚMERO INTEIRO E IMPRIMA SEU ANTECESSOR */    
        Scanner teclado = new Scanner(System.in);
        int numero;       
        
        System.out.print("Insira um numero inteiro: ");
        numero = teclado.nextInt();
        
        System.out.printf("%d eh antecessor de %d \n",numero-1, numero);
        
        teclado.close();
        
    }

}
