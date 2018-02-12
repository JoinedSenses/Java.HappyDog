import java.util.Scanner;

public class DogDriver
{

    public static void main(String[] args)
    {
    	boolean gameOver = false;
        System.out.println("The goal is to make your dog happy.");
        System.out.println();

        Scanner keyboard = new Scanner(System.in);
        Dog dog = DogDriver.getDogFromUser(keyboard);
        System.out.println("Commands: play, feed, pet, exit");
        String line = keyboard.nextLine();
        while (!line.equals("exit")) //exit means they're done
        {
            if (line.equals("play"))
            {
                boolean result = dog.play();
                if (result)
                {
                    System.out.println(dog.getName() + " has played with you!");
                }
                else
                {
                    System.out.println(dog.getName() + " doesn't want to play.");
                }
            }
            else if (line.equals("feed"))
            {
                boolean result = dog.feed();
                if (result)
                {
                    System.out.println(dog.getName() + " has eaten.");
                    gameOver = true;
                    break;
                }
                else
                {
                    System.out.println(dog.getName() + " isn't hungry.");
                }
            }
            else if (line.equals("pet"))
            {
                dog.pet();
                System.out.println(dog.getName() + " has drooled all over you!");
            }
            else
            {
                System.out.println("Invalid command! Valid commands are: play, feed, pet, exit");
            }
            line = keyboard.nextLine();
        }
        if (gameOver == true) {
        	System.out.println("Congrats! " + dog.getName() + " is happy!");
        }
    }

    public static Dog getDogFromUser(Scanner keyboard)
    {
        String name;
        int age;

        System.out.print("Enter name: ");
        name = keyboard.nextLine();

        System.out.println();
        System.out.print("Enter age: ");
        age = Integer.parseInt(keyboard.nextLine());

        Dog dog = new Dog(name, age, Dog.Status.Status_Idle);
        return dog;
    }
}