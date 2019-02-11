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
public class Library {
 
    Books[]Books;
    private Library(Books[]Books){
        
        this.Books=Books;
    }
    public Books[]getBooks(){
        return Books;
    }
    public void setBooks(Books[]Books){
       this.Books=Books;
    }
    void printAvailableBooks(String getAuthor,int getAvailableCopies){
        
    }
    printBookDetails(getTitle){
        if (getTitle.equals(getTitle))
            System.out.println("Details");
    }else{
    System.out.println("Error wrong input");
}
}
