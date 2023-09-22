public class App4 {
    public static void main(String[] args) {
        Klasa.name = "Cos";

        Klasa klasa = new Klasa();

        Klasa klasa2 = new Klasa();

        Klasa klasa3 = new Klasa();

        System.out.println(klasa.name);
        System.out.println(klasa2.name);
        System.out.println(klasa3.name);

        klasa.name = "Cos innego";

        System.out.println(klasa.name);
        System.out.println(klasa2.name);
        System.out.println(klasa3.name);
    }
}
