package CharSequence;

public class Main {
    public static void main(String[] args) {
        Gnirts g = new Gnirts("Example");
        System.out.println("Character at requested position '" + g.charAt(5) + "'.");

        Shifter s = new Shifter("example", 2);
        System.out.println("Shifted " + s.charAt(0));


    }
}
