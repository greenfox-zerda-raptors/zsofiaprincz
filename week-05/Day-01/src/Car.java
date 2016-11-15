// Car.java
public class Car {
    //Add somethings here to create a car and some fields

    private int sizeEngine;
    private String color;
    private int km;
    private String type;

    public Car (){


    }

    int getSizeEngine() {
        return sizeEngine;
    }


    String getColor() {
        return color;

    }


    int getKm() {
        return km;
    }

    String getType() {
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

        public String toString(){
            return String.format ("This %s is %s, has %s cc engine and clocked %s km's.\n",
                type,
                color,
                sizeEngine,
                km);
        }


    }


