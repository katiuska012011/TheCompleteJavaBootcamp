package section10Loops;

import java.util.Scanner;


public class WhileLoops {
    public static void main(String[] args) {
        workbook5_11();
    }

    //While lopps is used when u don't know how manny a code need to run
    public static void workbook5_8(){

        System.out.println("I choose a number between 1 and 5. Try to guess it");
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();

        while(guess != 2){
            guess = scan.nextInt();
            if(guess == 2){
                System.out.println("You got it!");
            }
        }
        scan.close();
    }

    public static void workbook5_9(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Javagram! Sign in below");

        String user = scan.nextLine();
        System.out.println("Username: "+user);
        String pass = scan.nextLine();
        System.out.println("Password: "+pass);

        while(user != "katiuska" && pass != "admin"){
            user = scan.nextLine();
            System.out.println("Username: "+user);
            pass = scan.nextLine();             
            System.out.println("Password: "+pass);

            if(user.equals("katiuska" ) && pass.equals("admin")){
                System.out.println("You sign in");
            }
        }
        
        scan.close();
    }

    public static  int rollDice(){
        
        double number = Math.random() * 7;
        return (int) number;

    }

    public static void workbook5_10(){
        int dice1 = rollDice();
        int dice2 = rollDice();
        System.out.println("Dice 1: "+dice1+" \nDice 2: "+dice2+ " \n");

        while (dice1 != dice2){
           dice1 = rollDice();
           dice2 = rollDice();
            System.out.println("Dice 1: "+dice1+" \nDice 2: "+dice2+ " \n");
            if(dice1 == dice2){
                System.out.println("You rolled doubles.");
            }

        }
    }

    /**
     * 
     */
    public static void workbook5_11(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lest's play Rolling Java. Try anything to start.\n");
        System.out.println("Great, here are the rules:\nIf you roll a 6 the game stops."+
        " \nIf you roll a 4 nothing happends.\nOtherwise you get 1 point.\nYou must collect at least 3 points to win. Enter anything to roll");
        int point = 0;

        while(scan.nextBoolean()){

            int diceRoll = rollDice();
            System.out.println("You roll a "+diceRoll);

            if(diceRoll == 6){
                System.out.println("End of the game\n");
            }else if(diceRoll == 4){
                System.out.println("Zero point. keep going");
            }else{
                System.out.println("One point. keep going");
                point +=1;
            }

            if(diceRoll == 6 && point>=3){
                System.out.println("Your score is:"+point+" \nWow, that's lucky. You win.");
                System.exit(0);
            }else if(diceRoll ==6 && point<3){
                System.out.println("\nYour score is:"+point+". \nBetter luck");
                System.exit(0);
            }

        }
        scan.close();
    }
}

