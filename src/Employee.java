public class Employee extends Person{
    private String department;
    public Employee(String fName, String lName, String dept) {
        super(fName, lName);
        department = dept;
    }
    public void print(){
        System.out.println("Department: "+department+", ");
        super.print();
    }
}
