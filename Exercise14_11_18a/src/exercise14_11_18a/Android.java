package exercise14_11_18a;

public class Android extends Phone{
    public Android(String brand){
        super(brand);
        setPhonePrice();
    }
    @Override
    void setPhonePrice(){
        PhonePrice=24.99;
    }
}
