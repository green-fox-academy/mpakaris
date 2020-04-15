package AnimalProtection;
public class Main {
    public static void main(String[] args) {



        //animal.heal();
        Animal cat = new Cat();
        cat.heal();
        String answer = cat.toString();
        System.out.println(answer);
        System.out.println(".......................................................");
        Animal dog = new Dog();
        answer = dog.toString();
        System.out.println(answer);
        System.out.println(".......................................................");
        Animal parrot = new Parrot();
        parrot.heal();
        answer = parrot.toString();
        System.out.println(answer);

    }
}
