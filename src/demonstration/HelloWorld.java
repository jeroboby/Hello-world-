package demonstration;

import demonstration.transport.Passager;
import demonstration.transport.terrestre.Voiture;

import java.util.*;
import static java.lang.Math.PI;
import static java.lang.Math.abs;

public class HelloWorld {

    public static void main(String... args) {

        System.out.println("Hello World");

        System.out.println("Le nombre Pi vaut : "+ PI);

        int absMoinsDouze = abs(-12);

        Voiture peugeot206 = new Voiture();
        peugeot206.setCouleur("Rouge");

        Voiture peugeot207 = new Voiture();
        peugeot207.setCouleur("Verte");

        Map<Carre, Voiture> mapCarre = new TreeMap();
        mapCarre.put(new Carre(10), peugeot206);
        mapCarre.put(new Carre(8), peugeot206);
        mapCarre.put(new Carre(50), peugeot207);
        mapCarre.put(new Carre(2), peugeot207);


        for (Map.Entry<Carre, Voiture> entry: mapCarre.entrySet()) {
            System.out.println(entry.getKey().cote+ " "+ entry.getValue().getCouleur());
        }



        Map<String, Voiture> map = new HashMap();
        map.put("206", peugeot206);
        map.put("207", peugeot207);

        Voiture vx = map.get("207");

        map.clear();

        System.out.println("La map est elle vide "+ map.isEmpty());

        List list = new ArrayList();

        list.add("one");
        list.add("two");
        list.add("three");

        Collections.replaceAll(list, "two", 2);

        for (Object values: list) {

            System.out.println(values);
        }

        System.out.println(vx.getCouleur());

        Set<Voiture> set= new HashSet<>();
        set.add(peugeot206);
        set.add(peugeot207);


        Passager passager = new Passager();
        passager.nom ="Dupond";
        passager.prenom = "Michel";
        Ville depart = new Ville();
        depart.nom = "Auckland";

        Ville etape1 = new Ville();
        etape1.nom = "Hamilton";

        Ville etape2 = new Ville();
        etape2.nom = "Taupo";

        Ville etape3 = new Ville();
        etape3.nom = "Wellington";

        peugeot206.transporter(passager, depart, etape1, etape2, etape3);
    }
}
