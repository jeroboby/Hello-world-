public class Voiture extends VehiculeAMoteur implements Vidangeable {

    static int nbRoues=4;

    int nbPortes=5;
    boolean automatique;
    String couleur;
    int rapportCourant;



    Voiture() {
        super(new Moteur());
    }

    Voiture(String couleur) {
        this();
        this.couleur = couleur;
        System.out.println("une voiture est construite avec la couleur");
    }

    Voiture(Moteur moteur) {
        this();

    }

    Voiture(String carburation, int nbCylindres) {
        this();
        Moteur moteur = new Moteur();
        moteur.carburation = carburation;
        moteur.nbCylindres = nbCylindres;
        this.moteur = moteur;
    }

    static void klaxonner() {
        System.out.println("Tutut!!!");
    }

    static void tourner(boolean droite, int angle) {
        String droiteOuGauche=null;
        if(droite) {
            droiteOuGauche= "droite";
        } else {
            droiteOuGauche="gauche";
        }
        System.out.println("Les "+ nbRoues+" roues de la voitures tournent à " +droiteOuGauche+" d'un angle de "+ angle);
    }

    int passerRapport(boolean augmenter) {
        if(augmenter) {
            rapportCourant++;
        } else {
            rapportCourant--;
        }
        return rapportCourant;
    }
    
    void tourner(String droiteOuGauche, int angle) {
        System.out.println("La voiture va tourner à "+droiteOuGauche+" d'un angle de "+ angle);
    }

    Ville transporter(Passager passager, Ville villeDeDepart) {
        System.out.println("La voiture transporte un passager qui s'appelle " + passager.prenom+" "+passager.nom);
        System.out.println("Le passager est parti de la ville de "+ villeDeDepart.nom);

        Ville villeDeDestination = new Ville();
        villeDeDestination.nom = "Wellington";
        return villeDeDestination;
    }

    @Override
    public void vidanger() {
        System.out.println("Devisser le bouchon sous la culasse et attendre que ca coule.");
    }
}