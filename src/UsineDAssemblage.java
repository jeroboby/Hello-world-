public class UsineDAssemblage {

    VehiculeAMoteur assemble(){
        Moteur moteur = new Moteur();
        VehiculeAMoteur vam = new VehiculeAMoteur(moteur);
        return vam;
    }
}
