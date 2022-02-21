public class Penguin extends Bird implements Swimable {
    public Penguin(){

        name = "penguin";
        colour = Colour.BLACK;
    }

    @Override
    public void swim() {
        System.out.println("Penguin can swim.");
    }

    @Override
    void eat() {

    }
}
