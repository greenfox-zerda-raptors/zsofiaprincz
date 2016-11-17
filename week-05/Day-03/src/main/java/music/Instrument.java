package main.java.music;

/**
 * Created by zsofiaprincz on 16/11/16.
 */
public abstract class Instrument {
    protected String nameOfInstrument;

    public Instrument (String nameOfInstrument){
        this.nameOfInstrument = nameOfInstrument;
    }


    public abstract void play ();

    public abstract String sound ();


}



