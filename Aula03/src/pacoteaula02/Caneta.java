package pacoteaula02;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status()
    {
        System.out.println("A caneta é: " + this.cor);
        System.out.println("A caneta está tampada? " + this.tampada);
        System.out.println("Modelo da caneta: " + this.modelo);
        System.out.println("Ponta da caneta: " + this.ponta);
        System.out.println("Carga da caneta: " + this.carga + "%");
        System.out.println("");
    }
    
    public void rabiscar(){
        if(this.tampada == true)
            System.out.println("ERRO! Não posso rabiscar");
        else
            System.out.println("Estou rabiscando");
    }
    protected void tampar(){
        this.tampada = true;
    }
    protected void destampar(){
        this.tampada = false;
    }
}
