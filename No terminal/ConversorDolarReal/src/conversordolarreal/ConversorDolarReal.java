/*************************************************************************
 *    Programa que:
 *    - Leia a cotação do dólar
 *    - Leia um valor em dólares
 *    - Converta esse valor para Real
 *    - Mostre o resultado
 *
 *************************************************************************/
package conversordolarreal;

import java.util.Scanner;

/**
 *
 * @author engenheiro
 */
public class ConversorDolarReal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cotacaoDolar, valorDolar, valorReal;
        
        System.out.print("Digite a cotação do dólar: ");
        cotacaoDolar = entrada.nextDouble();
        System.out.print("Digite o valor em dólar: ");
        valorDolar = entrada.nextDouble();
        
        valorReal = cotacaoDolar *  valorDolar;
        System.out.println("O valor em reais é: " + valorReal);
    }
    
}
