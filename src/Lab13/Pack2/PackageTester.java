package Lab13.Pack2;

public class PackageTester {

    public void introduce() {
        System.out.println("Klasa znajduję się w pakiecie o nazwie " + this.getClass().getPackage().getName());
    }
}
