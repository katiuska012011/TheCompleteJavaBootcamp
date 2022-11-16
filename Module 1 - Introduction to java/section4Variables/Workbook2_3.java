package section4Variables;

public class Workbook2_3 {
    
    public static void main(String[] args) {
        
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;


        System.out.println("You picked 10 aplles from an apple orchard");

        numOfApples = 10;
        numOfCustomers = 3;
        profit = 4.99;

        System.out.println("Wow! So far, you made: $"+profit * numOfApples);
        System.out.println(numOfCustomers+ "Customer love your apples.");
        System.out.println("You have "+numOfApples+" apples left. We'll sell more tomorrow");
    }

}
