package Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Animal cat = new Animal();
        cat.play();
        System.out.println("Thirst: " + cat.thirst + " / Hunger: " + cat.hunger);
        cat.play();
        System.out.println("Thirst: " + cat.thirst + " / Hunger: " + cat.hunger);
        cat.play();
        System.out.println("Thirst: " + cat.thirst + " / Hunger: " + cat.hunger);
        cat.play();
        System.out.println("Thirst: " + cat.thirst + " / Hunger: " + cat.hunger);
        cat.drink();
        System.out.println("Thirst: " + cat.thirst + " / Hunger: " + cat.hunger);
        cat.eat();
        System.out.println("Thirst: " + cat.thirst + " / Hunger: " + cat.hunger);

        System.out.println();
        System.out.println("dog");
        Animal dog = new Animal();
        dog.drink();
        System.out.println("Thirst: " + dog.thirst + " / Hunger: " + dog.hunger);
        dog.eat();
        System.out.println("Thirst: " + dog.thirst + " / Hunger: " + dog.hunger);
        dog.eat();
        System.out.println("Thirst: " + dog.thirst + " / Hunger: " + dog.hunger);
        dog.eat();
        System.out.println("Thirst: " + dog.thirst + " / Hunger: " + dog.hunger);
        dog.play();
        System.out.println("Thirst: " + dog.thirst + " / Hunger: " + dog.hunger);
        dog.drink();
        System.out.println("Thirst: " + dog.thirst + " / Hunger: " + dog.hunger);

    }
}
