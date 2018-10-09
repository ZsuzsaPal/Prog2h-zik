
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Circle extends GeometricShape {
    
    public Circle(String coloured, boolean filled) {
        super(coloured, filled);
    }
    
   private double radius;
   
   public Circle(){
       super();
   }
   public Circle(double radius){
       super();
       this.radius=radius;
   }

    public Circle(double radius, String coloured, boolean filled) {
        super(coloured, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

   public double getArea(){
       return Math.pow(radius,2)*Math.PI;
   }
   
   public double getPerimeter(){
       return 2*this.radius*Math.PI;
   }
  
   public double getDiameter(){
       return 2* this.radius;
   }

    
   
    
}
