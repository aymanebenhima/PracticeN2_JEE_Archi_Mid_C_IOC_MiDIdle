package usb;

import org.springframework.stereotype.Component;

@Component("clavier")
public class Clavier implements USB {
    @Override
    public int read() {
        System.out.println("Lecture du clavier");
        return 0;
    }
}
