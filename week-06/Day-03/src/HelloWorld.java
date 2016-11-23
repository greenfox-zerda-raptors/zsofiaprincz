import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * Created by zsofiaprincz on 23/11/16.
 */
public class HelloWorld extends JFrame{

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HelloWorld();
            }


        });

         }


      public HelloWorld(){
          this.setSize(400,400);
          this.setTitle("Hello World");
          setLocationRelativeTo(null);
          setResizable(true);
          JPanel thepanel = new JPanel();
          JLabel label1 = new JLabel("Hello");
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          Toolkit tk = Toolkit.getDefaultToolkit();
          Dimension dim = tk.getScreenSize();

          int xPos = (dim.width / 2) - (this.getWidth() / 2);

          int yPos = (dim.height / 2) - (this.getHeight() / 2);


          this.setLocation(xPos, yPos);



          String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
                  "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
                  "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
                  "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
          for (int i=0; i< hellos.length; i++ ){
              JLabel label2 = new JLabel(hellos[i]);
              thepanel.add(label2);

          }

//          for (String hello : hellos) { ez itt nem az indexet hanem az elemet adja ki.
//
//          }
          thepanel.add(label1);
          this.add(thepanel);
          this.setVisible(true);

    }
}
