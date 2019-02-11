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
public class Animal {
    String type;
    double weight;
    public Animal(String type,double weight){
        this.type=type;
        this.weight=weight;
    }
    public String voice(){
        return "voice";
    }
}
