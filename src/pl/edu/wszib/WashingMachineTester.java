package pl.edu.wszib;

public class WashingMachineTester {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        System.out.println(wm);

        wm.modeForSensitiveClothes();
        System.out.println(wm);

        wm.modeForTowelsAndBedLinen();
        System.out.println(wm);
    }
}
