package pacoteaula02;
public class Aula03 {
    public static void main(String args[]) {
        Caneta caneta = new Caneta();
        
        caneta.modelo = "Compactar";
        caneta.cor = "Azul";
        
        /*
            caneta.ponta = 0.5f;
            Este atributo é privado
        */
        caneta.carga = 80;
        
        /*
            caneta.tampada = false;
            Este atributo é privado
        */
        /*
            Estes atributos são protegidos, podem ser utilizados aqui já que temos dentro dessa
            classe uma criação de um objeto da classe que tem o atributo mencionado
        */
        
        caneta.tampar();
        caneta.destampar();
        /*
            Apesar do acesso ao atributo estar privado, eu posso indiretamente mudá-lo através 
            dos métodos que o utilizam na classe Aula03 (pois eles são públicos ou protegidos)
        */ 
        caneta.rabiscar();
    }
}