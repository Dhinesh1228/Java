package tasks;

import java.util.Scanner;

public class Heroin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an actress:");
        System.out.println("1. Samantha");
        System.out.println("2. Nayanthara");
        System.out.println("3. Trisha");
        System.out.print("Enter your choice (1-3): ");
        int actressChoice = scanner.nextInt();

        switch (actressChoice) {
            case 1 : {
                // Samantha's 
                System.out.println("You selected Samantha. Choose an actor:");
                System.out.println("1. Surya ");
                System.out.println("2. Vijay Sethupathy");
                System.out.println("3. Shyam");
                System.out.print("Enter your choice (1-3): ");
                int actorChoice = scanner.nextInt();

                switch (actorChoice) {
                    case 1 : System.out.println("Surya and Samantha starred in: Anjan.");
                    case 2 : System.out.println("Vijay Sethupathy and Samantha starred in: Kaathuvakula rendu kaadhal.");
                    case 3 : System.out.println("Shyam and Samantha have not starred together.");
                    default : System.out.println("Invalid actor choice.");
                }
            }
            case 2 : {
                // Nayanthara's pair
                System.out.println("You selected Nayanthara. Choose an actor:");
                System.out.println("1. Vijay");
                System.out.println("2. Shyam");
                System.out.println("3. Dhanush");
                System.out.print("Enter your choice (1-3): ");
                int actorChoice = scanner.nextInt();

                switch (actorChoice) {
                    case 1 : System.out.println("Vijay and Nayanthara starred in: Villu.");
                    case 2 : System.out.println("Shyam and Nayanthara have not starred together.");
                    case 3 : System.out.println("Dhanush and Nayanthara starred in: Yaaradi Nee Mogini.");
                    default : System.out.println("Invalid actor choice.");
                }
            }
            case 3 : {
                // Kajal Aggarwal's pair
                System.out.println("You selected Trisha. Choose an actor:");
                System.out.println("1. Vijay");
                System.out.println("2. Ajith");
                System.out.println("3. Vikram");
                System.out.print("Enter your choice (1-3): ");
                int actorChoice = scanner.nextInt();

                switch (actorChoice) {
                    case 1 : System.out.println("Vijay and Trisha starred in: Leo.");
                    case 2 : System.out.println("Ajith and Trisha starred in: Greedam.");
                    case 3 : System.out.println("Sivakarthikeyan and Trisha have not starred together.");
                    default : System.out.println("Invalid actor choice.");
                }
            }
            default : System.out.println("Invalid actress choice.");
        }

        scanner.close();
    }
}
