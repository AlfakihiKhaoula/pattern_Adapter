package computer;

public class Ecran implements Vga{
    @Override
    public void print(String msg) {
        System.out.println("======Ecran==========");
        System.out.println(msg);
        System.out.println("=======Ecran=========");
    }
}
