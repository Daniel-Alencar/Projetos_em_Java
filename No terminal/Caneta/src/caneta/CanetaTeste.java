
package caneta;

public class CanetaTeste {

    public static void main(String[] args) {
        Caneta bic = new Caneta();
        bic.setMarca("bic");
        bic.setCor("azul");
        bic.setTamanho("10cm");
        
        System.out.println(bic.toString());
    }
    
}