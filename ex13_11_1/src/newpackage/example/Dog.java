/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.example;

/**
 *
 * @author ΑΛΕΞΑΝΔΡΟΣ
 */
public class Dog extends Animal {
 String breed;
 public Dog(String breed){
     super("Dog",0);
     this.breed=breed;
 }
 @Override
 public String voice(){
     return "bark, I'm "+this.breed;
 }
}
