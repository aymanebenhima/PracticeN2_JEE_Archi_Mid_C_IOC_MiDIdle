package hdmi;

public class Tv implements HDMI{
    @Override
    public void print(byte[] data) {
        System.out.println("Affichage sur la TV : " + new String(data));
    }
}
