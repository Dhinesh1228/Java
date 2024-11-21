package tasks;

import java.util.Scanner;

public class Actor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an actor:");
        System.out.println("1. Vijay");
        System.out.println("2. Rajinikanth");
        System.out.println("3. Kamal Haasan");
        System.out.print("Enter your choice (1-3): ");
        int actorChoice = scanner.nextInt();

        if (actorChoice == 1) {
            System.out.println("1. Leo");
            System.out.println("2. Mersal");
            System.out.println("3. Puli");
            System.out.println("4. Sarkar");
            System.out.println("5. Sura");
            System.out.print("Enter your choice (1-5): ");
            int rajiniMovie = scanner.nextInt();

            switch (rajiniMovie) {
                case 1 : System.out.println("Leo: Blockbuster!");
                case 2 : System.out.println("Mersal: Blockbuster!");
                case 3 : System.out.println("Puli: Flop.");
                case 4 : System.out.println("Sarkar: Average hit.");
                case 5 : System.out.println("Sura: Flop.");
                default : System.out.println("Invalid movie choice.");
            }
        } else if (actorChoice == 2) {

        	System.out.println("You selected Rajinikanth. Choose a movie:");
            System.out.println("1. 2.0");
            System.out.println("2. Jailer");
            System.out.println("3. Kaala");
            System.out.println("4. Annatha");
            System.out.println("5. Linga");
            System.out.print("Enter your choice (1-5): ");
            int vijayMovie = scanner.nextInt();

            switch (vijayMovie) {
                case 1 : System.out.println("2.0: Blockbuster!");
                case 2 : System.out.println("Jailer: Blockbuster!");
                case 3 : System.out.println("Kaala: Average hit.");
                case 4 : System.out.println("Annatha: Flop.");
                case 5 : System.out.println("Linga: Flop!");
                default : System.out.println("Invalid movie choice.");
            }
        } else if (actorChoice == 3) {
            System.out.println("You selected Kamal Haasan. Choose a movie:");
            System.out.println("1. Vikram");
            System.out.println("2. Dasavatharam");
            System.out.println("3. Vishwarupam");
            System.out.println("4. Manmadhan ambu");
            System.out.println("5. Indian 2");
            System.out.print("Enter your choice (1-5): ");
            int kamalMovie = scanner.nextInt();

            switch (kamalMovie) {
                case 1 : System.out.println("Vikram: Blockbuster.");
                case 2 : System.out.println("Dasavatharam: Blockbuster!");
                case 3 : System.out.println("Vishwarupam: Hit!");
                case 4 : System.out.println("Manmadhan ambu: Flop!");
                case 5 : System.out.println("Indian 2: Flop.");
                default : System.out.println("Invalid movie choice.");
            }
        } else {
            System.out.println("Invalid actor choice.");
        }

        scanner.close();
    }
}