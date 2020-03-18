package Packages;

public class BattleApp {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Create Armada: ");
        System.out.println("---------------------------------------------");
        Armada armada1 = new Armada("Armada 1");
        armada1.createArmada();

        System.out.println("Create Armada: ");
        System.out.println("---------------------------------------------");
        Armada armada2 = new Armada("Armada 2");
        armada2.createArmada();

    }
}
