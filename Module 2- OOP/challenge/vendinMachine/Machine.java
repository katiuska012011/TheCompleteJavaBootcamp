package challenge.vendinMachine;

public class Machine {
     
     private Item [][] items;

     public Machine(Item [][] item){
          this.items = new Item[item.length] [item[0].length];
          for (int i = 0; i < items.length; i++) {
               for (int j = 0; j < items[i].length; j++) {
                    this.items[i][j] = new Item(item[i][j]);
               }
          }
     }

     public Item getItems(int row, int spot){
          return new Item(this.items[row][spot]);
     }

     public void setItems(Item item, int row, int spot){
          this.items[row][spot] = new Item(item);
     }

     public Boolean dispense(int row, int spot){
          int qualify = this.items[row][spot].getQualify();

          if(qualify > 0){
               qualify = this.items[row][spot].setQualify(qualify -=1);
               return true;
          } 

          return false;
     }

     public String toString(){

          String temp = "";

          for (int i = 0; i < items.length; i++) {
               for (int j = 0; j < items[i].length; j++) {
                    temp += "\t"+items[i][j].getName() + ": "+items[i][j].getPrice()+" ("+items[i][j].getQualify()+") ";
               }
               temp += "\n\n";
          }
          return temp += "***************************************************";
     }
     
}
