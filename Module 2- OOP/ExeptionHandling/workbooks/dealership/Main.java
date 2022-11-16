package ExeptionHandling.workbooks.dealership;

import java.util.Scanner;
import ExeptionHandling.workbooks.dealership.models.Car;
import ExeptionHandling.workbooks.dealership.models.Dealership;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Car[] cars = new Car[] {
                new Car("Ford", 5000),
                new Car("Nissan", 12000),
        };

        cars[1].setMake("Mazda");
        cars[1].setPrice(8500);

        Dealership dealership = new Dealership(cars);

        System.out.println("\n************* JAVA DEALERSHIP *************");
        while (true) {
            System.out.println(dealership);
            System.out.print("Enter the spot number of the car you want to buy: ");

            if (dealership.isEmpty()) {
                System.out.println("We're sold out!");
                break;
            }
            if (!scan.hasNextInt()) {
                scan.nextLine();
                System.out.println("INVALID INPUT");
                continue;
            }

            int spot = scan.nextInt();
            scan.nextLine();

            if (dealership.getLength()-1 < spot) {
                System.out.println("Please choose a valid parking spot");
                continue;
            } else if (dealership.getCar(spot) == null) {
                System.out.println("The spot " + spot + " is empty");
                continue;
            }
            dealership.sell(spot);

            System.out.println("Type yes to continue shooping: ");

            if (!scan.nextLine().equalsIgnoreCase("yes")) {
                break;
            }

            scan.close(); 
        }

    }
}
