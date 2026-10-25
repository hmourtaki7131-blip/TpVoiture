
public class TestVoiture {

    public static void main(String[] args) {

        // Test des constructeurs
        System.out.println("=== CREATION DES VOITURES ===");

        Voiture voiture1 = new Voiture();

        Voiture voiture2 =
            new Voiture("Toyota", "Corolla", 0.0, 2023);

        Voiture voiture3 = new Voiture(voiture2);

        voiture1.afficherInformations();
        voiture2.afficherInformations();
        voiture3.afficherInformations();

        // Comparaison des objets
        System.out.println("\n=== COMPARAISON ===");
        System.out.println(
            "voiture1 == voiture2 ? " + (voiture1 == voiture2)
        );
        System.out.println(
            "voiture2 == voiture3 ? " + (voiture2 == voiture3)
        );

        // Acceleration et freinage
        System.out.println("\n=== ACCELERATION ET FREINAGE ===");

        voiture2.accelerer(120);
        voiture2.freiner(30);
        voiture2.afficherInformations();

        voiture3.accelerer(80);
        voiture3.afficherInformations();

        // Test des validations
        System.out.println("\n=== TEST DES VALIDATIONS ===");

        voiture2.setVitesse(-50);
        System.out.println(
            "Vitesse : " + voiture2.getVitesse()
        );

        voiture2.setAnnee(1800);
        System.out.println(
            "Annee : " + voiture2.getAnnee()
        );

        voiture2.setAnnee(2050);

        voiture2.setMarque("");
        System.out.println(
            "Marque : " + voiture2.getMarque()
        );

        voiture2.setMarque(null);

        voiture2.setModele("");

        // Test de vitesse nulle
        System.out.println("\n=== TEST VITESSE NULLE ===");
        voiture2.setVitesse(0);
        System.out.println(
            "Vitesse : " + voiture2.getVitesse()
        );

        // Test d'acceleration negative
        System.out.println("\n=== TEST ACCELERATION NEGATIVE ===");
        voiture2.accelerer(-50);

        // Test de freinage excessif
        System.out.println("\n=== TEST FREINAGE EXCESSIF ===");
        voiture2.setVitesse(20);
        voiture2.freiner(50);

        System.out.println(
            "Vitesse apres freinage : " + voiture2.getVitesse()
        );

        // Affichage final
        System.out.println("\n=== ETAT FINAL ===");
        voiture2.afficherInformations();
        voiture3.afficherInformations();
    }
}

