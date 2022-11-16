package section12;
import java.util.Arrays;
import java.util.Scanner;


import javax.sound.sampled.SourceDataLine;

public class Woorkbooks {


     public static void main(String[] args) {
          Workbooks6_14();
        // TwoDArrays();
     }

     public static void Workbooks6_1(){
          String[] seats = {"Harry", "Neville", "Ron", "Hermione", "Seamus"}; 
          System.out.println("It's time to take your fifth year exams. Please, take your seats");
          System.out.println(seats[0]+" , you will take seat 0");
          System.out.println(seats[1]+" , you will take seat 1");
          System.out.println(seats[2]+" , you will take seat 2");
          System.out.println(seats[3]+" , you will take seat 3");
          System.out.println(seats[4]+" , you will take seat 4");

     }

     public static void Workbooks6_2(){
          String [] kingdoms = {"Malfoy", "Crabbe","Goyle","Pansy","Dean"};

          for(int i=0; i < kingdoms.length; i++){
               System.out.println(kingdoms[i]);
          }
     }

     public static void Workbooks6_3(){
          String [] aisle = {"apples", "bananas","candy","chocolate","coffee","tea"};

          for(int i=4; i < aisle.length; i++){
               System.out.println("Do you sell coffe?\n We have that in aisle :"+i);
          }
     }

     public static void Workbooks6_4(){
          Scanner scan = new Scanner(System.in);
          System.out.println("Welcome to Java Grocers \nWhat can I help you find?");
          String choice = scan.nextLine();
          String [] aisle = {"apples", "bananas","candy","chocolate","coffee","tea"};

          for(int i=0; i <= aisle.length; i++){
               if(choice.equals(aisle[i])){
                    System.out.println("We have that in aisle :"+i);
                    break;
               }
          }
          scan.close();
     }

     public static int randomNumber(){
          double number = Math.random() * 50000;
          return (int) number;
     }

     public static void Workbooks6_5(){
          Integer [] aisle = {randomNumber(), randomNumber(), randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber()};
          int highScore = 0;
          int actual = 0;

          for(int i=0; i < aisle.length; i++){
               System.out.print(" "+aisle[i]);
          }
          for(int i=0; i < aisle.length; i++){
               highScore = Integer.max( aisle[i], actual);
               if(highScore > actual){
                    actual = highScore;
               }
          }
          System.out.print("\n\n The highest score is "+highScore);
     }

     public static void Workbooks6_8(){
          String [] apples = {"Gala", "Granny Smith", "Macintosh"};
          Double [] price = {1.99, 1.49, 1.29};

          for(int i=0; i<apples.length; i++){
               for(i=0; i<price.length; i++){
                    System.out.println(apples[i]+ ":"+price[i]);
               }
          }
         
     }

     public static void UpdatingArrays(){

          String [] menu = {"Latte", "Expresso", "Americano"};
          menu[1]= "Iced Coffe ";
          System.out.println(Arrays.toString(menu));

          String [] newMenu = new String[5];

          for(int i=0; i<menu.length; i++){
               newMenu[i] = menu[i];
          }
          newMenu[3]="Macciato";
          newMenu[4]="Dark Roast";
          System.out.println(Arrays.toString(newMenu));
     }

     public static void Workbooks6_9(){
          Double [] prices = {1.99,2.99,3.99,4.999};
          Double [] afterTaxes = new Double[4];
          System.out.println("The original prices are:"+Arrays.toString(prices));

          for(int i= 0; i <prices.length; i++){
               afterTaxes[i] = (prices[i])*prices[i];
          }
          System.out.println("The prices after tax are:"+Arrays.toString(afterTaxes));
     }

     public static void Workbooks6_10(){

          Scanner scan = new Scanner(System.in);
          System.out.println("How many pizza toppings do you want?");
          var number = scan.nextInt();
          String [] numberOfTop = new String[number];
          System.out.println("Great, enter each tooping!");
          var toop = "";


          for(int i=0; i<numberOfTop.length; i++){
               String choose  =  (i+"."+(toop = scan.next())); 
               numberOfTop[i] = choose;
               System.out.println(choose);

          }
          System.out.println("Thank you! Here are the toopings you ordered");
          for(int i=0; i <numberOfTop.length; i++){
               System.out.println(numberOfTop[i]);
          }

          scan.close();

     }

     // Workbook 6.11
     public static void Workbooks6_11(){
         double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
         double [] fahrenheit =  celciusToFahrenheit(celsius);
         printTemperatures(celsius, "Celcius");
         printTemperatures(fahrenheit, "Fahrenheit");
     }

     public static double [] celciusToFahrenheit(double [] celcius){
          double [] fahrenheit = Arrays.copyOf(celcius, celcius.length);

          for(int i= 0; i<celcius.length; i++){
               fahrenheit[i] = (celcius[i] /5 * 9) + 32;
          }
          return fahrenheit;
     }

     public static void printTemperatures(double[] temp, String type){

          System.out.print(type+" :");
          for(int i = 0; i<temp.length; i++){
          System.out.print(String.format("%.2f", temp[i]) + "  "); 
          }
          System.out.print(" \n");
     }

     // Workbook 6.12

     public static void Workbooks6_12(){

          int [] ticket = {34, 43, 45, 65, 21, 54};
          int [] ticket2 = Arrays.copyOf(ticket, ticket.length);
          ticket2[2] = 54;

          System.out.print("Ticket 1 numbers: ");
          printTicketNumbers(ticket);

          System.out.print("Ticket 2 numbers: ");
          printTicketNumbers(ticket2);

     }

     public static void printTicketNumbers( int [] ticket){

          for(int i = 0; i<ticket.length; i++){
               System.out.print(ticket[i] + " ");
          }
          System.out.print("\n");
     }

     //2D arrays 
     // We can 2 dimencional arrays to store data that come in the 
     // form of a table.
     public static void TwoDArrays(){

          int [][] grades = {
               {72,74,76,78},
               {65,64,61,67},
               {95,91,98,100},

          };
          // nested loop

          for(int i=0; i<grades.length; i++){

               switch(i){
                    case 0: System.out.print("\tHarry ") ;break;
                    case 1:System.out.print("\tRon ") ;break;
                    case 2:System.out.print("\tHermione ") ;break;
               }
               for(int j=0; j<grades[i].length; j++){
                    System.out.print(grades[i][j] + " ");
               }
               System.out.print("\n");
          }

     }

     public static void Workbooks6_13(){

          double [][] prices = {
               {12.99, 8.99, 9.99, 10.49, 11.99},
               {0.99,1.99,2.49,1.49,2.99},
               {8.99, 7.99, 9.49,9.99,10.99}
          };

        for(int i = 0; i<prices.length; i++){
             switch (i){
                  case 1: System.out.print("Baking: "); break;
                  case 2: System.out.print("Beverage: "); break;
                  case 3: System.out.print("Cereals: "); break;
             }
             for(int j= 0; j<prices[i].length; j++){
                  System.out.print(prices[i][j]);
             }
             System.out.print("\n");
        }

     }


     public static int randomNumber2(){
          double number = Math.random() * 100;
          return (int) number;
     }
     
     public static void Workbooks6_14(){

          int [][] numbers = new int [100][10];

          for(int i = 0; i<numbers.length; i++){
               for(int j = 0; j<numbers[i].length; j++){
                    numbers[i][j] = randomNumber2();
               }
               print2DAray(numbers);
          }

     }
     public static int [][] print2DAray( int [][] numbers){

          for(int i= 0; i<numbers.length; i++){
               for(int j = 0; j <numbers[i].length; j++){
                    System.out.print(numbers[i][j] + " ");
               }
               System.out.print("\n");
          }
          return numbers;
     }
}
