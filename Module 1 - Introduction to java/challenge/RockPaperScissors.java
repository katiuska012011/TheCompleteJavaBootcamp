package challenge;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Lest's play Rock Paper Scissors. When I say 'shoot', Choose: rock, paper, or scissors. \n ");
        System.out.println("Are you ready? Write 'yes' if you are");

        String play = scan.nextLine();
        if(play.equals("yes")){
            System.out.println("Great!. \n rock -- paper -- scissors, shoot!");
            String yourChoice = yourChoice();
            String computerChoice = computerChoice();
            String result = result(yourChoice, computerChoice);
            printResult(computerChoice,yourChoice,result);
        }else{
            System.out.println("Darn, some other time");
            System.exit(0);
        }

        scan.close();
    }


    public static String result(String yourChoice, String computerChoice){ 

        String result = "";
        if(computerChoice.equals("paper") && yourChoice.equals( "scissors")){
            result = "You win";
        }else if( yourChoice.equals("rock") && computerChoice.equals("scissors")){
            result="You win!";
        }else if(computerChoice.equals("rock") && yourChoice.equals("paper")){
            result ="You win";
        }else if(computerChoice.equals("rock") && yourChoice.equals("scissors")){
            result="You lose!";
        }else if(computerChoice.equals("papper") && yourChoice.equals("rock")){
            result="You lose!";
        }else if(computerChoice.equals("scisssors") && yourChoice.equals("paper")){
            result="You lose!";
        }else if(computerChoice.equals(yourChoice)){
            result="You choice equals computer choice";
        }

        return result;
    }

    public static String yourChoice(){
        
        Scanner scan = new Scanner(System.in);
        String userChoice = scan.nextLine();
        return userChoice; 

    }

    public static String computerChoice(){

        double numRandom = Math.random()*3;

        String choice = "";
       int num = (int)numRandom; // rangeL 0-2

        switch (num) {
            case 0: choice = "rock"; break;
            case 1: choice = "paper"; break;
            case 2: choice = "scissors"; break;
            default: return ""; 
        }
        return choice.toString();
    }

    public static void printResult(String computerChoice, String yourChoice,String result ){
        System.out.println("Your choice: "+yourChoice);
        System.out.println("Computer choice:"+computerChoice);  
        System.out.println("Result: "+result);  
    }
}
