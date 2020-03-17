package Sharpie;

public class Main {
    public static void main(String[] args) {

        String color = "red";
        float width = 50;
        Sharpie redSharpie = new Sharpie(color, width);
        for (int i = 0; i < 10; i++) {
            redSharpie.useSharpie();
            System.out.println("InkAmount Red: " + redSharpie.inkAmount);
        }
        System.out.println();
        String color2 = "yellow";
        float width2 = 50;
        Sharpie yellowSharpie = new Sharpie(color2, width2);
        for (int i = 0; i < 20; i++) {
            yellowSharpie.useSharpie();
            System.out.println("InkAmount Yellow: " + yellowSharpie.inkAmount);
        }
    }
}
