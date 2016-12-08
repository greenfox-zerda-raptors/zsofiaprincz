import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class Board extends JPanel implements KeyListener{
    Hero myHero;
    Area myArea;
    Boss myBoss;
    ArrayList<Skeleton> skeletons;

    String heroDownImg = "images/hero-down.png";
    String heroUpImg = "images/hero-up.png";
    String heroLeftImg = "images/hero-left.png";
    String heroRightImg = "images/hero-right.png";

    String skeletonImg = "images/skeleton.png";
    String bossImg = "images/boss.png";



    public Board()  {

        myArea = new Area();
        myHero = new Hero(0,0);
        addKeyListener(this);
        setFocusable(true);
        setPreferredSize(new Dimension(720, 900));
        setVisible(true);
    }


    public void addNotify() {
       super.addNotify();
        requestFocus();
    }
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP : {
                if (myArea.ifTileIsMoveable(myHero.posX, myHero.posY-1))
                myHero.move(0,-1,heroUpImg);
                break;
            }
            case KeyEvent.VK_DOWN : {
                if (myArea.ifTileIsMoveable(myHero.posX,myHero.posY+1))
                myHero.move(0,1,heroDownImg);
                System.out.println("down pressed ");
                break;
            }
            case KeyEvent.VK_RIGHT : {
                if (myArea.ifTileIsMoveable(myHero.posX+1,myHero.posY))
                myHero.move(1,0,heroRightImg);
                break;
            }case KeyEvent.VK_LEFT : {
                if (myArea.ifTileIsMoveable(myHero.posX-1,myHero.posY))
                myHero.move(-1,0,heroLeftImg);
                break;
            }
            default:{
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
    public void paint(Graphics graphics){
        myArea.draw(graphics);
        myHero.draw(graphics);
    }
}
