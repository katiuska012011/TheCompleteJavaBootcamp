package worldOfObjects;


public class Dealership {
     
     private Car[] cars;

     public Dealership (Car [] cars){
          this.cars = new Car[cars.length];

          for (int i = 0; i < cars.length; i++) {
               this.cars[i] = new Car(cars[i]);
          }
     }

     public Car getCars(int index) {
          return new Car(this.cars[index]);
     }

     public void setCars(Car car, int index) {
          this.cars[index] = new Car(car);
     }

     @Override
     public String toString() {
          String temp = "";

          for (int i = 0; i < this.cars.length; i++) {
               temp +=  "Parking Spot: " + i+"\n";
               temp += this.cars[i] + "\n";
          }
          return temp ;

     }

     public void sell(int index){
          this.cars[index].drive();
          this.cars[index] = null;
     }

     public int search(String make, int budget){


          for (int i = 0; i < this.cars.length; i++) {

               if(this.cars[i] == null){
                    continue;
               }else if(this.cars[i].getMake().equalsIgnoreCase(make) && this.cars[i].getYear() <= budget){
                    System.out.println("\nWe found one in spot : " + i + "\n "+this.cars[i].toString()+"\nIf you're interested, type 'yes':");
                    return i;
               }
          }
          System.out.println("\nYour search didn't match any results.\n");
          return 404;
     }
 

}
