import java.util.Arrays;

public class compareLength {
    public static void main(String[] args) {

        int[] p1 = {1, 2, 3};
        int[] p2 = {4, 5,6};

        if (p1.length > p2.length)
            System.out.println("P1 has more elements than P2");
        else if (p1.length < p2.length)
            System.out.println("P2 has more elements than P1");
        else {
            System.out.println("P1 is equal to P2 in amount of elements");
        }
    }




}
