package Lab13;

public class PackageTesterApp {
    public static void main(String[] args) {

        Lab13.Pack1.PackageTester pt1 = new Lab13.Pack1.PackageTester();
        Lab13.Pack2.PackageTester pt2 = new Lab13.Pack2.PackageTester();
        Lab13.Pack3.PackageTester pt3 = new Lab13.Pack3.PackageTester();

        pt1.introduce();
        pt2.introduce();
        pt3.introduce();
    }
}
