/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackageex5;

/**
 *
 * @author ΑΛΕΞΑΝΔΡΟΣ
 */
public class Librarian {
    public static void main(String[]args){
        Author a1=new Author("Jordan");
        Author a2=new Author("Tolkien");
        Author a3=new Author("Barker");
        Author[]authorofbooks={a1,a2,a3};
        Library l1=new Library("Library1",authorofbooks);
        
    }
}
    