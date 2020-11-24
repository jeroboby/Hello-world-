public class Bateau implements Amarable {

    int masse;

    @Override
    public int combienDeCordes(int vitesseDuVent) {
        int nbCordes = masse/10;
        nbCordes = nbCordes + vitesseDuVent/100;
        return nbCordes;
    }
}
