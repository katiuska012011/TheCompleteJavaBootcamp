package section10Loops;

import java.util.Scanner;

public class ForLoops {
    
    public static void main(String[] args) {
        workbook5_7();
    }

    public static void workbook5_1(){
        String message = "If Java was easy, they would call it Python! ";
        for(int i=0; i<=10; i++){
            System.out.println(message);
        }
    }

    public static void workbook5_2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What you want to write? ");
        String bartDetention = scan.nextLine();
        for(int i = 1; i<=99; i++){
            System.out.println(i+ " - "+bartDetention);
        }
        scan.close();
    }

    public static void workbook5_3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What number do you wanna count?");
        int number = scan.nextInt();

        for(int i =0; i <= number; i++){
            System.out.print(i);
        }
        scan.close();
    }

    public static void workbook5_4(int y){
        for(int i=y; i>=0; i--){
            System.out.println(i);
         System.out.println( i + "bottles of beer on the wall,"+i+ " bottles of beer! take one down, pass it around " +(i-1)  + " bottles of beer on the wall");
        }
    }

    public static void workbook5_5(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a number to count by");
        int count = scan.nextInt();
        System.out.println("Write a number to count from");
        int start = scan.nextInt();
        System.out.println("Write a number to count until");
        int stop = scan.nextInt();

        for(int i=start; i<=stop; i+=count){
            System.out.print(i);
        }
        scan.close();
    }

    public static void workbook5_6(){
        int number = 19;
        for( int i=0; i<=number; i++){
            if( i % 2 == 0){
                System.out.println(i+" - even");
            }else{
                System.out.println(i+" - odd");
            }
        }
    }

    public static void workbook5_7(){
        int number = 18;
        for(int i=0; i<=number; i++){
            
            if(i%3 == 0 && i%5 == 0){
                System.out.println(i+" FrizzBuzz");
            }else if (i%5==0){
                System.out.println(i+" Buzz");
            }else if(i%3 ==0){
                System.out.println(i+" Frizz");
            }
        }
    }

}


