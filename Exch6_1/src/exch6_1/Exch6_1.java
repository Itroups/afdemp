/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exch6_1;

/**
 *
 * @author ΑΛΕΞΑΝΔΡΟΣ
 */
public class Exch6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    int x;
    char k;
    private static Exch6_1 instance=null;
    Exch6_1(){
    
}
    
   public static Exch6_1 getInstace(){ 
   if (instance==null){
      instance=new Exch6_1();
   } 
   return instance;
}
   
}