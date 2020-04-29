package idiomadoso;
import java.util.Locale;

public class IdiomaDoSo {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println("O idioma do sistema é: " + locale.getDisplayLanguage());
    }   
}
