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
public class TestAnimals {
    public static void main(String[]args){
        Animal[]Animals=new Animal[4];
        Dog dog1=new Dog("Thibetean Mastiff");
        Cat cat1=new Cat("Persian");
        Cat cat2=new Cat("Bengal");
        Dog dog2=new Dog("Greek Shepherd");
        Animals[0]=dog1;
        Animals[1]=cat1;
        Animals[2]=cat2;
        Animals[3]=dog2;
        for (Animal Animal:Animals){
            System.out.println(Animal.voice());
        }
    }
}
