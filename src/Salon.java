import java.io.File;

/**
 * @author Matthew Meyer
 */
public class Salon {
    public static void main(String[] args) {
        File data = new File("Salon.db");
        if (data.exists()) {
            SignIn s = new SignIn();
        }
        else {
            Installation i = new Installation();
        }
    }
}
