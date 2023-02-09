public class Person {
    protected String firstName;
    protected String lastName;

    public Person(String fName, String lName) {
        firstName = fName;
        lastName = lName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void print(){
        System.out.println("First Name: " +firstName+ ",last Name: "+lastName);
    }
}
