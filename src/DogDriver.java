import java.util.Scanner;

public class DogDriver
{
    public static void main(String[] args) {
        System.out.println("The goal is to make your dog happy.\n");

        Scanner keyboard = new Scanner(System.in);
        Dog dog = DogDriver.getDogFromUser(keyboard);
        
        System.out.println("Commands: play, feed, pet, exit");
        
        boolean isHappy = false;
        while (!isHappy) {
            switch (keyboard.nextLine().trim().toLowerCase()) {
                case "play":
                    System.out.println(dog.getName()
                        + (dog.play() ? " has played with you!" : " doesn't want to play.")
                    );
                    break;
                case "feed":
                    if (dog.feed()) {
                        System.out.println(dog.getName() + " has eaten.");
                        isHappy = true;
                    }
                    else {
                        System.out.println(dog.getName() + " isn't hungry.");
                    }
                    break;
                case "pet":
                    dog.pet();
                    System.out.println(dog.getName() + " has drooled all over you!");
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Invalid input! Valid commands are: play, feed, pet, exit");
            }
    }

    public static Dog getDogFromUser(Scanner keyboard) {
        System.out.print("Enter name: ");
        String name = keyboard.nextLine();

        System.out.print("\nEnter age: ");
        int age = Integer.parseInt(keyboard.nextLine());

        return new Dog(name, age, Dog.Status.Status_Idle);;
    }
}
