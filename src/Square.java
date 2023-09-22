public class Square {
    private int bok;
    private int obw;
    private int pole;

    public Square(int bok1) {
        this(bok1, bok1 * 4, bok1 * bok1);
        System.out.println();
    }

    public Square() {

    }

    public Square(int bok, int obw, int pole) {
        this.bok = bok;
        this.obw = obw;
        this.pole = pole;
    }

    public void m() {
        this.m2();
        System.out.println(this.obw);
        this.m2();
    }

    public void m2() {
        System.out.println("metoda2");
    }

    int getBok() {
        return this.bok;
    }

    int getObw() {
        return this.obw;
    }

    int getPole() {
        return this.pole;
    }

    void setBok(int bok) {
        this.bok = bok;
        this.obw = 4 * bok;
        this.pole = bok * bok;
    }

    public boolean equals(Object obj) {
        Square square = (Square) obj;
        if(this.pole == square.pole &&
                this.obw == square.obw &&
                this.bok == square.bok) {
            return true;
        } else {
            return false;
        }
    }
}
