/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author danie
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 6;
        float media = (n1 + n2)/2f; 
        System.out.printf("A média é: %.2f\n", (n1 + n2)/2f);
        
        
        
        int num = 10;
        int valor = 4 + num++;
        System.out.println(valor);
        System.out.println(num);
        
        int num2 = 10;
        int valor2 = 4 + ++num2;
        System.out.println(valor2);
        System.out.println(num2);
        
        
        
        int x = 4;
        x += 4;     //podia ser: +=, -=, *=, /= e %=.
        System.out.println(x);
        
        
        
        System.out.println(Math.PI);
        System.out.println(Math.pow(5,3));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.cbrt(125.0));
        
        
        
        double aleatorio = Math.random();
        System.out.println(aleatorio);          //Número aleatório gerado entre 0 e 1.
        
        double aleatorio2 = Math.random();
        int n = (int)(3 + aleatorio2 * (16 - 3));   //Número aleatório gerado de 3 a 15.
        System.out.println(n);
    }
    
}
