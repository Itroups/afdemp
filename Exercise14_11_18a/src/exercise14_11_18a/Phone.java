package exercise14_11_18a;

public abstract class Phone {
    String PhoneBrand;
    double PhonePrice=0;
    public Phone(String PhoneBrand){  
        this.PhoneBrand=PhoneBrand;
    }
    public String getBrand(){
    return PhoneBrand;
}
    public double getPhonePrice(){
        return PhonePrice;
    }
    abstract void setPhonePrice();
            
}
