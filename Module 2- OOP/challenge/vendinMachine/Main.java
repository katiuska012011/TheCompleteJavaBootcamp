package challenge.vendinMachine;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          System.out.println("\t \n************************* \t \n WELCOME TO JAVA DRINKS!\n ***********************");

          Item[][] items = new Item[][] {
                    { new Item("Pepsi", 1.99, 3), new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
                    { new Item("Fanta", 1.99, 2), new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
                    { new Item("Crush", 1.99, 2), new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) } };

          Machine machine = new Machine(items);
          System.out.println(machine);
          Scanner scan = new Scanner(System.in);

          while (true) {

               System.out.print("Pick up a row:");
               int row = scan.nextInt();

               System.out.println("Pick up a spot in the row: ");
               int spot = scan.nextInt();
               Boolean dispense = machine.dispense(row, spot);

               if (dispense == true) {
                    System.out.println(machine + "\nEnjoy you drink! Press 1 to purchase another: \n");

               } else {
                    System.out.println("\nSorry, we're out of this item. Press 1 to purchase another:");
               }

               if (scan.nextInt() != 1){
                    break;
               }
          }

          scan.close();
     }
}
