public class Mongolfiere implements Amarable {

    int surface;

    @Override
    public int combienDeCordes(int vitesseDuVent) {
        int nbCordes = surface/50;
        nbCordes = nbCordes + vitesseDuVent/100;
        return nbCordes;
    }
}
