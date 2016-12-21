import com.greenfoxacademy.java.lesson.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class App {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(HelloWorldConfig.class); //go look at the hello world config, that config knows about my bean

        HelloWorld helloWorld = (HelloWorld)ctx.getBean(HelloWorld.class); //I still need to cast it to helloworld because it is not the pojo type of object creation, but its bean factory

        helloWorld.setMessage("Hello World!");
        helloWorld.getMessage();

        WithFries withFries = new WithFries();
        System.out.println(withFries.toString());
        withFries.toggleFlSalted();
        System.out.printf("Just toggled withFries and now they are '%s'.", withFries.toString());

    }
}