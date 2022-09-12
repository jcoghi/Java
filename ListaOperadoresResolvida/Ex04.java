package listaoperadores;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        /*FAÇA UM PROGRAMA EM QUE O USUÁRIO DIGITA UMA LETRA E O PROGRAMA
        RETORNA O NÚMERO INTEIRO REFERENTE AQUELE CARACTERE*/
        Scanner teclado = new Scanner(System.in);
        String entrada;
        System.out.print("Digite uma letra: ");
        entrada = teclado.next().trim(); // .trim() para apagar espaços

        int numero = (int) entrada.charAt(0);

        System.out.printf("O numero correspondente a %s: %d \n", entrada, numero);

        teclado.close();
    }
}
