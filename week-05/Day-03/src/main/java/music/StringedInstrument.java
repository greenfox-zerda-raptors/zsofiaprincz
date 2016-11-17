package main.java.music;

/**
 * Created by zsofiaprincz on 16/11/16.
 */
public abstract class StringedInstrument extends Instrument{

    int numberOfStrings;
    String sound;

    public StringedInstrument (String nameOfInstrument, int numberOfStrings){
        super(nameOfInstrument);
        this.numberOfStrings = numberOfStrings;
    }

    public void play(){
        System.out.printf(formatForPlay, nameOfInstrument, numberOfStrings, sound());
    }

    final String formatForPlay = "%s, a %d-stringed instrument that %s\n";
}
