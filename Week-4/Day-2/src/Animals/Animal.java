package Animals;

public abstract class Animal {

    protected String name, countryOfOrigin, color, breeding;
    protected int age, numberOfLegs;

    public Animal(String name){
        this.name = name;
        this.age = age;
        this.countryOfOrigin = countryOfOrigin;
        this.color = color;
        this.numberOfLegs = numberOfLegs;
        this.breeding = breeding;
    }

    abstract String move();
    abstract String sound();
    abstract String breed();
    abstract int setNumberOfLegs();
    abstract String getCountryOfOrigin();
    abstract String color();
}
