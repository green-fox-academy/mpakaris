import java.util.Arrays;

public class Colors {
    public static void main(String[] args) {

        System.out.println();

        // Option 1:
        String[][] colors = new String[3][5];

       colors[0][1] = "lime";
       colors[0][1] = "forest green";
       colors[0][1] = "olive";
       colors[0][1] = "pale green";
       colors[0][1] = "spring green";

       colors[1][0] = "orange red";
       colors[1][1] = "red";
       colors[1][2] = "tomato";

       colors[2][0] = "orchid";
       colors[2][1] = "violet";
       colors[2][2] = "pink";
       colors[2][3] = "hot pink";

       System.out.println(colors[2][1]);

       //Option 2:
        String[][] colors2 = {
                {"lime", "forest green", "olive", "pale green", "spring green"},
                {"orange red", "red", "tomato"},
                {"orchid", "violet", "pink", "hot pink"}
        };

        System.out.println(colors2[2][0]);
    }



}
