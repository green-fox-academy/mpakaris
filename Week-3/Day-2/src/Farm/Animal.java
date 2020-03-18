package Farm;

public class Animal {

    public int hunger = 50;
    public int thirst = 50;
    public String animalName;

    public Animal(String animalNameMain){
        this.animalName = animalNameMain;
    }

    public void eat(){
        hunger--;
        System.out.println("After eat Hunger left of " + animalName + " : " + hunger);
    }

    public void drink(){
        thirst--;
        System.out.println("After drink Thirst left of " + animalName + " : " + thirst);

    }

    public void play(){
        hunger++;
        thirst++;
        System.out.println("After Play Hunger left of " + animalName + " : " + hunger);
        System.out.println("After Play Thirst left of " + animalName + " : " + thirst);

    }

}
