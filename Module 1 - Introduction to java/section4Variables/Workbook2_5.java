package section4Variables;

import java.util.Scanner;

public class Workbook2_5 {
    public static void main(String[] args) {

        System.out.println("Welcome to JavaGram, let's sign up!");

        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.println("What is your last name?");
        String lastName = scan.nextLine();

        System.out.println("What city you from?");
        String city = scan.nextLine();

        System.out.println("What country is that?");
        String country = scan.nextLine();

        System.out.println("Make a username");
        String username = scan.nextLine();

        System.out.println("What is your age?");
        int age = scan.nextInt();
        
        scan.close();

        System.out.println("Thank you for joining JavaGram! \n Here is the information you entered: \n First Name:"+name+" \n Last Name: "
        +lastName+ " \n Age: "+age+" \n Username: "+username+ " \n City: "+city+"\n Country:"+country);
    
    }
}
