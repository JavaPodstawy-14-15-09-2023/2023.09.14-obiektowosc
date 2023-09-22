public class App {
    public static void main(String[] args) {
        Client c1 = new Client();
        Client[] clients = new Client[100];

        c1.name = "Janusz";
        c1.surname = "Kowalski";
        c1.age = 33;

        System.out.println(c1.age);

        Client c2 = new Client();
        c2.name = "Zbyszek";

        Client c3 = new Client();

        System.out.println(c2.name);
        System.out.println(c3.name);

        c3.address = new Address();
        c3.address.street = "Ogrodowa";

        int pierwszaLiczba = 4;
        int drugaLiczba = 8;
        int wynik = c3.add(pierwszaLiczba,drugaLiczba);
        System.out.println(wynik);

        System.out.println(c3.wymyslLiczbe(10));

        c1.wyswietlImie();
    }
}
