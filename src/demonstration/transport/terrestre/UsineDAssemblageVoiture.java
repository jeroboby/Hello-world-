package demonstration.transport.terrestre;

import demonstration.transport.UsineDAssemblage;

public class UsineDAssemblageVoiture extends UsineDAssemblage {

    Voiture assemble() {
        Voiture v = new Voiture("rouge");
        return v;
    }

}
