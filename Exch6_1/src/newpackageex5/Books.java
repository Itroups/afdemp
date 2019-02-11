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
public class Books {
  String Title; 
 Author Author;  
final  String isbn=null;
 int  PhysicalCopies;
 int AvailableCopies;
 int RentedTimes;
   private Books(String Title,Author Author ){
    this.Title=Title;
    this.Author=Author;  
}
   public String getTitle(){
    return Title;
}
   public void setTitle(String Title){
       this.Title=Title;
   }
   public Author getAuthor(){
       if (!(getAuthor.equals(Author))){
        System.out.println("Sorry this author doesn't have this book");   
       }
       return Author;
   }
   public void setAuthor(Author Author){
       this.Author=Author;
   }
   public int getPhysicalCopies(){
       return PhysicalCopies;
   }
   public void setPhysicalCopies(int PhysicalCopies){
       this.PhysicalCopies=PhysicalCopies;
   }
   public int  getAvailableCopies(){
       if (AvailableCopies<0){
       System.out.println("Sorry this book has been rented");
       }
       return AvailableCopies;
       
   }
   public void setAvailableCopies(int AvailableCopies){
     this.AvailableCopies=AvailableCopies;  
   }
   public int getRentedTimes(){
       return RentedTimes;
   }
   public void setRentedTimes(int RentedTimes){
       this.RentedTimes=RentedTimes;
   }
   
   

}
