public class printEvenNumbers {
    public static void main(String[] args) {

        /* Solution 1:

        for(int i=2; i<=500; i +=2) {
            System.out.println(i);
        }*/

        // Solution 2:

        for (int i=0; i<=500; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }


    }
}
