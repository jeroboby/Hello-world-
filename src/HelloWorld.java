public class HelloWorld {
    public static void main(String... args) {

        Bateau b = new Bateau();
        b.masse = 60;
        Port p = new Port();
        p.accueilEngin(b);
    }
}
