package pl.edu.wszib.podyplomowe;

public class Test {
    public static void main(String[] args) {
        System.out.println("pakiet: " + Test.class.getClass().getPackageName());

        PackagePresenter pp1 = new PackagePresenter();
        //pp1.showPackage();

        PackagePresenter pp2 = new PackagePresenter();
        //pp1.showPackage();

    }
}
