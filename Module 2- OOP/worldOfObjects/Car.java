package worldOfObjects;

import java.util.Arrays;

public class Car {
     
     private String make;
     private double price;
     private int year;
     private String color;
     private String[] parts;
     
     public Car(String make, double price, int year, String color, String[] parts) {
          this.make = make;
          this.price = price;
          this.year = year;
          this.color = color;
          this.parts  = Arrays.copyOf(parts, parts.length);
     }


     public Car (Car car){
          this.make = car.make;
          this.price = car.price;
          this.year = car.year;
          this.color = car.color;
          this.parts = Arrays.copyOf(car.parts, car.parts.length);
     }

     public String getMake() {
          return make;
     }

     public void setMake(String make) {
          this.make = make;
     }

     public double getPrice() {
          return price;
     }

     public void setPrice(double price) {
          this.price = price;
     }

     public int getYear() {
          return year;
     }

     public void setColor(String color) {
          this.color = color;
     }


     public String[] getParts() {
          return Arrays.copyOf(this.parts, this.parts.length);
     }


     public void setParts(String[] parts) {
          this.parts = Arrays.copyOf(parts, parts.length);
     }


     public void setYear(int year) {
          this.year = year;
     }

     public String getColor() {
          return color;
     }

     @Override
     public String toString() {
          return "Make: " + make + "\nPrice: " 
          + price + "\nYear: " 
          + year + "\nColor: " 
          + color + "\nParts:"
          +Arrays.toString(parts)+ ".\n";
     }

     public void drive(){
          System.out.println("You bught the beautiful "+this.year+" "+this.color+ " "+this.make+" for "+this.price+" .");
          System.out.println("Please drive your car to the nearest exit.\n");
     }
     
}
