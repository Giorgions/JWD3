package pl.edu.wszib.inner;

public class Outer3 {

    public static class Inner {}

    public static Inner instantiate() {
        return new Inner();
    }

    public static void main(String[] args) {
        //Outer3 outer3 = new Outer3();
        Inner inner = new Inner();
        Inner inner1 = instantiate();
    }
}


class Outer4 {
    public static void main(String[] args) {
        Outer3 outer3 = new Outer3();
        Outer3.Inner inner = new Outer3.Inner();
        Outer3.Inner inner1 = Outer3.instantiate();
    }
}

class Outer5 {
    enum MyEnum {}
    interface MyInterface {}
}