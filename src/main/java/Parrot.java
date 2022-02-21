public class Parrot extends Bird implements Flyable {
    public Parrot(){
        name = "parrot";
        colour = Colour.GREEN;
    }
    @Override
    public void fly() {
        System.out.println("Parrot can fly.");
    }
}
