package projects;

import java.util.Scanner;

public class Javapedia {
     
     public static void main(String[] args) {
          
          Scanner scan = new Scanner(System.in);
          System.out.println("****** JavaPedia ********");
          System.out.println("How many historial will you register?");
          int value = scan.nextInt();

          String [][] database = new String[value][3];

          scan.nextLine();
          for(int i=0; i<database.length; i++){
               System.out.println(" \n \tFigure "+(i+1));
               System.out.print("Name: ");
               database[i][0] = scan.nextLine();
               System.out.print("Date of Birth: ");
               database[i][1] = scan.nextLine();
               System.out.print("Ocupation: ");
               database[i][2] = scan.nextLine();
          }

          System.out.print("\nThere are the values you stored:\n");
          print2DArray(database);
          System.out.print("\nWho do you want information on? ");
          String name = scan.nextLine();

          for(int i = 0; i<database.length; i++){
               if(database[i][0].equals(name)){
                    System.out.print("\n Name: "+database[i][0]);
                    System.out.print("\n Date of Birth: "+database[i][1]);
                    System.out.print("\n Ocupation: "+database[i][2]);

               }
          }
          scan.close();
     }

     public static void print2DArray(String [][] array){

          for(int i= 0; i<array.length; i++){
               for(int j=0; j<array[i].length; j++){
                    System.out.print(array[i][j] + " ");
               }
               System.out.print("\n");
          }
     }



}
