import java.awt.*;
import java.util.Random;


public class Character extends GameObject {

    protected int healthPoint;
    protected int defendPoint;
    protected int strikePoint;
    protected boolean alive;
    int level; //if have time to implement user levels

    Random rand= new Random();




    public Character(String filename, int posX, int posY) {
        super(filename, posX, posY);
        getHealthPoint();
        getDefendPoint();
        getStrikePoint();
        alive=true;

    }

    public void draw(Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, posX * 72, posY * 72, null);
        }
    }


    public int getHealthPoint(){
        if (healthPoint<0){
            alive=false;
        }
        return healthPoint;
    }

    public int getStrikePoint(){
        return strikePoint;
    }

    public int getDefendPoint(){
        return defendPoint;


        }
    }

