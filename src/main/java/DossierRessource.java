package main.java;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class DossierRessource {
    private static final URL DOSSIER = DossierRessource.class.getClassLoader().getResource("");

    public static void lireContenu() throws URISyntaxException {
        if (!dossierExiste()) {
            return;
        }

        if (DOSSIER.getProtocol().equals("file")) {
            System.out.println("Fichier contenu dans le dossier de ressources :");
            Path path = Paths.get(DOSSIER.toURI());

            for (File f : Objects.requireNonNull(path.toFile().listFiles())) {
                if (!f.isDirectory()) System.out.println(f.getName());
            }
        }
    }

    public static boolean estVide() throws URISyntaxException {
        if (dossierExiste()) {
            Path path = Paths.get(DOSSIER.toURI());

            if (path.toFile().list().length > 0) {
                return false;
            }
        }

        return true;
    }

    /**
     *  Permet de savoir si le chemin existe ou non.
     * @return true si le dossier existe. Sinon retourne false.
     */
    public static boolean dossierExiste() {
        if (DOSSIER == null) {
            System.out.println("Dossier introuvable.");
            return false;
        }

        return true;
    }
}
