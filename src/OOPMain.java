import java.util.Random;

public class OOPMain {
    public static void main(String[] args) {
        int rand = new Random().nextInt(2);
        Person person;
        if (rand == 0) {
            person = new Customer("Nivi", "Vinu", "Mumbai");
        }else{
            person = new Employee("Zeus", "Sugar", "Marketing");
        }
        //Customer customer = new Customer("Nivi", "Vinu", "Mumbai");
        //customer.setLastName("Jacob");
        //customer.print();
        //System.out.println(customer.getDeliveryAddress());
        //Employee employee = new Employee("Zeus", "Sugar", "Marketing");
       person.print();
    }
}
