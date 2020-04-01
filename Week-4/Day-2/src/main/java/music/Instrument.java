package main.java.music;

public abstract class Instrument {

    protected String nameOfInstrument;
    protected int stringOfInstrument;
    protected String soundOfInstrument;

    public Instrument(String nameOfInstrument, int strings, String soundOfInstrument){
        this.nameOfInstrument = nameOfInstrument;
        this.stringOfInstrument = strings;
        this.soundOfInstrument = soundOfInstrument;
    }

    public void play(){
        System.out.println(this.nameOfInstrument + ", a "
                + this.stringOfInstrument + "-stringed instrument that goes " + this.soundOfInstrument);
    }
}
