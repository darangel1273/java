package JavaBasico;

/**
 * Introduzir dois números e imprimi-los por ordem decrescente (suponha números diferentes). 
 * 
 * @author (Ruin Prier) 
 * @version (v1.0 - 14/09/2022)
 */
import java.util.Scanner; 
public class Exerc14{
    public static void main (String args[]){
        Scanner input = new Scanner (System.in);
        int x,y;
        System.out.print(" Digite um número: ");
        x = input.nextInt();
        System.out.print(" Digite um numero diferente do primeiro:");
        y = input.nextInt();
        if ( x > y ){
            System.out.println( x + " " + y );
        }else{ if ( x < y ) {
                System.out.print ( y + " " + x );
            }
        }
    }
}