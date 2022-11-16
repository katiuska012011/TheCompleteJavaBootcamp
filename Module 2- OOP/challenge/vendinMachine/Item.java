package challenge.vendinMachine;

public class Item {
     
     private String name;
     private double price;
     private int qualify;


     public Item (String name, double price, int qualify){
          this.name = name;
          this.price = price;
          this.qualify = qualify;
     }

     public Item(Item item){
          this.name = item.name;
          this.price = item.price;
          this.qualify = item.qualify;
     }

     public String getName() {
          return this.name;
     }
     public void setName(String name) {
          this.name = name;
     }
     public Double getPrice() {
          return this.price;
     }
     public void setPrice(Double price) {
          this.price = price;
     }
     public Integer getQualify() {
          return this.qualify;
     }

     public int setQualify(Integer qualify) {
         return this.qualify = qualify;
     }

     @Override
     public String toString() {
          return "\nName: " + this.name + "\nPrice: " + this.price + "\nQualify: (" + this.qualify + ")\n";
     }

     
}
