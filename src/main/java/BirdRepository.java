import java.util.*;

public class BirdRepository {
    private List<Bird> birdList = new ArrayList();

//     public void add(Duck duck){

    public List<Bird> getBirdList() {
        return birdList;
    }
//        birdList.add(duck);
//    }
//
//     public void add(Penguin penguin){
//
//         birdList.add(penguin);
//    }

    public void add(Bird bird) {
        birdList.add(bird);
    }
}
