
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
public class Rectangle extends GeometricShape {
    
    public Rectangle(String coloured, boolean filled) {
        super(coloured, filled);
        }
    
    private double width;
    private double height;

    public Rectangle(){
        super();
    }
    public Rectangle(double width,double height){
        super();
        this.width=width;
        this.height=height;
    }
    public Rectangle(double width, double height, String coloured, boolean filled) {
        super(coloured, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
  
    public double getArea(){
       return this.width * this.height;
    }
     
 
    public double getPerimeter(){
       return 2*(this.width+this.height);
    }
}
