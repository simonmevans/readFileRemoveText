import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        java.io.File file = new File("listOfNames.txt");
        PrintWriter output = new PrintWriter("listOfNamesCorrected.txt");
        System.out.println("does the file exist " + file.exists());
        Scanner input = new Scanner(file);
        while (input.hasNext()) { 
            String name = input.next();
            if (!(name.compareTo("John")==0)) {
                output.println(name);
                System.out.println(name);
            }
        }
        input.close();
        output.close();
    }
}