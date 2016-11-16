package main.java.music;

/**
 * Created by zsofiaprincz on 16/11/16.
 */
public class Violin extends StringedInstrument{

    public Violin() {
        numberOfStrings = 4;
        nameOfInstrument = "Violin";
        sound = "Screech";
    }

    public void play(){
        System.out.printf(formatForPlay, nameOfInstrument, numberOfStrings, sound);
    }



}
