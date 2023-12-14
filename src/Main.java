import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();

        try {
            FileReader fr = new FileReader("people.txt");

            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            br.close();
            fr.close();
        } catch (IOException ex) {
            System.out.println("Error");
            ex.printStackTrace();
        }
        System.out.println(lines);
    }
}