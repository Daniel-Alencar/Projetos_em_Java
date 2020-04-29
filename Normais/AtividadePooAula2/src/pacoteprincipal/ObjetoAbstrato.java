
package pacoteprincipal;

public class ObjetoAbstrato {       //Amor
    boolean dado;
    boolean recebido;
    int quantTipos;
    
    void status(){
        System.out.println("O amor é dado? " + this.dado);
        System.out.println("o amor é recebido? " + this.recebido);
        System.out.println("Tem " + this.quantTipos + " tipos de amor");
        System.out.printf("\n");
    }
    
    void darAmor(){
        this.dado = true;
    }
    void receberAmor(){
        this.recebido = true;
    }
}
