package main.java.music;

/**
 * Created by zsofiaprincz on 16/11/16.
 */
public abstract class StringedInstrument extends Instrument{

    int numberOfStrings;
    String sound;


    final String formatForPlay = "%s, a %d-stringed instrument that %s\n";
}
