package demonstration;

import demonstration.transport.Moteur;
import demonstration.transport.Vehicule;

public class Velo extends Vehicule {


    public Velo(Moteur moteur) {
        super(moteur);
    }

    @Override
    public void klaxonner() {
        System.out.println("Dring Dring!");
    }

    @Override
    public void vidanger() {

    }
}
