package main.java;

import java.net.URISyntaxException;

final class Main {
    public static void main(String[] args) throws URISyntaxException {
        System.out.println("dossier existant ? " + DossierRessource.dossierExiste());
        DossierRessource.lireContenu();
        System.out.printf("dossier vide ? " + DossierRessource.estVide());
    }
}
