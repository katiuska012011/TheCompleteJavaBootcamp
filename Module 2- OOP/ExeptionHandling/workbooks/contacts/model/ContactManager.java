package ExeptionHandling.workbooks.contacts.model;

import java.util.ArrayList;

public class ContactManager {
    
    private ArrayList<Contact> contacts = new ArrayList<>();

    public ContactManager(){
        this.contacts = new ArrayList<>();
    }

    public Contact getContacts(int index) {
        return contacts.get(index);
    }

    public void setContacts(int index, Contact contact) {
        contact = this.contacts.get(index);
    }

    public void addContact(Contact cont){
        this.contacts.add(new Contact(cont));
    }

    public void removeContact(String contactName){

        if(isEmpty()){
            throw new IllegalStateException("There's not contacts to remove");
        }
        for (int i = 0; i < contacts.size(); i++) {
            if(contacts.get(i).getName().equals(contactName)){
                contacts.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        String temp = "";

        for (int i = 0; i < contacts.size(); i++) {
            temp += contacts.get(i).toString();
            temp += "\n\n";
        }
        return temp;
    }

    public boolean isEmpty(){
        return this.contacts.isEmpty();
    }
    
}
