/**
 * Created by Oleg on 09.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("jdbc:mysql://localhost/mydb");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        }
    }
}
