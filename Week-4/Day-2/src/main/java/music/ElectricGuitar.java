package main.java.music;

public class ElectricGuitar extends StringedInstruments {

    // Default Constructor:
    public ElectricGuitar (){
    super("Electrical Guitar", 6, "Twang");
    }

    public ElectricGuitar (int amountOfStrings){
        super("Electrical Guitar", amountOfStrings, "Twang");
    }

    public String getName(){
          return "Electrical Guitar";
    }


}
