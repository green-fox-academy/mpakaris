package PostIt;

import static PostIt.PostIt.ANSI_RESET;

public class main {

    public static void main(String[] args) {
        System.out.println();

        // "Idea" "blue Text" "Orange Background"
        PostIt postIt1 = new PostIt("Idea", "blue", "orange");
        System.out.println(postIt1.backgroundColor + postIt1.textColor + postIt1.text + ANSI_RESET);

        System.out.println();
        // "Awesome" "red Text" "Magenta Background"
        PostIt postIt2 = new PostIt( "Awesome", "red", "magenta");
        System.out.println(postIt2.backgroundColor + postIt2.textColor + postIt2.text + ANSI_RESET);

        System.out.println();
        // "Superb" "green Text" "Yellow Background"
        PostIt postIt3 = new PostIt( "Superb", "green", "yellow");
        System.out.println(postIt3.backgroundColor + postIt3.textColor + postIt3.text + ANSI_RESET);

    }
}
