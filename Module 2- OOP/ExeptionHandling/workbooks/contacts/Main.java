package ExeptionHandling.workbooks.contacts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

import ExeptionHandling.workbooks.contacts.model.Contact;
import ExeptionHandling.workbooks.contacts.model.ContactManager;

public class Main {
    static ContactManager manager = new ContactManager();

    public static void main(String[] args)  {
        try {
            loadContacts("/home/kgonzalez/Downloads/education/javaBootcamp/Module 2- worldOfObjects/ExeptionHandling/workbooks/contacts/model/contacts.txt");
            System.out.println("Contacts Loaded");
            System.out.println(manager);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        manageContacts();
    }

    public static void loadContacts(String fileName) throws FileNotFoundException {
        FileInputStream file = new FileInputStream(fileName);
        Scanner scan = new Scanner(file);

        while(scan.hasNextLine()){
            try {
                Contact cont = new Contact(scan.next(), scan.next(), scan.next());
                manager.addContact(cont);
            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }
        }
        scan.close();
    }

    public static void manageContacts(){
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Would you like to \n\ta)add another contact\n\tb)remove a contact\n\tc) exit");
            String response = scan.nextLine();
            if(response.equalsIgnoreCase("a")){
                System.out.print("\tName: ");
                String name = scan.nextLine();
                System.out.print("\tPhone Number: ");
                String phone = scan.nextLine();
                System.out.print("\tBirth Date: ");
                String birth = scan.nextLine();
                
                if(name.isBlank() || birth.isBlank()){
                    System.out.println("\nThe input you provided is not valid. Registration failed.");
                }

                if(phone.length() < 5){
                    System.out.println("\nThe input you provided is not valid. Registration failed.");
                }
                try {
                    Contact contact = new Contact(name, phone, birth);
                    manager.addContact(contact);
                } catch (ParseException e) {
                    System.out.println(e.getMessage());
                }finally{
                    System.out.println("\n\nUPDATED CONTACTS\n\n");
                    System.out.println(manager);
                }

            }

            if(response.equalsIgnoreCase("b")){
                System.out.println("\nWho would you like to remove?");
                String name = scan.nextLine();
                manager.removeContact(name);
                System.out.println(manager);
                System.out.println("\n\nUPDATED CONTACTS\n\n");
            }

            if(response.equalsIgnoreCase("c")){
                break;
            }
        }

        scan.close();
    }
    
}
