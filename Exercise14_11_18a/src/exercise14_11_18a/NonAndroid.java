package exercise14_11_18a;

public class NonAndroid extends Phone{
 public NonAndroid(String brand){
     super(brand);
     setPhonePrice();
 }
 @Override
  void setPhonePrice(){
        PhonePrice=37.99;
    }
}
