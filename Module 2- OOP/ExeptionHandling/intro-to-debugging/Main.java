
public class Main {
    public static void main(String[] args) {

        ExerciseTwo();
    }

    public static void ExerciseTwo(){

        int age = 20;
        int credit = 0;

        String apply = age >= 18 && credit >= 0 ? "We're proccessing your application": "You cannot apply";
        System.out.println(apply);

    }
}
