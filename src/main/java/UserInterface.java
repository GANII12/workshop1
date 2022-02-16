import java.util.List;

public class UserInterface {
    void printAllBirds(List<Bird> list){
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
