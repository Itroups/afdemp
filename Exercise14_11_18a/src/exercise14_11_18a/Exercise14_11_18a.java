package exercise14_11_18a;

public class Exercise14_11_18a {
    public static void main(String[] args) {
//        Android And1=new Android("Samsung");
//        NonAndroid Nand1=new NonAndroid("Nokia");
//        System.out.println(And1.PhoneBrand+" "+And1.PhonePrice+"$");
//         System.out.println(Nand1.PhoneBrand+" "+Nand1.PhonePrice+"$");
         
        Phone[]Phones=new Phone[10];
        Phones[0]= new Android("Samsung");
        Phones[1]=new NonAndroid("Nokia");
        Phones[2]=new Android("Huawei");
        Phones[3]=new NonAndroid("Iphone3");
        Phones[4]=new Android("Leagoo");
        Phones[5]=new NonAndroid("Iphone4");
        Phones[6]=new Android("Sony");
        Phones[7]=new NonAndroid("Iphone6");
        Phones[8]=new Android("Xiaomi");
        Phones[9]=new NonAndroid("Iphone7");
        for(int i=0;i<Phones.length;i++){
        System.out.println(Phones[i].PhoneBrand+" "+Phones[i].PhonePrice);
    }
    }
}
