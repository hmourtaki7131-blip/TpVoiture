
public class Voiture {

    // 1. Attributs prives
    private String marque;
    private String modele;
    private double vitesse;
    private int annee;

    // 2. Constructeur par defaut
    public Voiture() {
        this.marque = "Inconnue";
        this.modele = "Standard";
        this.vitesse = 0.0;
        this.annee = 2024;

        System.out.println("Constructeur par defaut appele.");
    }

    // 3. Constructeur parametre
    public Voiture(String marque, String modele,
                   double vitesse, int annee) {
        this.marque = "Inconnue";
        this.modele = "Standard";
        this.vitesse = 0.0;
        this.annee = 2024;

        setMarque(marque);
        setModele(modele);
        setVitesse(vitesse);
        setAnnee(annee);

        System.out.println("Constructeur parametre appele.");
    }

    // 4. Constructeur de copie
    public Voiture(Voiture autreVoiture) {
        this.marque = autreVoiture.marque;
        this.modele = autreVoiture.modele;
        this.vitesse = autreVoiture.vitesse;
        this.annee = autreVoiture.annee;

        System.out.println("Constructeur de copie appele.");
    }

    // 5. Getters
    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public double getVitesse() {
        return vitesse;
    }

    public int getAnnee() {
        return annee;
    }

    // 6. Setters avec validations
    public void setMarque(String marque) {
        if (marque != null && !marque.trim().isEmpty()) {
            this.marque = marque;
        } else {
            System.out.println(
                "Erreur : La marque ne peut pas etre vide."
            );
        }
    }

    public void setModele(String modele) {
        if (modele != null && !modele.trim().isEmpty()) {
            this.modele = modele;
        } else {
            System.out.println(
                "Erreur : Le modele ne peut pas etre vide."
            );
        }
    }

    public void setVitesse(double vitesse) {
        if (vitesse >= 0 && !Double.isNaN(vitesse)
                && !Double.isInfinite(vitesse)) {
            this.vitesse = vitesse;
        } else {
            System.out.println(
                "Erreur : La vitesse doit etre positive ou nulle."
            );
        }
    }

    public void setAnnee(int annee) {
        int anneeCourante = java.time.Year.now().getValue();

        if (annee > 1885 && annee <= anneeCourante) {
            this.annee = annee;
        } else {
            System.out.println(
                "Erreur : L'annee doit etre entre 1886 et "
                + anneeCourante + "."
            );
        }
    }

    // 7. Methode accelerer
    public void accelerer(double augmentation) {
        if (augmentation > 0 && !Double.isInfinite(augmentation)
                && !Double.isNaN(augmentation)) {
            this.vitesse += augmentation;

            System.out.println(
                marque + " " + modele
                + " accelere de " + augmentation
                + " km/h. Nouvelle vitesse : "
                + vitesse + " km/h."
            );
        } else {
            System.out.println(
                "Erreur : L'augmentation doit etre positive."
            );
        }
    }

    // 8. Methode freiner
    public void freiner(double reduction) {
        if (reduction > 0 && !Double.isInfinite(reduction)
                && !Double.isNaN(reduction)) {

            if (reduction >= this.vitesse) {
                this.vitesse = 0;

                System.out.println(
                    marque + " " + modele
                    + " s'arrete completement."
                );
            } else {
                this.vitesse -= reduction;

                System.out.println(
                    marque + " " + modele
                    + " freine de " + reduction
                    + " km/h. Nouvelle vitesse : "
                    + vitesse + " km/h."
                );
            }
        } else {
            System.out.println(
                "Erreur : La reduction doit etre positive."
            );
        }
    }

    // 9. Afficher les informations
    public void afficherInformations() {
        System.out.println("\n=== Informations de la voiture ===");
        System.out.println("Marque : " + marque);
        System.out.println("Modele : " + modele);
        System.out.println("Vitesse actuelle : " + vitesse + " km/h");
        System.out.println("Annee : " + annee);
        System.out.println("==================================");
    }
}

