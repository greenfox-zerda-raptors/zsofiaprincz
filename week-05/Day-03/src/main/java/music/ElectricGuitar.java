package main.java.music;

/**
 * Created by zsofiaprincz on 16/11/16.
 */
public class ElectricGuitar extends StringedInstrument {


    public ElectricGuitar() {
        numberOfStrings = 6;
        nameOfInstrument = "ElectricGuitar";
        sound = "Twang";
    }
    public ElectricGuitar(int numberOfStrings) {
        this.numberOfStrings =numberOfStrings;
    }

    public void play(){
        System.out.printf(formatForPlay, nameOfInstrument, numberOfStrings, sound);
    }
}
