package listaoperadores;

import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        /* PEÇA AO USUÁRIO INSERIR A TEMPERATURA EM °C E IMPRIMA A TEMPERATURA
        EM °F*/
        Scanner teclado = new Scanner(System.in);
        
        float tempCelsius;
        float tempFahrenheit;
        
        System.out.print("Insira uma temperatura em graus Celsius: ");
        tempCelsius = teclado.nextFloat();
        
        tempFahrenheit = tempCelsius * 9.0f/5.0f + 32;
        
        System.out.printf("%.2f graus Celsius = %.2f graus Fahrenheit \n",
                tempCelsius,tempFahrenheit);
        
        teclado.close();
    }
}
