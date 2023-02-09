public class Customer extends Person{
    public String getDeliveryAddress(){
        return deliveryAddress;
    }
    public void setDeliveryAddress(String deliveryAddress){
        this.deliveryAddress = deliveryAddress;
    }
    private String deliveryAddress;
    public Customer(String fName, String lName, String dAddress){
        super(fName, lName);
        deliveryAddress = dAddress;
    }
    public void print(){
        System.out.print("The delivery address: " + deliveryAddress + ", ");
        super.print();
    }

}
