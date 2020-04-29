package horadosistema;  //Pacote

import java.util.Date;  //Biblioteca immportada

public class HoraDoSistema {    //Classe
    public static void main(String[] args) {    //Método
        Date relogio = new Date();  //Objeto
        System.out.println("A hora do sistema é: ");    //Comando
        System.out.println(relogio.toString()); //Comando
    }
}
