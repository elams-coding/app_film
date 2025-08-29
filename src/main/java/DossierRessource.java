package main.java;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class DossierRessource {
    public static void lireContenu() throws URISyntaxException {
        URL url = DossierRessource.class.getClassLoader().getResource("");

        if (url == null) {
            System.out.println("Dossier introuvable.");
            return;
        }

        if (url.getProtocol().equals("file")) {
            Path path = Paths.get(url.toURI());

            for (File f : Objects.requireNonNull(path.toFile().listFiles())) {
                if (!f.isDirectory()) System.out.println(f.getName());
            }
        }
    }
}
