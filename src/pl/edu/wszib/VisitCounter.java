package pl.edu.wszib;

public class VisitCounter {
    private int counter;

    public void increment() { //można również bez public, wtedy jest w tym samym pakiecie
        counter++;
    }

    @Override
    public String toString() {
        return "VisitCounter{" +
                "counter=" + counter +
                '}';
    }
}
