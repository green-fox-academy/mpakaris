package DominoComparable;

public class Domino implements Comparable<Domino> {

    private int a, b;
    int[] domino = new int[2];

    public Domino(int a, int b) {
        this.a = a;
        this.domino[0] = a;
        this.b = b;
        this.domino[1] = b;
    }

    public int returnSideA() {
        return this.a;
    }

    public int returnSideB() {
        return this.b;
    }

    public int[] getDomino() {
        return domino;
    }

    @Override
    public int compareTo(Domino domino) {

        /* if (this.a > domino.a) {
            return 1;
        } else if (this.a == domino.a) {
            return 0;
        } else {
            return -1;
        } */
        return Integer.compare(this.a, domino.a);
    }
}
