package demonstration.transport.terrestre;

import demonstration.Vidangeable;
import demonstration.Ville;
import demonstration.transport.Moteur;
import demonstration.transport.Passager;
import demonstration.transport.TypeBoiteVitesse;
import demonstration.transport.Vehicule;

import java.util.Objects;

/**
 * The type Voiture.
 */
public class Voiture extends Vehicule implements Vidangeable {

    /**
     * The Nb roues.
     */
    static int nbRoues=4;
    /**
     *
     */
    private int nbPortes=5;
    private TypeBoiteVitesse typeBoite;
    private String couleur;
    private Integer rapportCourant;

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

    @Override
    public void vidanger() {
        System.out.println("Devisser le bouchon sous le culasse et attendre que ça coule");
    }

    @Override
    public void klaxonner() {
        System.out.println("Knutt Knutt");
    }

    /**
     * Instantiates a new Voiture.
     */
    public Voiture() {
        super(new Moteur());
    }

    /**
     * Instantiates a new Voiture.
     *
     * @param couleur the couleur
     */
    public Voiture(String couleur) {
        this();
        this.couleur = couleur;
        System.out.println("une voiture est construite avec la couleur");
    }

    /**
     * Instantiates a new Voiture.
     *
     * @param carburation the carburation
     * @param nbCylindres the nb cylindres
     */
    Voiture(String carburation, int nbCylindres) {
        this();
        Moteur moteur = new Moteur();
        moteur.carburation = carburation;
        moteur.nbCylindres = nbCylindres;
    }

    /**
     * Tourner.
     *
     * @param droite the droite
     * @param angle  the angle
     */
    static void tourner(boolean droite, int angle) {
        String droiteOuGauche=null;
        if(droite) {
            droiteOuGauche= "droite";
        } else {
            droiteOuGauche="gauche";
        }
        System.out.println("Les "+ nbRoues+" roues de la voitures tournent à " +droiteOuGauche+" d'un angle de "+ angle);
    }

    /**
     * Passer rapport int.
     *
     * @param augmenter the augmenter
     * @return the int
     */
    int passerRapport(boolean augmenter) {
        if(augmenter) {
            rapportCourant++;
        } else {
            rapportCourant--;
        }
        return rapportCourant;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String... args) {

        System.out.println("Je commnence dans la classe demonstration.transport.terrestre.Voiture");
    }

    /**
     * Tourner.
     *
     * @param droiteOuGauche the droite ou gauche
     * @param angle          the angle
     */
    void tourner(String droiteOuGauche, int angle) {
        System.out.println("La voiture va tourner à "+droiteOuGauche+" d'un angle de "+ angle);
    }

    /**
     * Transporter est une méthode qui nous permet de transporter un passager d'un ville de départ à une ville d'arrivée en passant par des étapes
     *
     * @param passager      the passager
     * @param villeDeDepart the ville de depart
     * @param villeEtapes   the ville etapes
     * @return ville ville
     */
    public Ville transporter(Passager passager, Ville villeDeDepart, Ville... villeEtapes) {
        System.out.println("La voiture transporte un passager qui s'appelle " + passager.prenom+" "+passager.nom);
        System.out.println("Le passager est parti de la ville de "+ villeDeDepart.nom);

        System.out.println("La 1ere ville etape est "+ villeEtapes[0].nom);
        System.out.println("La 3eme ville etape est "+ villeEtapes[2].nom);

        System.out.println("il y a "+ villeEtapes.length +" villes etapes");


        final Ville villeDeDestination;

        villeDeDestination = new Ville();
        villeDeDestination.nom = "Wellington";

        return villeDeDestination;
    }

    /**
     * Gets nb portes.
     *
     * @return the nb portes
     */
    public int getNbPortes() {
        return nbPortes;
    }

    /**
     * Sets nb portes.
     *
     * @param nbPortes the nb portes
     */
    public void setNbPortes(int nbPortes) {
        this.nbPortes = nbPortes;
    }

    /**
     * Gets type boite.
     *
     * @return the type boite
     */
    public TypeBoiteVitesse getTypeBoite() {
        return typeBoite;
    }

    /**
     * Sets type boite.
     *
     * @param typeBoite the type boite
     */
    public void setTypeBoite(TypeBoiteVitesse typeBoite) {
        this.typeBoite = typeBoite;
    }

    /**
     * Gets couleur.
     *
     * @return the couleur
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     * Sets couleur.
     *
     * @param couleur the couleur
     */
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    /**
     * Gets rapport courant.
     *
     * @return the rapport courant
     */
    public Integer getRapportCourant() {
        return rapportCourant;
    }

    /**
     * Sets rapport courant.
     *
     * @param rapportCourant the rapport courant
     */
    public void setRapportCourant(Integer rapportCourant) {
        this.rapportCourant = rapportCourant;
    }



}
