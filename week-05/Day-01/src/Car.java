// Car.java
public class Car {
    //Add somethings here to create a car and some fields

    private int sizeEngine;
    private String color;
    private int km;
    private String type;

    public Car (String type, String color, int sizeEngine, int km ){
            getType();
            getColor();
        getSizeEngine();
        getKm();



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

    //    int getSizeEngine() {
//        return sizeEngine;
//    }
//
//
//    String getColor() {
//        return color;
//
//    }
//
//
//    int getKm() {
//        return km;
//    }
//
//    String getType() {
//        return type;
//    }

//    public void setSizeEngine(int sizeEngine) {
//        this.sizeEngine = sizeEngine;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public void setKm(int km) {
//        this.km = km;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }

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
            return String.format ("This %s is %s, has %d cc engine and clocked %d km's.\n",
                getType(),
                getColor(),
                getSizeEngine(),
                getKm());
        }


    }


