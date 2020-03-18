package Farm;

public class Main {
    public static void main(String[] args) {

        Farm farm = new Farm("NikosFarm");

        Animal cat = new Animal("Cat");
        farm.breed(cat);
        for (int i = 0; i < 10; i++) {
            cat.eat();
        }

        Animal dog = new Animal("Dog");
        farm.breed(dog);
        for (int i = 0; i < 5; i++) {
            dog.play();
        }

        Animal pig = new Animal ("Pig");
        farm.breed(pig);
        for (int i = 0; i < 4; i++) {
            pig.eat();
        }

        Animal cow = new Animal ("Cow");
        farm.breed(cow);
        for (int i = 0; i < 3; i++) {
            cow.eat();
        }

        Animal horse = new Animal ("Horse");
        farm.breed(horse);
        for (int i = 0; i < 1; i++) {
            horse.play();
        }

        farm.slaughter();

    }
}
