
package teste;
import java.io.*;

/**
 *
 * @author engenheiro
 */
public class GameHelper {
    
    //Métodos
    public String getUserInput(String prompt){
        //Pegar a entrada do usuário
        
        String inputLine = null;
        System.out.print(prompt);
        try
        {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0){
                return null;
            }
        } catch(IOException erro) {
            System.out.println("IOException: " + erro);
        }
        return inputLine;
    }
}
