import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResultsReader {
    public static void main(String args[]) {

        String fileName = "/home/paul/IdeaProjects/ProgProj/src/ResultsIn.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
