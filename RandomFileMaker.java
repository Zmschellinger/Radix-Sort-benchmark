import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class RandomFileMaker {

    public static void main(String[] args) {
        File out = new File("numbers10^9.txt");
        FileWriter fw = null;
        int n = 1000000000;
        // Try block: Most stream operations may throw IO exception
        try {
            // Create file writer object
            fw = new FileWriter(out);
            // Wrap the writer with buffered streams
            BufferedWriter writer = new BufferedWriter(fw);
            while (n > 0) {

                int min = 1;
                int max = 999;
                int random_int = (int) Math.floor(Math.random()*(max-min+1)+min);

                int line = random_int;

                writer.write(String.valueOf(line));
                writer.newLine();
                n--;
            }
            // Close the stream
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

}
