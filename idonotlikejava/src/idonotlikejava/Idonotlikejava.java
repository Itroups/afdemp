/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idonotlikejava;
import java.util.Scanner;
/**
 *
 * @author ΑΛΕΞΑΝΔΡΟΣ
 */
public class Idonotlikejava {

    
    public static void main(String[] args) {
        
    Scanner user_input = new Scanner(System.in);
    String a= ("I do not like java");
    String [] arraywords= a.split(" ");
 
        arraywords[2]=arraywords[2].substring(1,3);
        if (arraywords[2].length()==2){
        String  w1=arraywords[2].substring(0,1);  
        String w2=arraywords[2].substring(1,2);
        String w3;
        w3=w1;
        w1=w2;
        w2=w3;
        arraywords[2]=w1+w2;
        }
        arraywords[3]=arraywords[3].replace("ik","ov");
     
        System.out.println(arraywords[2]);
     System.out.println(arraywords[0]+" "+arraywords[1]+" "+arraywords[3]+" "+arraywords[4]);
    
    System.out.print(arraywords[1]+" "+arraywords[2]+" "+arraywords[3]+" ");
    arraywords[4]=user_input.next();
    
    }
    
}
