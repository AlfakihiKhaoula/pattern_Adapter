package adapter;

import computer.Hdmi;
import computer.TV;
import computer.Vga;

public class HdmiVgaAdapterHeritage extends TV implements Vga {

    @Override
    public void print(String msg) {
        System.out.println(";;;;;;;;Adapter;;;;;;;");
        byte[] data = msg.getBytes();
        super.view(data);
        System.out.println(";;;;;;;;Adapter;;;;;;;");
    }

}
