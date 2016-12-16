
import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
@Getter
@Setter

public class Character extends GameObject {

    protected int healthPoint;
    protected int defendPoint;
    protected int strikePoint;
    protected boolean alive;

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

    public void setAlive(boolean alive) {
        this.alive = alive;
    }



    public void strike (Character anyCharacter){
        if (anyCharacter != null && this.strikePoint > anyCharacter.defendPoint) {
            anyCharacter.healthPoint -= this.strikePoint - anyCharacter.defendPoint;
            if (anyCharacter.healthPoint <= 0){
                anyCharacter.setAlive(false);
                anyCharacter.changeImage(Board.deadImg);

            }
        }

            this.healthPoint -= anyCharacter.strikePoint - this.defendPoint;
            if (this.healthPoint <= 0){
                this.setAlive(false);
                this.changeImage(Board.deadImg);
            }
        }


    @Override
    public String toString() {
        return getClass().getSimpleName() + String.format("HP: %d/ | DP: %d | SP: %d", healthPoint, defendPoint, strikePoint);
    }

    public void drawString(Graphics graphics){
    }

    }

