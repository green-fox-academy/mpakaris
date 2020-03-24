package main.java.music;

public class BassGuitar extends StringedInstruments {

    // Default Constructor:
    public BassGuitar (){
        super("Bass Guitar", 4, "Duum-duum-duum");
    }

    public BassGuitar (int amountOfStrings){
        super("Bass Guitar", amountOfStrings, "Duum-duum-duum");
    }

    public String getName(){
        return "Bass Guitar";
    }

}
