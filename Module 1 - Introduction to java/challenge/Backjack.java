package challenge;

import java.util.Scanner;

public class Backjack {
     public static  Scanner scan = new Scanner(System.in);

     public static void main(String[] args) {
          System.out.println("\nWelcome to Java Casino!");
          System.out.println("Do you have a knack for Black Jack?");
          System.out.println("We shall see..");
          System.out.println("..Ready? Press anything to begin!");
          scan.nextLine();

          int firstCard = randomCard();
          int secondCard = randomCard();

          System.out.println("You get a \n" + cardString(firstCard) + "\nand a \n"+cardString(secondCard));

          int total = Math.min(firstCard, 10) + Math.min(secondCard, 10);
          System.out.println("You total is: "+total+"\n");

          int dealerFirst = randomCard();
          int dealerSecond = randomCard();

          System.out.println("\nThe dealer shows \n"+cardString(dealerFirst) +"\n and has a card facing down \n"+faceDown());
          int dealertotal = Math.min(dealerFirst, 10) + Math.min(dealerSecond, 10);
          System.out.println("The dealer's total is hidden");

          while(true){
               String option = hitOrStay();
               if(option.equals("stay")){
                    break;
               }
               int randomCard = randomCard();
               System.out.println("You get a \n"+cardString(randomCard));
               total += Math.min(randomCard, 10);
               System.out.println("You total is: "+total); 

               if(total>21){
                    System.out.println("Bus! Player loses");
                    System.exit(0);
               }
           
          }

          System.out.println("Its Dealer's turn");
          System.out.println("\nThe dealer cards are \n"+cardString(dealerFirst) +"\n and  \n"+cardString(dealerSecond));
          System.out.println("Dealer's total is: "+dealertotal);


               while(dealertotal <17){
                    int newCard = randomCard();
                    System.out.println("Dealer gets a \n"+cardString(newCard));
                    dealertotal += Math.min(newCard, 10);
                    System.out.println("Dealer's total is: "+dealertotal);

               }
               if(dealertotal >21){
                    System.out.println("Bus! Dealer loses");
                    System.exit(0);
               }
                if(total > dealertotal){
                    System.out.println("Player wins!");
               }else{
                    System.out.println("Dealer winds!");
               }
               scan.close();
    }    


     public static String hitOrStay(){

          System.out.println("Would you like to 'hit' or 'stay'?");
          String option = scan.nextLine();

          while(!(option.equalsIgnoreCase("hit") || option.equalsIgnoreCase("stay"))){
               System.out.println("Please write 'hit' or 'stay'");
               option = scan.nextLine();
          }
          return option;
     }

     public static String faceDown(){

          return
          "   _____\n"+
          "  |     |\n"+ 
          "  |  J  |\n"+
          "  | JJJ |\n"+
          "  |  J  |\n"+
          "  |_____|\n";
     }

     public static int randomCard(){
          double number = Math.random() *13;
           number +=1;
          return (int)number;
     }

     public static String cardString(int cardNumber) {

          String card = "";

          switch (cardNumber) {
          case 1:
              card = "   _____\n" + "  |A _  |\n" + "  | ( ) |\n" + "  |(_'_)|\n" + "  |  |  |\n" + "  |____V|\n";
              break;
          case 2:
              card = "   _____\n" + "  |2    |\n" + "  |  o  |\n" + "  |     |\n" + "  |  o  |\n" + "  |____Z|\n";
              break;
          case 3:
              card = "   _____\n" + "  |3    |\n" + "  | o o |\n" + "  |     |\n" + "  |  o  |\n" + "  |____E|\n";
              break;
          case 4:
              card = "   _____\n" + "  |4    |\n" + "  | o o |\n" + "  |     |\n" + "  | o o |\n" + "  |____h|\n";
              break;
          case 5:
              card = "   _____ \n" + "  |5    |\n" + "  | o o |\n" + "  |  o  |\n" + "  | o o |\n" + "  |____S|\n";
              break;
          case 6:
              card = "   _____ \n" + "  |6    |\n" + "  | o o |\n" + "  | o o |\n" + "  | o o |\n" + "  |____6|\n";
              break;
          case 7:
              card = "   _____ \n" + "  |7    |\n" + "  | o o |\n" + "  |o o o|\n" + "  | o o |\n" + "  |____7|\n";
              break;
          case 8:
              card = "   _____ \n" + "  |8    |\n" + "  |o o o|\n" + "  | o o |\n" + "  |o o o|\n" + "  |____8|\n";
              break;
          case 9:
              card = "   _____ \n" + "  |9    |\n" + "  |o o o|\n" + "  |o o o|\n" + "  |o o o|\n" + "  |____9|\n";
              break;
          case 10:
              card = "   _____ \n" + "  |10  o|\n" + "  |o o o|\n" + "  |o o o|\n" + "  |o o o|\n" + "  |___10|\n";
              break;
          case 11:
              card = "   _____\n" + "  |J  ww|\n" + "  | o {)|\n" + "  |o o% |\n" + "  | | % |\n" + "  |__%%[|\n";
              break;
          case 12:
              card = "   _____\n" + "  |Q  ww|\n" + "  | o {(|\n" + "  |o o%%|\n" + "  | |%%%|\n" + "  |_%%%O|\n";
              break;
          case 13:
              card = "   _____\n" + "  |K  WW|\n" + "  | o {)|\n" + "  |o o%%|\n" + "  | |%%%|\n" + "  |_%%%>|\n";
              break;
          default:
          }
          return card;
      }
}
