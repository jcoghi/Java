package listaoperadores;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        /*PEÇA AO USUÁRIO INSERIR SEU ANO DE NASCIMENTO E IMPRIMA SUA IDADE*/
        Scanner teclado = new Scanner(System.in);
        int anoNascimento;
        
        System.out.print("Insira seu ano de nascimento: ");
        anoNascimento = teclado.nextInt();
        
        int idade = 2022 - anoNascimento;
        System.out.printf("Voce tem %d anos\n", idade);
        
        teclado.close();
    }
    
}
