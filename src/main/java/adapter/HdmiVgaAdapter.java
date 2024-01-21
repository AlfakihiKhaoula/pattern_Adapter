package adapter;

import computer.Hdmi;
import computer.TV;
import computer.Vga;

public class HdmiVgaAdapter implements Vga {
    private Hdmi hdmi;
    @Override
    public void print(String msg) {
        System.out.println(";;;;;;;;Adapter;;;;;;;");
        byte[] data = msg.getBytes();
        hdmi.view(data);
        System.out.println(";;;;;;;;Adapter;;;;;;;");
    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
