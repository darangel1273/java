package JavaBasico;
/**
 * Escrever um programa que leia o nome de um aluno e as notas das três
 * provas que ele obteve no semestre. 
 * No final informar o nome do aluno e a sua media (aritmética). MEDIA = (nota1 + nota2 + nota3) / 3
 * 
 * @author (Ruin-Prier) 
 * @version (v1.0 -14/09/2022)
 */
import java.util.Scanner; 
public class Exerc5{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);

        String nomeAluno; 
        double notal;
        double nota2; 
        double nota3; 
        double mediaFinal;

        System.out.print("Digite o nome do aluno:");
        nomeAluno = input.nextLine();

        System.out.print("Digite a nota da primeira prova:");
        notal = input.nextDouble();

        System.out.print("Digite a nota da segunda prova:"); 
        nota2 = input.nextDouble();

        System.out.print("Digite a nota da terceira prova:"); 
        nota3 = input.nextDouble();

        mediaFinal = ( notal + nota2 + nota3 ) / 3;

        System.out.println("Nome  do  aluno:"   + nomeAluno); 
        System.out.println("A media do aluno e:" + mediaFinal);
    }
}
