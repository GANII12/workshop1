import java.util.List;
import java.util.Scanner;

public class UserInterface {
    void printAllBirds(List<Bird> list){
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    public int showMainMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option : 1. Add Bird \n 2. Remove Bird \n " +
                " 3. Update the Bird \n 4. Print all Birds \n 5. Print Swimmable Birds \n " +
                "6. Print Flyable Birds \n 7. Exit ");
        return (sc.nextInt());

    }
}
