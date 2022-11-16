package challenge;

import java.util.Scanner;

public class Trivia {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int score = 0;
        System.out.println("\nWhich country held the 2016 Summer Olympics?");
        System.out.println("\na) China \nb)Ireland \nc)Brazil \nd) Italy");
        String answer = scan.nextLine();
        if(answer.equals("c")){
            score += 5;
        }
        System.out.println("Which planet is the hottest?");
        System.out.println("\na)Venus \nb)Saturn \nc)Mercuty \nd)Mars");
        String answer1= scan.nextLine();
        if(answer1.equals("a")){
            score +=  5;
        }
        System.out.println("What is the rarest blood type?");
        System.out.println("\na)0 \nb)A \nc) B \nd)AB-Negative");
        String answer2 = scan.nextLine();
        if(answer2.equals("d")){
            score += 5;
        }
        System.out.println("Which one of these characters is friends with Harry Potter?");
        System.out.println("\na)Ron Weasley \nb)Herminoe Granger \nc)Draco Malfoy");
        String answer3 = scan.nextLine();
        if(answer3.equals("a") || answer3.equals("b")){
            score += 5;
        }

        if(score >= 15){
            System.out.println("Wow, you know your stff! \n Your score is: "+score+ " /20");
        }else if(score < 15 && score>=5){
            System.out.println("Not bad!\n Your score is: "+score+ " /20");
        }else{
            System.out.println("Better luck next time! \n Your score is: "+score+ " /20");
        }

        scan.close();
    }
}
