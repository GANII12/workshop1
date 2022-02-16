public class Duck extends Bird implements Flyable, Swimable {
    @Override
    public void fly() {

    }

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }

    @Override
    void eat() {

    }
}
