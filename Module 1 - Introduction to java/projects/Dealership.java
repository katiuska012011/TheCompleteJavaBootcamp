package projects;

import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Java Dealership");
        System.out.println(" . Select option 'a' to but a car");
        System.out.println(" . Select option 'b' to sell a car");

        String option = scan.nextLine();
        switch (option) {
            case "a": 
            System.out.println("What is your budget?");
            int budget = scan.nextInt();
            if(budget>=10000){
                System.out.println("Great! A Nissan Altima is available");
                System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
                scan.nextLine();
                String insurance = scan.nextLine();
                System.out.println("\nDo you have driver license? Write 'yes' or 'no'");
                String license = scan.nextLine();
                System.out.println("\nWhat is your credit score?");
                int creditScore = scan.nextInt();
                if(insurance.equals("yes") && license.equals("yes") && creditScore>650){
                    System.out.println("Sold! Pleasure doing business with you");
                }else{
                    System.out.println("Sorry! You are not elegible");
                }
            }else{
                System.out.println("We don't sell car under 10,000$. Sorry!");
            }
            break;
            case "b": 
            System.out.println("What is your car valued at?");
            int value = scan.nextInt();
            System.out.println("What is your selling price?");
            int price = scan.nextInt();

            if(value>price && price<=30000){
                System.out.println("We will buy you car");
            }else{
                System.out.println("Sorry! We are not interested");
            }
            break;
            default: System.out.println("Invalid option"); break;
        }

        scan.close();
    }
}
