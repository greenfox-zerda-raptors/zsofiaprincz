package com.greenfoxacademy.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

/**
 * Created by zsofiaprincz on 19/12/16.
 */
@Controller
public class HelloWorldDifferentLanguages {

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    String [] colors = {"#FF6EB4", "#8B008B", "#6959CD", "#00E5EE", "#00FA9A", "#CDAD00", "#D2B48C",};

    Random random = new Random();

    @RequestMapping("/web/helloworlddifferentlanguages")
    public String helloEveryone(Model model) {
        model.addAttribute("hello", getHello(hellos));
        model.addAttribute("color", getColor(colors));
        model.addAttribute("font_size", getFontSize());

        return "greet_everyone";
    }

    public String getHello(String[] hellos) {
        return hellos[random.nextInt(hellos.length)];
    }

    public String getColor(String[] colors) {
        return colors[random.nextInt(colors.length)];
    }

    public int getFontSize() {
        return random.nextInt(71) + 12;
    }
}




