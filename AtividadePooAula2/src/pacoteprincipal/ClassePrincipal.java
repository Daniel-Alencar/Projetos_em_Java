
package pacoteprincipal;
public class ClassePrincipal {

    public static void main(String[] args) {
        ObjetoFisico livro = new ObjetoFisico();
        livro.assunto = "Poesia";
        livro.espessura = 0.1f;
        livro.quantPaginas = 163;
        
        livro.abrirLivro();
        livro.status();
        
        ObjetoAbstrato amor = new ObjetoAbstrato();
        amor.quantTipos = 3;
        
        amor.darAmor();
        amor.receberAmor();
        amor.status();
    }
    
}
