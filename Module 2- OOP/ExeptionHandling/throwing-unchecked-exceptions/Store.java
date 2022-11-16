public class Store {
    
    Employee[] employees;

    public Store() {
        employees = new Employee[3];
    }

    public void setEmployees(int index, Employee employee) {
        this.employees[index] = new Employee(employee);
    }

    public void open() {

        for (int i = 0; i < employees.length; i++) {
            if(employees[i] == null){
                throw new IllegalStateException("You must be fulle-staffer before opening the store");
            }
        }
        System.out.println("We're open for business!");
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < employees.length; i++) {
             temp += "\nName: "+ employees[i].getName() + "\nPosition: "+employees[i].getPosition()+"\n"; 
        }
        return temp;
    }
}
