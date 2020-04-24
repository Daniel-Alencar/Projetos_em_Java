package pacoteaula02;
public class Aula02 {
    public static void main(String args[]) {
        Caneta caneta = new Caneta();
        Caneta caneta1 = new Caneta();
        
        caneta.cor = "Azul";
        caneta.carga = 75;
        caneta.modelo = "model789";
        caneta.ponta = 0.7f;
        caneta.destampar();
        
        caneta1.cor = "Vermelha";
        caneta1.carga = 50;
        caneta1.modelo = "model2020";
        caneta1.ponta = 0.5f;
        caneta1.tampar();
        

        caneta.status();
        caneta1.status();
    }
}