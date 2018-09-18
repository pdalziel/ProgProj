import java.io.*;
import java.util.*;

public class ResultsWriter {

    public void writeResults(ArrayList list){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("ResultsOut.txt"));
            for (Object result  : list) {
                writer.write(result.toString());
                writer.newLine();
            }
            writer.close();
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
