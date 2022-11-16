import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new 
            FileInputStream("/home/kgonzalez/Downloads/education/javaBootcamp/Module 2- worldOfObjects/ExeptionHandling/checkedExceptions/Greetings.txt");

            Scanner scan = new Scanner(fis);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }

            scan.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
