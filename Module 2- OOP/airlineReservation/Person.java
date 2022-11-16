package worldOfObjects.airlineReservation;

import java.util.Arrays;
import java.util.Random;

public class Person {
     
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String [] passport;
    private int seatNumber;
     
     public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
          this.name = name;
          this.nationality = nationality;
          this.dateOfBirth = dateOfBirth;
          this.seatNumber = seatNumber;
          this.passport = new String[3];
     }

     public Person (Person p){
          this.name = p.name;
          this.nationality = p.nationality;
          this.dateOfBirth = p.dateOfBirth;
          this.seatNumber = p.seatNumber;
          this.passport = Arrays.copyOf(p.passport, p.passport.length);
     }


     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }
     public String getNationality() {
          return nationality;
     }

     public void setNationality(String nationality) {
          this.nationality = nationality;
     }

     public String getDateOfBirth() {
          return dateOfBirth;
     }

     public void setDateOfBirth(String dateOfBirth) {
          this.dateOfBirth = dateOfBirth;
     }

     public String[] getPassport() {
          return Arrays.copyOf(this.passport, this.passport.length);
     }

     public void setPassport() {
          this.passport = new String [] {this.name, this.nationality, this.dateOfBirth};
     }

     public int getSeatNumber() {
          return this.seatNumber;
     }

     public void setSeatNumber(int seatNumber) {
          this.seatNumber = seatNumber;
     }

     public Boolean applyPassport(){
          Random random = new Random();
          return random.nextBoolean();
     }
     
     public void chooseSeat(){
          this.seatNumber = (int)(Math.random() * 11 +1);
     }

     @Override
     public String toString() {
          return  "\nName = " + name + "\nNationality = " + nationality + "\nDate of Birth = " + dateOfBirth+ "\nSeatNumber = " + seatNumber + "\nPassport = " + Arrays.toString(this.passport) + "\n";
     }
}
