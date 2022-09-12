package listaoperadores;
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        int primeiro = teclado.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        int segundo = teclado.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int terceiro = teclado.nextInt();
        
        int soma = primeiro + segundo + terceiro;
        System.out.printf("%d + %d + %d = %d \n",
                primeiro, segundo, terceiro, soma);
        
        teclado.close();
    }
}
