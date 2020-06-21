
package teste;

/**
 *
 * @author engenheiro
 */
public class Jogador {
    //Atributos
    private char simbolo;
    
    private String nome;
    private boolean jogaAgora;
    private int quantasVezesJogou;
    
    //Construtor
    public Jogador(String nome) {
        this.nome = nome;
        this.jogaAgora = false;
        this.quantasVezesJogou = 0;
    }
    
    //Setters e getters
    public char getSimbolo() {
        return simbolo;
    }
    public void setSimbolo(char opcaoDoUsuario) {
        this.simbolo = opcaoDoUsuario;
    }

    public boolean isJogaAgora() {
        return jogaAgora;
    }
    public void setJogaAgora(boolean jogaAgora) {
        this.jogaAgora = jogaAgora;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantasVezesJogou() {
        return quantasVezesJogou;
    }
    public void setQuantasVezesJogou(int quantasVezesJogou) {
        this.quantasVezesJogou = quantasVezesJogou;
    }

    @Override
    public String toString() {
        return "Jogador {" + "nome = " + nome + ", simbolo = " + simbolo + ", jogaAgora = " 
                           + jogaAgora + ", quantasVezesJogou = " + quantasVezesJogou + "}";
    }
    
    public static int sortearNumeroDoJogador() {
        return (int) (0 + Math.random() * 2);
    }
}
