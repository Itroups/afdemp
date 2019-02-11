/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex13_11_1;

/**
 *
 * @author ΑΛΕΞΑΝΔΡΟΣ
 */
public class C extends A {
    B bb;
    public C(int i){
     super(i);   
     bb=new B( i);
    }
}
