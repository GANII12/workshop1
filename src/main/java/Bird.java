public abstract class  Bird {
    enum Colour {
        GREEN, RED, BLACK, BLUE, PURPLE, WHITE , PINK
    }

    enum Gender {
        MALE , FEMALE , OTHER
    }

    String name;
    Colour colour;
    Gender gender;

    public boolean eat;

    void eat(){

        System.out.println(getClass().getSimpleName() + " " + "can eat");
    }

    boolean doesMakesNest(){

        return false;
    }
}
