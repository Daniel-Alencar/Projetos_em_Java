
package pacoteprincipal;

public class ObjetoFisico {         //LIVRO
    int quantPaginas;
    float espessura;
    String assunto;
    boolean aberto;
    
    void status(){
        System.out.println("O livro tem " + this.quantPaginas + " páginas");
        System.out.println("O livro tem " + this.espessura + " de espessura");
        System.out.println("O livro fala sobre " + this.assunto);
        System.out.println("O livro está aberto? " + this.aberto);
        System.out.printf("\n");
    }
    
    void abrirLivro(){
        this.aberto = true;
    }
    void fecharLivro(){
        this.aberto = false;
    }
    void ler(){
        if(this.aberto == true)
            System.out.printf("Estou lendo...");
        else
            System.out.printf("ERRO! o livro está fechado\nNão posso ler");
    }
}
