package usb;

import org.springframework.stereotype.Component;

@Component("souris")
public class Souris implements USB {
    @Override
    public int read() {
        System.out.println("Lecture de la souris");
        return 0;
    }
}
