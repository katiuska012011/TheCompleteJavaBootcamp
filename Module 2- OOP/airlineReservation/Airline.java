package worldOfObjects.airlineReservation;

import java.util.Arrays;

public class Airline {
     
    private  Person [] seats;
     

     public Airline(){
          this.seats = new Person [11];
     }

     public Person getPerson(int index){
          return new Person(this.seats[index]);
     }

     public void setPerson(Person p){
        this.seats[p.getSeatNumber() -1] = new Person(p);
     }

     public void createReservation(Person person){

          while(this.seats[person.getSeatNumber() -1] != null){
               System.out.println("\n"+person.getName()+ ", seat: "+person.getSeatNumber()+ " is already taken. Please choose another one. \n");
               person.chooseSeat();
          }

          this.seats[person.getSeatNumber() -1] = new Person(person);

          System.out.println("Thank ypu "+person.getName() + " for flying with Java airlines "+"Toy seat number is " + 
          person.getSeatNumber() + "\n");

     }

     public String toString(){
          String temp = "";

          for (int i = 0; i < seats.length; i++) {

               if(seats[i] != null){
                    temp +="Name: "+seats[i].getName() + "\nNationality: "
                    +seats[i].getNationality() + "\nDate of Birth: "
                    +seats[i].getDateOfBirth() + "\nSeat Number: "
                    +seats[i].getSeatNumber() + "\nPassport: "+Arrays.toString(seats[i].getPassport()) 
                    + "\n \n"; 
               }else{
                    temp += "Seat " + (i + 1)+" is empy \n \n";
               }

          }
          return temp;
     }
}
