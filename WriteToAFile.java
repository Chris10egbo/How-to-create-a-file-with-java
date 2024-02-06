import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Writing a file by using Buffered Stream i/o
 */
public class WriteToAFile {

    public static void main(String[] args) {
        Charset charset = Charset.forName("US-ASCII");
        String s = " where is the love dear";
        Path file = Paths.get(".\\Crypto.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(file, charset)) {
            writer.write(s, 0, s.length());
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
}