public class cuboid {

    public static void main(String[] args) {

        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double a=10;
        double b=10;
        double c=10;

        int surface = (int) ((a*b)+(b*c)+(a*c))*2;
        int volume = (int) (a*b*c);

        System.out.println("Surface Area: " + surface);
        System.out.println("Volume: " + volume);
    }
}
