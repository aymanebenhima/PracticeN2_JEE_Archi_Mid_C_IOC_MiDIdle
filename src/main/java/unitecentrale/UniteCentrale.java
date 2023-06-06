package unitecentrale;

import org.springframework.beans.factory.annotation.Autowired;
import usb.USB;
import vga.VGA;

public class UniteCentrale {

    @Autowired
    private VGA vga = null;

    @Autowired
    private USB usb = null;

    public UniteCentrale(VGA vga, USB usb) {
        this.vga = vga;
        this.usb = usb;
    }

    public int readData() {
        return usb.read();
    }

    public void printData(String data) {
        vga.print(data);
    }
}
