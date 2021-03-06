import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;


public class Board extends JPanel implements KeyListener {
    Hero myHero;
    Area myArea;
    Boss myBoss;


    ArrayList<Character> enemies;


    String heroDownImg = "images/hero-down.png";
    String heroUpImg = "images/hero-up.png";
    String heroLeftImg = "images/hero-left.png";
    String heroRightImg = "images/hero-right.png";

    String skeletonImg = "images/skeleton.png";
    String bossImg = "images/boss.png";
    String deadImg = "images/skull.png";


    public Board() {

        myArea = new Area();
        myHero = new Hero(0, 0);
        myBoss = new Boss(4, 4);
        addKeyListener(this);
        setFocusable(true);
        setPreferredSize(new Dimension(720, 900));
        setVisible(true);
        enemies = enemyCreation();

    }


    public void addNotify() {
        super.addNotify();
        requestFocus();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP: {
                if (myArea.ifTileIsMoveable(myHero.posX, myHero.posY - 1))
                    myHero.move(0, -1, heroUpImg);
                break;
            }
            case KeyEvent.VK_DOWN: {
                if (myArea.ifTileIsMoveable(myHero.posX, myHero.posY + 1))
                    myHero.move(0, 1, heroDownImg);
                System.out.println("down pressed ");
                break;
            }
            case KeyEvent.VK_RIGHT: {
                if (myArea.ifTileIsMoveable(myHero.posX + 1, myHero.posY))
                    myHero.move(1, 0, heroRightImg);
                break;
            }
            case KeyEvent.VK_LEFT: {
                if (myArea.ifTileIsMoveable(myHero.posX - 1, myHero.posY))
                    myHero.move(-1, 0, heroLeftImg);
                break;
            }
            case KeyEvent.VK_SPACE: {
                Character enemy = onSameTile();
                if(enemy!=null){
                    myHero.strike(enemy);
                }
            }
            default: {
                break;
            }
        }
        revalidate();
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        myArea.draw(graphics);
        myHero.draw(graphics);
        myBoss.draw(graphics);

        for (Character enemy : enemies) {
            enemy.draw(graphics);
        }
        graphics.drawString(myHero.toString(),2,750);

        Character sameTileCheck = onSameTile();
        if (sameTileCheck!=null){
            sameTileCheck.drawString(graphics);
        }

    }

    public ArrayList<Character> enemyCreation() {

        ArrayList<Character> enemies = new ArrayList<>();
        Random random = new Random();
        int numberofSkeletons = 3 + random.nextInt(4);
        int randomPosX;
        int randomPosY;
        for (int i = 0; i < numberofSkeletons; i++) {
            randomPosX = random.nextInt(10);
            randomPosY = random.nextInt(10);
            boolean occupied = myArea.isOccupied(randomPosX, randomPosY);
            while (occupied == true) {

                randomPosX = random.nextInt(10);
                randomPosY = random.nextInt(10);
                occupied = myArea.isOccupied(randomPosX, randomPosY);

            }
            Skeleton skeleton = new Skeleton(randomPosX, randomPosY);
            enemies.add(skeleton);


        }

        return enemies;
    }

    public Character onSameTile() {

        for (Character randomSkeleton : enemies) {
            if (myHero.getPosX() == randomSkeleton.getPosX() && myHero.getPosY() == randomSkeleton.getPosY())
            {
                return randomSkeleton;

            }
        }
        if (myHero.getPosX() == myBoss.getPosX() && myHero.getPosY() == myBoss.getPosY()) {
                return myBoss;
            }
        return null;
    }

}
