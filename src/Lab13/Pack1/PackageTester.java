package Lab13.Pack1;

public class PackageTester {

    public void introduce() {
        System.out.println("Klasa znajduję się w pakiecie o nazwie " + this.getClass().getPackage().getName());
    }
}
