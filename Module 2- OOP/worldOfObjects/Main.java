package worldOfObjects;

import java.util.Scanner;

public class Main {
     
     public static void main(String[] args) {


          String[] parts = {"Tires", "keys"};
          Car nissan  = new Car("Nissan", 5000.00, 2020, "Blue", parts);

          Car nissan2 = new Car(nissan);
          nissan2.setParts(new String[] {"filter", "oil"});

          Car nissan3 = new Car(nissan);
          nissan3.setMake("Honda");

          Car[] cars = new Car[]{
               new Car("Nissan", 5000.00, 2020, "Blue", new String[] {"Tires", "keys"}),
               new Car("Honda", 10000.00, 2020, "Yellow", parts),
               new Car("Mercedes", 15000.00, 2010, "White", new String[] {"filter", "oil"}),               
               new Car("Dodge", 15000.00, 2019, "Orage", parts),               
               new Car("Nissan", 12000.00, 2010, "Purple", new String[] {"filter", "oil"}),               

          };

          Scanner scan = new Scanner(System.in);

          System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
          System.out.print("Welcome! Enter the type of car you're looking for: ");
          String make = scan.nextLine();
          System.out.println("Enter your budget :");
          int budget = scan.nextInt();
          
          Dealership dealership = new Dealership(cars);

          Integer search = dealership.search(make, budget);

          
          switch(search){
               case 404: System.out.println("Feel free to browse through our collection of cars.\n");
               System.out.println(dealership);
               default: scan.nextLine();
               String answer = scan.nextLine();
               if(answer.equalsIgnoreCase("yes")){
                    dealership.sell(search);
               }
               break;
          }

          scan.close();
     }
}
   