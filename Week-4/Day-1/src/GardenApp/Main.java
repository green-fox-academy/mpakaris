package GardenApp;

public class Main {
    public static void main(String[] args) {

        Garden garden = new Garden();

        garden.add(new Flower("Flower", "yellow", 0));
        garden.add(new Flower("Flower","blue", 0));
        garden.add(new Tree("Tree","purple", 0));
        garden.add(new Tree("Tree", "orange", 0));
        System.out.println();
        garden.getGardenStatus();
        System.out.println("--------------------");
        garden.wateringGarden(40);
        garden.getGardenStatus();
        System.out.println("--------------------");
        garden.wateringGarden(70);
        garden.getGardenStatus();






    }
}
