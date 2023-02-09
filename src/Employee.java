public class Employee extends Person{
    private String department;
    public Employee(String fName, String lName, String dept) {
        super(fName, lName);
        department = dept;
    }
}
