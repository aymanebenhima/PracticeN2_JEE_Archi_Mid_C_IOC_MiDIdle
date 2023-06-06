package vga;

import hdmi.HDMI;

public class HDMItoVGAAdapter implements VGA {
    private HDMI hdmi;

    public HDMItoVGAAdapter(HDMI hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void print(String message) {
        byte[] data = message.getBytes();
        hdmi.print(data);
    }
}
