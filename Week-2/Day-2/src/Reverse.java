import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("This sentence needs to be reversed: ");
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        System.out.println(reversed);
        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        System.out.println();
        System.out.println("The meaning of the reversed Sentence is: ");
        System.out.println(reversedString(reversed));

    }

    public static String reversedString(String sentenceToReverse){

        byte[] stringAsByteArray = sentenceToReverse.getBytes();
        byte[] result = new byte[stringAsByteArray.length];
        //Store result in reverse order into the result byte[]

        for (int i = 0; i < stringAsByteArray.length; i++) {
            result[i] = stringAsByteArray[stringAsByteArray.length-i-1];
        }

        String reversedSentence = new String(result);
        return reversedSentence;
    }
}
