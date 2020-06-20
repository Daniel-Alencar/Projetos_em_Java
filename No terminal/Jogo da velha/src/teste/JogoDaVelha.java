
package teste;
/**
 *
 * @author engenheiro
 */
public class JogoDaVelha {
    
    private static Jogador[] j = new Jogador[2];
    private static GameHelper ajuda = new GameHelper();
    private static char[] tabuleiro = new char[9];
    private static char[] separacoes = new char[11];
    private boolean temGanhador = false;
    private int quantasJogadas = 0;
    private int quantasJogadasNaPartida = 0;
    private int[] posicoesJogadas = new int[9];
    private Jogador ganhador = null;
    private Jogador perdedor = null;
    private int quantasVelhas = 0;
    
    public boolean isTemGanhador() {
        return temGanhador;
    }

    public void setTemGanhador(boolean temGanhador) {
        this.temGanhador = temGanhador;
    }
    
    public int getQuantasJogadas() {
        return quantasJogadas;
    }

    public void setQuantasJogadas(int quantasJogadas) {
        this.quantasJogadas = quantasJogadas;
    }

    public static Jogador[] getJ() {
        return j;
    }

    public static void setJ(Jogador[] j) {
        JogoDaVelha.j = j;
    }

    public static GameHelper getAjuda() {
        return ajuda;
    }

    public static void setAjuda(GameHelper ajuda) {
        JogoDaVelha.ajuda = ajuda;
    }

    public static char[] getTabuleiro() {
        return tabuleiro;
    }

    public static void setTabuleiro(char[] tabuleiro) {
        JogoDaVelha.tabuleiro = tabuleiro;
    }

    public static char[] getSeparacoes() {
        return separacoes;
    }

    public static void setSeparacoes(char[] separacoes) {
        JogoDaVelha.separacoes = separacoes;
    }

    public int[] getPosicoesJogadas() {
        return posicoesJogadas;
    }

    public void setPosicoesJogadas(int[] posicoesJogadas) {
        this.posicoesJogadas = posicoesJogadas;
    }

    public Jogador getGanhador() {
        return ganhador;
    }

    public void setGanhador(Jogador ganhador) {
        this.ganhador = ganhador;
    }

    public Jogador getPerdedor() {
        return perdedor;
    }

    public void setPerdedor(Jogador perdedor) {
        this.perdedor = perdedor;
    }
    
    public static void main(String[] args) {
        JogoDaVelha j1 = new JogoDaVelha();
        
        j1.prepararJogo();
        j1.startGame();
    }

    public int getQuantasVelhas() {
        return quantasVelhas;
    }

    public void setQuantasVelhas(int quantasVelhas) {
        this.quantasVelhas = quantasVelhas;
    }

    public int getQuantasJogadasNaPartida() {
        return quantasJogadasNaPartida;
    }

    public void setQuantasJogadasNaPartida(int quantasJogadasNaPartida) {
        this.quantasJogadasNaPartida = quantasJogadasNaPartida;
    }
    
    public void prepararJogo(){
        System.out.println("Preparando o jogo...");
        this.setTemGanhador(false);
        this.criarPlayers();
        this.prioridadeNoJogo();
        this.escolherSimbolo();
        this.preencherTabuleiroESeparacoes();
        this.zerarPosicoesJogadas();
        System.out.println("QUE COMECEM OS JOGOS...");
    }
    
    public void criarPlayers(){
        System.out.println("Criando player 1 e player 2...");
        j[0] = new Jogador();
        j[1] = new Jogador();
        
        j[0].setNome(ajuda.getUserInput("Nome do Player 1: "));
        j[1].setNome(ajuda.getUserInput("Nome do Player 2: "));
    }
    
    public void prioridadeNoJogo(){
        for(Jogador player: j){
            player.setJogaAgora(false);
        }
        
        int jogaPrimeiro = (int) (0 + Math.random() * 2);
        j[jogaPrimeiro].setJogaAgora(true);
        
        System.out.print("De acordo com a sorte... ");
        System.out.println(j[jogaPrimeiro].getNome() + " joga primeiro.");
    }
    
    public void escolherSimbolo() {
        char aux = 'O';
        
        for(Jogador p: j){
            if(p.isJogaAgora()){
                do{
                    p.setSimbolo(ajuda.getUserInput(p.getNome() + ", escolha X OU O: ").toUpperCase().charAt(0));
                    if(p.getSimbolo() == 'X' || p.getSimbolo() == 'O'){
                        
                        aux = p.getSimbolo();
                        break;
                    }
                } while(true);
                
                System.out.println(p.getNome() + " ficou com " + p.getSimbolo());
                break;
            }
        }
        for(Jogador p: j){
            if(p.isJogaAgora() == false){
                
                if(aux == 'X'){
                    p.setSimbolo('O');
                } else {
                    p.setSimbolo('X');
                }
                System.out.println(p.getNome() + " ficou com " + p.getSimbolo());
                break;
            }
        }
    }
    
    public void preencherTabuleiroESeparacoes(){
        for(int i=0; i<9; i++){
            tabuleiro[i] = ' ';
        }
        for(int i=0; i<11; i++){
            separacoes[i] = '-';
        }
    }
    
    public void zerarPosicoesJogadas(){
        for(int i=0; i<posicoesJogadas.length; i++) {
            posicoesJogadas[i] = -1;
        }
    }
    
    public void startGame(){
        jogar();
    }
    
    public void jogar(){
        for(this.setQuantasJogadasNaPartida(0); !temGanhador; this.setQuantasJogadasNaPartida(this.getQuantasJogadasNaPartida() + 1)) {
            
            Jogador jogador = vezDeJogar();
            amostrarTabuleiro();
            
            int posicaoEscolhida = escolherPosicao(jogador);
            tabuleiro[posicaoEscolhida] = jogador.getSimbolo();
            posicoesJogadas[this.getQuantasJogadas()] = posicaoEscolhida;
            
            jogador.setQuantasVezesJogou(jogador.getQuantasVezesJogou() + 1);
            this.setQuantasJogadas(this.getQuantasJogadas() + 1);
            
            if(jogador.getQuantasVezesJogou() >= 3){
                this.setTemGanhador(verificarSeGanhouOJogo(jogador));
                
                if(temGanhador){
                    Jogador[] players = listarGanhadorEPerderdor();
                    this.setGanhador(players[0]);
                    this.setPerdedor(players[1]);
                }
            }
            if(this.getQuantasJogadas() == 9 && !temGanhador){
                this.darVelha();
            }
            inverterVezDeJogar();
        }
        finalizarJogo();
    }
    
    public void darVelha() {
        this.setQuantasVelhas(this.getQuantasVelhas() + 1);
        
        System.out.println("\n======================================================");
        System.out.println("DEU VELHA. VAMOS MAIS UMA VEZ: ");
        this.setTemGanhador(false);
        this.setQuantasJogadasNaPartida(0);
        
        this.preencherTabuleiroESeparacoes();
        this.zerarPosicoesJogadas();
        System.out.println("======================================================\n");
    }
    
    public Jogador vezDeJogar() {
        for(Jogador p: j) {
            if(p.isJogaAgora()){
                return p;
            }
        }
        return null;
    }
    
    public void amostrarTabuleiro(){
        
        for(int i=0; i<3; i++){
            if((i+1) % 3 == 0){
                System.out.println(" " + tabuleiro[i] + " ");
            } else {
                System.out.print(" " + tabuleiro[i] + " |");
            }
        }
        for(int i=0; i<11; i++){
            System.out.print(separacoes[i]);
        }
        System.out.println("");
        for(int i=3; i<6; i++){
            if((i+1) % 3 == 0){
                System.out.println(" " + tabuleiro[i] + " ");
            } else {
                System.out.print(" " + tabuleiro[i] + " |");
            }
        }
        for(int i=0; i<11; i++){
            System.out.print(separacoes[i]);
        }
        System.out.println("");
        for(int i=6; i<9; i++){
            if((i+1) % 3 == 0){
                System.out.println(" " + tabuleiro[i] + " ");
            } else {
                System.out.print(" " + tabuleiro[i] + " |");
            }
        }
    }
    
    public int escolherPosicao(Jogador jogador) {
        boolean podeSair;
        int posicaoEscolhida;
        do{
            podeSair = true;
            posicaoEscolhida = Integer.parseInt(ajuda.getUserInput(jogador.getNome() + ", escolha uma posição [0, 1, 2, 3, 4, 5, 6, 7 ou 8]: "));

            for(int posicao: posicoesJogadas){
                if(posicaoEscolhida == posicao){
                    podeSair = false;
                    break;
                }
            }
            if(podeSair == true){
                if(posicaoEscolhida < 0 || posicaoEscolhida > 8) {
                    podeSair = false;
                }
            }
        }
        while(!podeSair);
        return posicaoEscolhida;
    }
    
    public boolean verificarSeGanhouOJogo(Jogador jogador) {
        char aux = jogador.getSimbolo();
        
        for(int i=0; i<7; i++){
            if(i % 3 == 0){
                if(tabuleiro[i] == aux && tabuleiro[i+1] == aux && tabuleiro[i+2] == aux){
                    return true;
                }
            }
        }
        for(int i=0; i<3; i++){
            if(i<=2){
                if(tabuleiro[i] == aux && tabuleiro[i+3] == aux && tabuleiro[i+6] == aux){
                    return true;
                }
            }
        }
        if(tabuleiro[0] == aux && tabuleiro[4] == aux && tabuleiro[8] == aux){
            return true;
        }
        return (tabuleiro[2] == aux && tabuleiro[4] == aux && tabuleiro[6] == aux);
    }
    
    public Jogador[] listarGanhadorEPerderdor() {
        int X = 0, O = 0;
        Jogador[] players = new Jogador[2];
        
        for(int i=0; i<7; i++){
            if(i % 3 == 0){
                if(tabuleiro[i] == 'X' && tabuleiro[i+1] == 'X' && tabuleiro[i+2] == 'X'){
                    X++;
                } else {
                    if(tabuleiro[i] == 'O' && tabuleiro[i+1] == 'O' && tabuleiro[i+2] == 'O'){
                        O++;
                    }
                }
            }
        }
        for(int i=0; i<3; i++){
            if(i<=2){
                if(tabuleiro[i] == 'X' && tabuleiro[i+3] == 'X' && tabuleiro[i+6] == 'X'){
                    X++;
                } else {
                    if(tabuleiro[i] == 'O' && tabuleiro[i+3] == 'O' && tabuleiro[i+6] == 'O'){
                        O++;
                    }
                }
            }
        }
        if(tabuleiro[0] == 'X' && tabuleiro[4] == 'X' && tabuleiro[8] == 'X'){
            X++;
        } else {
            if(tabuleiro[0] == 'O' && tabuleiro[4] == 'O' && tabuleiro[8] == 'O'){
                O++;
            }
        }
        if(tabuleiro[2] == 'X' && tabuleiro[4] == 'X' && tabuleiro[6] == 'X'){
            X++;
        } else {
            if(tabuleiro[2] == 'O' && tabuleiro[4] == 'O' && tabuleiro[6] == 'O'){
                O++;
            }
        }
            
        if(X > 0){
            for(int i=0; i<2; i++){
                if(j[i].getSimbolo() == 'X'){
                    players[0] = j[i];
                }
                if(j[i].getSimbolo() == 'O'){
                    players[1] = j[i];
                }
            }
            return players;
        }
        if(O > 0){
            for(int i=0; i<2; i++){
                if(j[i].getSimbolo() == 'O'){
                    players[0] = j[i];
                }
                if(j[i].getSimbolo() == 'X'){
                    players[1] = j[i];
                }
            }
            return players;
        }
        return null;
    }
    
    public void finalizarJogo(){
        System.out.println("\n======================================================\n");
        amostrarTabuleiro();
        
        System.out.println("\nACABOU O JOGO... INFORMAÇÕES DESSA PARTIDA: ");
        System.out.println("Jogadores: " + j[0].getNome() + " e " + j[1].getNome() + ".");
        System.out.println("Total de velhas dadas: " + this.getQuantasVelhas() + ".");
        System.out.println("Total de jogadas: " + quantasJogadas + ".");
        System.out.println("Total de jogadas ne última partida: " + this.getQuantasJogadasNaPartida() + ".\n");
        
        System.out.println(ganhador.getNome() + " VENCEUUUUUU.");
        System.out.println("Jogou um total de " + ganhador.getQuantasVezesJogou() + " vezes.");
        System.out.println("Símbolo " + ganhador.getSimbolo() + ".\n");
        
        System.out.println(perdedor.getNome() + " PERDEUUUUUU.");
        System.out.println("Jogou um total de " + perdedor.getQuantasVezesJogou() + " vezes.");
        System.out.println("Símbolo " + perdedor.getSimbolo() + ".\n");
        
        System.out.println("======================================================");
    }
    
    public void inverterVezDeJogar(){
        for(Jogador p: j) {
            if(p.isJogaAgora()){
                p.setJogaAgora(false);
            } else {
                p.setJogaAgora(true);
            }
        }
    }
    
    public void amostrarPosicoesEscolhidas(){
        System.out.print("Posições escolhidas = ");
        for(int posicao: posicoesJogadas){
            if(posicao != -1){
                System.out.print(posicao + "...");
            }
        }
        System.out.println("");
    }
}
