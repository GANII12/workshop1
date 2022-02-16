public abstract class Bird {
    public boolean eat;

    void eat(){
        System.out.println(getClass().getSimpleName() + " " + "can eat");
    }

    boolean doesMakesNest(){
        return false;
    }
}
