package ex19_11_18_a;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ex19_11_18_a {
    
    public static void main(String[] args) throws IOException {  
        Scanner user_input=new Scanner(System.in);
        // TODO code application logic here
//        Person P1=new Person("John", 26);
//        Person P2=new Person();
//        System.out.println(P1);
//        System.out.println(P2); //χρησημοποιούμε τους setters για να θέσουμε τιμές στο P2
//        P2.setName("Helen");
//        P2.setAge(27);
//        System.out.println(P2);
System.out.println("Please insert your name,your last name, your age and your favorite colour.");
     String Name=user_input.next();
     String Lastname=user_input.next();
     int Age=user_input.nextInt();
     String Colour=user_input.next();
     Person P3=new Person(Name, Age, Lastname, Colour);
     BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\ΑΛΕΞΑΝΔΡΟΣ\\Desktop\\writetxt.txt",true));
    //writer.append(' ');
     //writer.append(P3.getName()+", "+P3.getLastname()+", "+P3.getAge()+","+P3.getColour());
     writer.append(P3.toString()); //εναλλακτικά
     writer.newLine();
     writer.close();
    }
}
