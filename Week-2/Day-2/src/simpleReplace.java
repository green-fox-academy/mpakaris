import java.util.Arrays;

public class simpleReplace {
    public static void main(String[] args) {

        String givenSentence = "In a dishwasher far far away";
        // I would like to replace "dishwasher" with "galaxy" in this example, but it has a problem.
        // Please fix it for me!
        // Expected ouput: In a galaxy far far away

        givenSentence = givenSentence.replace("dishwasher", "galaxy");

        System.out.println(givenSentence);
    }
}
