public class App2 {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square.getBok());
        System.out.println(square.getObw());
        System.out.println(square.getPole());


        square.setBok(8);

        System.out.println(square.getBok());
        System.out.println(square.getObw());
        System.out.println(square.getPole());
        /*Square s2 = new Square();

        Square s3 = new Square(4, 16, 16);*/

        Client c = new Client();

        c.setAge(54);


        Client c1 = new Client();

        c1.setAge(54);


        Client c2 = new Client();

        c2.setAge(54);

        int a = 7;
        int b = 7;

        if(a == b) {
            System.out.println("takie same");
        } else {
            System.out.println("inne");
        }

        Square s1 = new Square(5);
        Square s2 = new Square(7);

        if(s1.equals(s2)) {
            System.out.println("takie same");
        } else {
            System.out.println("inne");
        }

        String string1 = "Janusz";
        String string2 = new String("Janusz");

        if(string1 == string2) {
            System.out.println("Stringi takie same !!");
        }

        String string3 = "Janusz";
        string3 = string3 + "X";
        System.out.println(string3);
    }
}
