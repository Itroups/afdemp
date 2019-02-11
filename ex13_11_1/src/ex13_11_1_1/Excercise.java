/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex13_11_1_1;

/**
 *
 * @author ΑΛΕΞΑΝΔΡΟΣ
 */
class Base1{
public Base1(){
    System.out.println("Base 1");
}
}
class Base2 extends Base1{
    public Base2(){
        System.out.println("Base 2");
    }
}
class Base3 extends Base2{
    public Base3(){
        System.out.println("Base 3");
    }
}

public class Excercise {
    public static void main(String[]args){
     Base3 bs=new Base3();   
    }
}
