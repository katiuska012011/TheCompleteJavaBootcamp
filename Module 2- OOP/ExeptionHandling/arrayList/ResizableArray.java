package ExeptionHandling.arrayList;

import java.util.ArrayList;

public class ResizableArray {
    public static void main(String[] args) {
        
        ArrayList <String> name = new ArrayList<>();
        name.add("Joe");
        name.add("Jim");
        name.add("Julio");

        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i)); 
        }

        name.set(0, "Xiara");
    }
}
