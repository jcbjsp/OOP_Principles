public class OOPMain {
    public static void main(String[] args) {
        Customer customer = new Customer("Nivi", "Vinu", "Mumbai");
        customer.setLastName("Jacob");
        customer.print();
        //System.out.println(customer.getDeliveryAddress());
        Employee employee = new Employee("Zeus", "Sugar", "Marketing");
        employee.print();
    }
}
