package demonstration;

public class Carre implements Comparable{

    Long cote;

    Carre(long cote) {
        this.cote = cote;
    }

    @Override
    public int compareTo(Object o) {
        Carre autreCarre = (Carre)o;
        return this.cote.compareTo(autreCarre.cote);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Carre)) {
            return false;
        }
        Carre autreCarre= (Carre)obj;
        return cote==autreCarre.cote;
    }

    @Override
    public int hashCode() {
        return cote.hashCode();
    }
}
