
package teste;

/**
 *
 * @author engenheiro
 */
public class Jogador {
    //Atributos
    private String nome;
    private char simbolo;
    private boolean jogaAgora;
    private int quantasVezesJogou = 0;
    
    //Métodos
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
}
