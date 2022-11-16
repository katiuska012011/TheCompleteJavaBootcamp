package ExeptionHandling.workbooks.vendinMachine;

import java.util.Scanner;

import ExeptionHandling.workbooks.vendinMachine.models.Item;
import ExeptionHandling.workbooks.vendinMachine.models.Machine;



public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");

        Item[][] items = new Item[][] { 
            { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) }, 
            { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) }, 
            { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
            };
        Machine machine = new Machine(items);

        System.out.println(machine);

        while (true) {
            System.out.print("Pick a row: ");
            int row = scan.hasNextInt() ? scan.nextInt() : 404;
            scan.nextLine();
            System.out.print("Pick a spot in the row: ");
            int spot = scan.hasNextInt() ? scan.nextInt() : 404;
            scan.nextLine();

            if(machine.isEmpty()){
                throw new IllegalArgumentException("EMPTY SLOT");
            }

            if(spot == 404 || row == 404){
                throw new IllegalArgumentException("INVALID INPUT");
            }

            if(machine.getLength() < spot && machine.getRowLength() <row){
                throw new IllegalArgumentException("INVALID RANGE");
            }

            machine.dispense(row, spot);
            System.out.println("\n" + machine);
            System.out.print("\nEnjoy your drink! Press 1 to purchase another: ");
            
            if (!scan.next().equalsIgnoreCase("1")) {
                break;
            }
        }
        scan.close();
    }
}
