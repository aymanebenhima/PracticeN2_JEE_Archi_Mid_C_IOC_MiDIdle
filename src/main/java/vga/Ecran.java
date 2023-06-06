package vga;

import org.springframework.stereotype.Component;

@Component("ecran")
public class Ecran implements VGA{

    @Override
    public void print(String message) {
        System.out.println("Affichage sur l'écran : " + message);
    }
}
