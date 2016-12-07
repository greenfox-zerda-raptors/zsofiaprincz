import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Board extends JPanel implements KeyListener{
    Hero myHero;
    Area myArea;

    String heroDownImg = "images/hero-down.png";
    String heroUpImg = "images/hero-up.png";
    String heroLeftImg = "images/hero-left.png";
    String heroRightImg = "images/hero-right.png";


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
                myHero.move(0,-1,heroUpImg,myArea.getMap());
                break;
            }
            case KeyEvent.VK_DOWN : {
                myHero.move(0,1,heroDownImg,myArea.getMap());
                System.out.println("down pressed ");
                break;
            }
            case KeyEvent.VK_RIGHT : {
                myHero.move(1,0,heroRightImg,myArea.getMap());
                break;
            }case KeyEvent.VK_LEFT : {
                myHero.move(-1,0,heroLeftImg,myArea.getMap());
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
