package pacoteaula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status()
    {
        System.out.println("A caneta é: " + this.cor);
        System.out.println("A caneta está tampada? " + this.tampada);
        System.out.println("Modelo da caneta: " + this.modelo);
        System.out.println("Ponta da caneta: " + this.ponta);
        System.out.println("Carga da caneta: " + this.carga + "%");
        System.out.println("");
    }
    
    void rabiscar(){
        if(this.tampada == true)
            System.out.println("ERRO! Não posso rabiscar");
        else
            System.out.println("Estou rabiscando");
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
