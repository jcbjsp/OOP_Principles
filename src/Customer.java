public class Customer {
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

    private String firstName;
    private String lastName;
    public Customer(String fName, String lName){
        firstName = fName;
        lastName = lName;
    }
    public void print(){
        System.out.println("First Name: " +firstName+ ",last Name: "+lastName);
    }

}
