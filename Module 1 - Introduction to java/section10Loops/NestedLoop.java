package section10Loops;

public class NestedLoop {
    public static void main(String[] args) {
        nest();
    }

    public static void nest(){
        for(int i=0; i<3; i++){
            System.out.println("Run: "+i);

            for(int j=0; j<3; j++){
                System.out.println(j);
            }
        }
    }
    
}
