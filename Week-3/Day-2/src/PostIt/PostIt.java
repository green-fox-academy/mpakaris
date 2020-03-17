package PostIt;

public class PostIt {
    String text = "";
    String textColor = "";
    String backgroundColor = "";

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_MAGENTA_BACKGROUND = "\033[35m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_ORANGE_BACKGROUND = "\\033[48;2;255;165;0m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";


    public PostIt(String text, String textColor, String backgroundColor){
        this.text = text;

        if (textColor.equals("red")) {
            this.textColor = ANSI_RED;
        } else if (textColor.equals("green")){
            this.textColor = ANSI_GREEN;
        } else if (textColor.equals("blue")) {
            this.textColor = ANSI_BLUE;
        }

        if (backgroundColor.equals("white")) {
            this.backgroundColor = ANSI_ORANGE_BACKGROUND;
        } else if (backgroundColor.equals("magenta")) {
            this.backgroundColor = ANSI_PURPLE_BACKGROUND;
        } else if (backgroundColor.equals("yellow")) {
            this.backgroundColor = ANSI_YELLOW_BACKGROUND;
        }

    }










}





