package demonstration.transport;

/**
 *
 */
public class UsineDAssemblage {

    /**
     *
     * @return
     */
    VehiculeAMoteur assemble(){
        Moteur moteur = new Moteur();
        /*
        Il s'agit ici d'instancier un Vehicule à Moteur avec un Moteur par defaut, on ne sait pas
        s'il s'agit d'un moteur diesel ou essence...
         */
        VehiculeAMoteur vam = new VehiculeAMoteur(moteur);
        return vam;
    }
}
