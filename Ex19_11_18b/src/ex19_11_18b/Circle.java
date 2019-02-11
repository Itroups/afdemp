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
public class Circle {
    private Point Point;
    private int R;
    public Circle(){
        
    }
    public Circle(Point Point,int R){
        this.Point=Point;
        this.R=R;
    }
    public Circle(Circle circle){
        this Point=Circle.Point;
        this.R=Circle.R;
    }
    public int getR(){
        return R;
    }
    public void setR(int R){
        this.R=R;
    
    }
    public Point getPoint(){
        return Point;
    }
    public void setPoint(Point Point){
        this.Point= Point;
    }
    public double getPerimeter(){
        double Perimeter;
        Perimeter=2*R*Math.PI;
        return Perimeter;
    }
    
    
    @Override
    public String toString(){
      return "something";
    }
}

    
    class Point{
     private int x;
     private int y;
     public Point(){
         
     }
     public Point(int a,int b){
         
     }
     public int getX(){
        return x;
    }
    public void setX(int a){
        x=a;
    }
    public int getY(){
        return y;
    }
    public void setY(int b){
        y=b;
    }
    
    }


