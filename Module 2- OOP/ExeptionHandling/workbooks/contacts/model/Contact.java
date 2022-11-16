package ExeptionHandling.workbooks.contacts.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Contact {
    
    private String name;
    private int age;
    private String birth;
    private String phone;
    

    public Contact(String name, String phone, String birth) throws ParseException{
        
        if(name.equals(null) || name.isBlank()){
            throw new IllegalArgumentException("Name cannot be null/black");
        }
        if(phone.equals(null) || phone.isBlank()){
            throw new IllegalArgumentException("Phone number cannot be null/black");
        }
        if(phone.length() <5){
            throw new IllegalArgumentException("Phone number cannot be less than 5");
        }
        this.name = name;
        this.phone = phone;
        this.birth = birth;
        this.age = toAge(birth);
    }

    public Contact(Contact contact){
        this.name = contact.getName();
        this.phone = contact.getPhone();
        this.birth = contact.getBirth();
        this.age = contact.getAge();
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {

        if(name.equals(null) || name.isBlank()){
            throw new IllegalArgumentException("Name cannot be null/black");
        }
        this.name = name;
    }


    public Integer getAge() {
        return age;
    }


    private void setAge(Integer age) {
        this.age = age;
    }


    public String getBirth() {
        return birth;
    }


    public void setBirth(String birth) throws ParseException  {
        setAge(toAge(birth));
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        
        if(phone.equals(null) || phone.isBlank()){
            throw new IllegalArgumentException("Phone number cannot be null/black");
        }
        if(phone.length() <5){
            throw new IllegalArgumentException("Phone number cannot be less than 5");
        }
        this.phone = phone;
    }

    private int toAge(String birth) throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        format.setLenient(false);
        long diff = new Date().getTime() - format.parse(birth).getTime();
        return (int)  (TimeUnit.MILLISECONDS.toDays(diff) / 365);
    }

    @Override
    public String toString() {
        return "\nName: " + name + "\nAge: " + age + "\nBirth Date: " + birth + "\nPhone number: " + phone + "\n";
    }
}
