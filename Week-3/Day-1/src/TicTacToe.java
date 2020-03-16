import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class TicTacToe {
    public static void main(String[] args) throws IOException {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file

        //System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"
        //System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"
        //System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"

        System.out.println();
        //System.out.println("The Winner is: " + ticTacResult("win-o.txt"));
        //System.out.println("The Winner is: " + ticTacResult("win-x.txt"));
        //System.out.println("The Winner is: " + ticTacResult("draw.txt"));
        ticTacResult("win-x");
    }

    public static String ticTacResult(String filename ) throws IOException {
        String winner = "";
        String fileUrl = "src/"+filename + ".txt";
        Path filePath = Paths.get(fileUrl);

        List<String> fileRead = Files.readAllLines(filePath);
        String[] fileArray = fileRead.toArray(new String[0]);
        System.out.println(Arrays.toString(fileArray));

        // Case 1: check for X-Win

        testArray(fileArray[0]);
        testArray(fileArray[1]);
        testArray(fileArray[2]);

        testArray("" + fileArray[0].charAt(0) + fileArray[1].charAt(0) + fileArray[2].charAt(0));
        testArray("" + fileArray[0].charAt(1) + fileArray[1].charAt(1) + fileArray[2].charAt(1));
        testArray("" + fileArray[0].charAt(2) + fileArray[1].charAt(2) + fileArray[2].charAt(2));

        testArray("" + fileArray[0].charAt(2) + fileArray[1].charAt(1) + fileArray[2].charAt(0));
        testArray("" + fileArray[0].charAt(0) + fileArray[1].charAt(1) + fileArray[2].charAt(2));

        return winner;
    }

    public static void testArray(String TestArray) {

        boolean xWins = false;
        boolean oWins = false;

        if (TestArray.equals("XXX")) {
            System.out.println("X-Wins");
            xWins = true;

        } else if (TestArray.equals("OOO")) {
            System.out.println("O-Wins");
            oWins = true;
        }

        if (!xWins && !oWins)
            System.out.println("Draw");




    }




}
