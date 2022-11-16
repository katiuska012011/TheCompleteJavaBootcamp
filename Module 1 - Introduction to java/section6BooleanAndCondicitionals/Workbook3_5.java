package section6BooleanAndCondicitionals;

public class Workbook3_5 {
    public static void main(String[] args) {
        
        int day = 8;
        boolean holiday= true;

        if(day <= 5){
            System.out.println("Wake up at 7:00 :(");
        }else if(day<= 6 || day<=7){
            System.out.println("It's the weekend, no work");
        }else{
            System.out.println("Woohoo, its holiday "+ holiday);
        }
    }
}
