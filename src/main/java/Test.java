import adapter.HdmiVgaAdapter;
import adapter.HdmiVgaAdapterHeritage;
import computer.*;

public class Test {


    public static void main(String[] args) {
        UnitCentre unitCentre = new UnitCentre();
        unitCentre.setVga(new Ecran());
        unitCentre.print("Hello");
        unitCentre.setVga(new VideoProjecteur());
        unitCentre.print("Bonjour");


        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        unitCentre.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.print("Bonjour Master II-BDDC Design pattern");
        unitCentre.setVga(new SuperVP());
        unitCentre.print("Hello");

        HdmiVgaAdapterHeritage hdmiVgaAdapterHeritage = new HdmiVgaAdapterHeritage();
        unitCentre.setVga(hdmiVgaAdapterHeritage);
        hdmiVgaAdapter.print("Test Heritage");

        unitCentre.setVga(new SuperVP());
        unitCentre.print("Hello");


        HdmiVgaAdapter hdmiVgaAdapter1 = new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVP());
        unitCentre.setVga(hdmiVgaAdapter1);
        unitCentre.print("Bonjour ");

    }
}
