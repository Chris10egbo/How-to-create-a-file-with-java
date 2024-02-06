import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {
    public static void main(String[] args) {

        Path file = Paths.get(".\\CopyCharacters2.java");

        try {
            // create the empty file with default permissions, etc.
            Files.createFile(file);
        } catch (FileAlreadyExistsException x) {
            System.err.format("file named %s" + " already exists%n", file);
        } catch (IOException x) {
            System.err.format("createFile error: %s%n", x);
        }
    }
}
