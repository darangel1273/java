package JavaBasico;
/**
 * 1.    Escrever um programa java que receba dois números e exiba o resultado da sua soma. 
 * 
 * @author (Rui Pereira) 
 * @version (v1.0 - 14/09/2022)
 */
import java.util.Scanner;  //Programa utiliza a classe Scanner

public class Exerc1 {
    
    public static void main( String[] args){
        
        Scanner input = new Scanner(System.in );
        int number1; //primeiro número a adicionar
        int number2; //segundo número a adicionar 
        int sum; //soma de number1 e number2

        System.out.print( " Digite o primeiro numero: "); //prompt fornecido pelo utilizador
        number1= input.nextInt(); //espera o primeiro número

        System.out.print( "Digite o segundo numero: "); //prompt fornecido pelo utilizador
        number2 = input.nextInt(); //espera o segundo número
        
        sum = number1 + number2; //soma os números e armazena o total
        
        System.out.printf("O resultado é %i \n " + sum); //exibe o resultado da soma
        
        System.out.print( " Digite outro numero: "); //prompt fornecido pelo utilizador
        number1= input.nextInt(); //espera o primeiro número
        System.gc();
    }
}