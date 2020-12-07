package demonstration.transport;

import demonstration.Ville;

public class VehiculeAMoteur {

    Moteur moteur;
    int vitesse;


    public VehiculeAMoteur(Moteur moteur) {
        this.moteur = moteur;
        System.out.println("une voiture est construite avec un moteur");
    }

    int accelerer(int vitesse) {
        System.out.println("J'accélère");
        this.vitesse = this.vitesse + vitesse;
        return this.vitesse;
    }

    Ville transporter(Passager passager, Ville villeDeDepart) {
        System.out.println("Le véhicule transporte un passager qui s'appelle " + passager.prenom+" "+passager.nom);
        System.out.println("Le passager est parti de la ville de "+ villeDeDepart.nom);

        Ville villeDeDestination = new Ville();
        villeDeDestination.nom = "Wellington";
        return villeDeDestination;
    }
}
