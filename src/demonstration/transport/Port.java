package demonstration.transport;

public class Port {

    void accueilEngin(Amarable amarable){

        if(amarable instanceof Amarable) {
            System.out.println("Il s'agit bien d'un engin amarable");
        }

        int nbCordes = amarable.combienDeCordes(50);
        System.out.println("Le nombre de cordes nécessaires est de "+ nbCordes);
    }
}
