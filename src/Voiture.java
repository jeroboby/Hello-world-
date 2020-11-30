import java.util.Objects;

public class Voiture extends Vehicule implements Vidangeable {

    static int nbRoues=4;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voiture voiture = (Voiture) o;
        return nbPortes == voiture.nbPortes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nbPortes);
    }

    int nbPortes=5;
    TypeBoiteVitesse typeBoite;
    String couleur;
    Integer rapportCourant;

    Voiture() {

    }

    Voiture(String couleur) {
        this.couleur = couleur;
        System.out.println("une voiture est construite avec la couleur");
    }

    Voiture(String carburation, int nbCylindres) {
        Moteur moteur = new Moteur();
        moteur.carburation = carburation;
        moteur.nbCylindres = nbCylindres;
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

    public static void main(String... args) {

        System.out.println("Je commnence dans la classe Voiture");
    }
    
    void tourner(String droiteOuGauche, int angle) {
        System.out.println("La voiture va tourner à "+droiteOuGauche+" d'un angle de "+ angle);
    }

    Ville transporter(Passager passager, Ville villeDeDepart, Ville... villeEtapes) {
        System.out.println("La voiture transporte un passager qui s'appelle " + passager.prenom+" "+passager.nom);
        System.out.println("Le passager est parti de la ville de "+ villeDeDepart.nom);

        System.out.println("La 1ere ville etape est "+ villeEtapes[0].nom);
        System.out.println("La 3eme ville etape est "+ villeEtapes[2].nom);

        System.out.println("il y a "+ villeEtapes.length +" villes etapes");


        Ville villeDeDestination = new Ville();
        villeDeDestination.nom = "Wellington";
        return villeDeDestination;
    }

    @Override
    public void vidanger() {
        System.out.println("Devisser le bouchon sous la culasse et attendre que ca coule.");
    }

    @Override
    void klaxonner() {
        System.out.println("Knutt Knutt");
    }

}
