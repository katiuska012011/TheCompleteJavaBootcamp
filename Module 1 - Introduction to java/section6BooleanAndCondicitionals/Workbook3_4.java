package section6BooleanAndCondicitionals;

public class Workbook3_4 {
public static void main(String[] args) {

    int temp = 5;
    String forecast = "";

    if(temp <= -15 || temp <= -1){
        forecast = "The forecast is FREEZING! Stay home!";
        System.out.println(forecast);
    }else if(temp <= 10){
        forecast = "The forecast is Chilly. Wear a coat";
        System.out.println(forecast);
    }else{
        forecast = "It's warm, Go outside";
        System.out.println(forecast);
    }
}
}
