package pl.edu.wszib;

public class VisitCounterTester {
    public static void main(String[] args) {
        VisitCounter vc = new VisitCounter();
        vc.increment();
        vc.increment();
        vc.increment();


        System.out.println(vc);
    }
}
