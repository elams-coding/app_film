import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws Exception {
        methodeNomFichier1("C:\\Users\\elams\\workspace\\app_films\\resources");
        methodeNomFichier2("C:\\Users\\elams\\workspace\\app_films\\resources");
    }

    public static void methodeNomFichier1(String chemin) throws IOException {
        Path dossier = Paths.get(chemin);

        DirectoryStream<Path> stream = Files.newDirectoryStream(dossier);
        for (Path entry : stream) {
            System.out.println(entry.getFileName());
        }
    }

    public static void methodeNomFichier2(String chemin) throws IOException {

    }
}
