
package testedetipos;
public class TesteDeTipos {
    public static void main(String[] args) {
        /*
            Se você perceber bem, você encontra um certo padrão nessas conversões...
        */
        
        //As conversões estão funcionando bem...
        
        //De int para String
        int idade = 45;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        //De string para Int
        String valor1 = "30";
        int idade1 = Integer.parseInt(valor1);
        System.out.println(idade1);
        
        //Testando outras conversões...
        
        //De String para Float
        String valor2 = "8.56";
        float idade2 = Float.parseFloat(valor2);
        System.out.println(idade2);
        //De Float para String
        float idade3 = 8.56f;
        String valor3 = Float.toString(idade3);
        System.out.println(valor3);
    }
}
