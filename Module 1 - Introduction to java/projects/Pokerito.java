package projects;

import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n Let's play Pokerito. Type anything when you're ready." 
        +"\nIt's like Poker, but a lot simpler.\n- There are two players, you and the computer."
        +"\n- The dealer will give each player one card.\n- Then, the dealer will draw five cards (the river)"
        +"- The player with the most river matches wins!\n- If the matches are equal, everyone's a winner!"
        +"- Ready? Type anything if you are.");
         scan.nextLine();

        String youCard = randomCard();
        String computerCard = randomCard();

        System.out.println("You card is: \n"+youCard + "\nHere the Computer card:\n "+computerCard);
        System.out.println("Now, the dealer will draw five cards. Press enter to continue");

        int youMatches = 0;
        int computerMatches = 0;

        for(int i = 1; i <=5; i++){
            scan.nextLine();
            String card = randomCard();

            if(youCard.equals(card)){
                youMatches++;
            }
             if(computerCard.equals(card)){
                computerMatches++;
            }
            System.out.println("Card : "+i+"\n "+card);
        }
        System.out.println("You number of matches: "+youMatches+"\n Computer number of matches: "+computerMatches);

        if(youMatches > computerMatches){
            System.out.println("You win!.");
        }else if(computerMatches>youMatches){
            System.out.println("Computer win!.");
        }else{
            System.out.println("Everyones wins!.");
        }

        scan.close();
        
    }

    public static String randomCard() {

        double number = Math.random() * 13;
        number+=1;
        String card = "";

        switch ((int) number) {
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
