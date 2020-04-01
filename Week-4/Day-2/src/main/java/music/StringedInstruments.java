package main.java.music;

public abstract class StringedInstruments extends Instrument{

    protected int numberOfStrings;

    protected int amountOfStrings;
    protected String soundOfInstrument;

    public StringedInstruments(String nameOfInstrument, int amountOfStrings, String soundOfInstrument){
        super(nameOfInstrument, amountOfStrings, soundOfInstrument);
        this.amountOfStrings = amountOfStrings;
        this.soundOfInstrument = soundOfInstrument;
    }
}
