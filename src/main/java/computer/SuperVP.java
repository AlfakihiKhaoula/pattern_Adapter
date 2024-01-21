package computer;

public class SuperVP implements Vga,Hdmi{
    @Override
    public void view(byte[] data) {
        String msg = new String(data);
        System.out.println("........Super VP HDMI........");
    }

    @Override
    public void print(String msg) {
        System.out.println("........Super VP VGA.........");
        System.out.println(msg);
        System.out.println(".........Super VP VGA........");


    }
}
