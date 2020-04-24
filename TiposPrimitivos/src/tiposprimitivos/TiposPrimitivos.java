/*
Comentários
 */
package tiposprimitivos;
import java.util.Scanner;
/**
 * @author Engenheiro: Daniel Alencar(programador br)
 */
public class TiposPrimitivos {
    public static void main(String[] args) {
        //Mais comentários né
        /*
        float nota1 = 8.5f;
        float nota2 = (float)8.5;
        Float nota3 = new Float(8.5);
        
        String nome1 = "Daniel Alencar";
        String nome2 = (String) "Daniel Alencar";
        String nome3 = new String("Daniel Alencar");
        */
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nome4 = entrada.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota4 = entrada.nextFloat();
        /*
        System.out.printf("A nota é: %.3f\nO nome é: %s\n\n", nota1, nome1);
        System.out.printf("A nota é: %.3f\nO nome é: %s\n\n", nota2, nome2);
        System.out.printf("A nota é: %.3f\nO nome é: %s\n\n", nota3, nome3);
        */
        System.out.format("A nota é: %.3f\nO nome é: %s\n\n", nota4, nome4);
        
        //Podemos utilizar o format em vez de printf
        /*
        System.out.format("A nota é: %.3f\nO nome é: %s\n\n", nota1, nome1);
        System.out.format("A nota é: %.3f\nO nome é: %s\n\n", nota2, nome2);
        System.out.format("A nota é: %.3f\nO nome é: %s\n\n", nota3, nome3);
        
        System.out.format("A nota é: %.3f\nO nome é: %s\n\n", nota4, nome4);
        */
    }
}
/*
Aprendizado:
   *Quando o programa está feito, ele lê números quebrados com a ',' e não com o '.'
*/