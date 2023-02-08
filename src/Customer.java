public class Customer {
    String firstName;
    String lastName;
    Customer(String fName, String lName){
        firstName = fName;
        lastName = lName;
    }
    void print(){
        System.out.println("First Name: " +firstName+ ",last Name: "+lastName);
    }

}
