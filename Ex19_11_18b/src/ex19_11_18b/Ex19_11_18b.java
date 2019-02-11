/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex19_11_18b;

/**
 *
 * @author ΑΛΕΞΑΝΔΡΟΣ
 */
public class Ex19_11_18b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point P=new Point(10,5);
        Circle C=new Circle(P, 8);
        Circle c1=new Circle(C);
        System.out.println(c1);
    }
    
}
