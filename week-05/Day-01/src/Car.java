// Car.java
public class Car {
    //Add somethings here to create a car and some fields

    private int sizeEngine = 0;
    private String color = "";
    private int km = 0;
    private String type = "";
    private static int countCar = -1;

    public Car(String type, String color, int sizeEngine, int km) {
        setType(type);
        setColor(color);
        setSizeEngine(sizeEngine);
        setKm(km);
        countCar++;


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

    public int getSizeEngine() {
        return sizeEngine;
    }

    public String getColor() {
        return color;
    }

    public int getKm() {
        return km;
    }

    public String getType() {
        return type;
    }

    public static int getCountCar() {
        return countCar;
    }


    public void drive(int km) {
        if (km < 20) {
            km = km + km;
            System.out.printf("brrm, %s just drove around town %s clicks.\n",
                    type,
                    km);
        }
        if (km < 50) {
            km = km + km;
            System.out.printf("brrm, screech, brrm, screech; %s commuted %s clicks.\n",
                    type,
                    km);
        }
    }


    public String toString() {
        return String.format("This %s is %s, has %d cc engine and clocked %d km's.\n",
                getType(),
                getColor(),
                getSizeEngine(),
                getKm());
    }


    public void setType(String type) {
        this.type = type;
    }

}





