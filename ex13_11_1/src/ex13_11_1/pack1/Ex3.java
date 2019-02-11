/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex13_11_1.pack1;

/**
 *
 * @author ΑΛΕΞΑΝΔΡΟΣ
 */
public class Ex3 {
    public static void main(String[]args){
      C cc=new C();  
    }
}
class A{
    public void print(){
    System.out.println(0);
}
    public void print(String z){
    System.out.println(1);
}
    public void print(String x , String y){
    System.out.println(2);
}
}
   class C{
       public void print(String z, String x, String y){
           System.out.println(3);
       }
   } 
