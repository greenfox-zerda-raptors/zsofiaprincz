package main.java.music;

/**
 * Created by zsofiaprincz on 16/11/16.
 */
public class ElectricBassGuitar extends StringedInstrument {

    public ElectricBassGuitar(){
        super("ElectricBassGuitar", 4);
    }

    public ElectricBassGuitar(int numberOfStrings) {
        super("ElectricBassGuitar", numberOfStrings);
    }

    @Override
    public String sound() {
        return "DummDumm";
    }

    //    public ElectricBassGuitar() {
//        numberOfStrings = 4;
//        nameOfInstrument = "ElectricBassGuitar";
//        sound = "Duum-duum-duum";
//    }
//    public ElectricBassGuitar(int numberOfStrings) {
//        this.numberOfStrings =numberOfStrings;
//    }

    public void play(){
        System.out.printf(formatForPlay, nameOfInstrument, numberOfStrings, sound);
    }
}
