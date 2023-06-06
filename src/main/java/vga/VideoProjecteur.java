package vga;

import org.springframework.stereotype.Component;

@Component("videoProjecteur")
public class VideoProjecteur implements VGA{
    @Override
    public void print(String message) {
        System.out.println("Affichage sur le video projecteur : " + message);
    }
}
