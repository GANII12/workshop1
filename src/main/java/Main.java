import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    BirdRepository birdRepository = new BirdRepository();
    UserInterface ui = new UserInterface();
    public static void main(String[] args) {
          Main main = new Main();
          int option =0;
          while(option !=7) {
              option = main.ui.showMainMenu();
              main.handleUserSelection(option);
         }

    }

    public void handleUserSelection(int option){
        switch (option){
            case 1:
                Bird parrot = new Parrot();
                Bird penguin= new Penguin();
                Bird duck = new Duck();

                birdRepository.add(duck);
                birdRepository.add(penguin);
                birdRepository.add(parrot);
                break;
            case 2:
                System.out.println("Enter the Bird u want to Delete :");
                Scanner sc = new Scanner(System.in);
                String birdName = sc.next();
                Bird bird = birdRepository.getBird(birdName);
                birdRepository.remove(bird);
                break;
            case 3:
                System.out.println("What do u want to Update :");
                Scanner scanner = new Scanner(System.in);
                String birdNames = scanner.nextLine();
                Bird bird1 = birdRepository.getBird(birdNames);
                update(bird1);
                break;
            case 4:
                UserInterface ui1 = new UserInterface();
                ui1.printAllBirds(birdRepository.getBirdList());
                break;
            case 5:

                break;
            case 6:
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    private void update(Bird bird) {
        System.out.println("Enter your selection \n 1.Name \n 2.Colour \n 3.Gender");
        Scanner sc = new Scanner(System.in);
        int option =sc.nextInt();
        switch (option){
            case 1 :
                System.out.println("Enter the  New Name :");
                bird.name = sc.next();
                break;

            case 2 :
                setBirdColour(bird);
                break;
            case 3 :
                setBirdGender(bird);
                break;
        }
    }

    private void setBirdGender(Bird bird) {
        System.out.println("Enter the choice \n  1.MALE \n  2.FEMALE \n 3.OTHER ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                bird.gender = Bird.Gender.MALE;
                break;
            case 2:
                bird.gender = Bird.Gender.FEMALE;
                break;
            case 3:
                bird.gender = Bird.Gender.OTHER;
                break;
            default:
                System.out.println("invalid option");
        }

    }

    private void setBirdColour(Bird bird){
        System.out.println("Enter the choice \n  1.GREEN \n  2.RED \n 3.BLACK \n 4.BLUE" +
                " \n 5.PURPLE \n 6.WHITE \n 7.PINK");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option){
            case 1:
                bird.colour =Bird.Colour.GREEN;
                break;
            case 2:
                bird.colour =Bird.Colour.RED;
                break;
            case 3:
                bird.colour =Bird.Colour.BLACK;
                break;
            case 4:
                bird.colour =Bird.Colour.BLUE;
                break;
            case 5:
                bird.colour =Bird.Colour.PURPLE;
                break;
            case 6:
                bird.colour =Bird.Colour.WHITE;
                break;
            case 7:
                bird.colour =Bird.Colour.PINK;
                break;
            default:
                System.out.println("invalid option");
        }

    }



}

