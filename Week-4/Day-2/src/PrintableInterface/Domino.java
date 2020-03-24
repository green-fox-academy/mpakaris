package PrintableInterface;

public class Domino implements Printable{
    protected int side1;
    protected int side2;

    public Domino(int side1, int side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void printAllFields() {
        System.out.println("Domino A side: " + this.side1 + ", B side: " + this.side2);
    }
}
