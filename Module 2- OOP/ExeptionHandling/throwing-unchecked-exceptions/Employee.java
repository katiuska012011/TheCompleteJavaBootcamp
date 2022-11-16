public class Employee {
    
    private String name ;
    private String position;

    
    public Employee(String name, String position) {

        if(name == null || name.isBlank() || position == null || position.isBlank()){
            throw new IllegalArgumentException("Name or position cannot be null/balck");
                }
        this.name = name;
        this.position = position;
    }

    public Employee(Employee source) {
        this.name = source.name;
        this.position = source.position;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    
}
