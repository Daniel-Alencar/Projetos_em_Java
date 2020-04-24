
package resolucaodoso;
import java.awt.Toolkit;
import java.awt.Dimension;

public class ResolucaoDoSo {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do sistema é: " + d.width + " X " + d.height);
    }
    
}
