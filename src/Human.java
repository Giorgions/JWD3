public class Human {

    public void eat() {
        System.out.println("Human is eating");
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.eat();

        Human human = new Human();
        human.eat();
    }
}
