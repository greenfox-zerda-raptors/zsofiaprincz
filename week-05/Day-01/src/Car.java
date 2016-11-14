// Car.java
public class Car {
    //Add somethings here to create a car and some fields

    private int sizeEngine;
    private String color;
    private int km;
    private String type;

    int getSizeEngine() {
        return sizeEngine;
    }



    String getColor() {
        return color;

    }


    int getKm() {
        return km;
    }

    String getType (){
        return type;
    }

    public void setSizeEngine(int sizeEngine) {
        this.sizeEngine = sizeEngine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "";
    }
}



