/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class TestTriangle {
    public static void main(String[] args) {
        Triangle t = new Triangle(1.0,1.5,1.0);
        t.setColoured("yellow");
        System.out.println("Terület: "+t.getArea());
        System.out.println("Kerület: "+t.getPerimeter());
        System.out.println("Színe: "+t.getColoured());
        System.out.println("Kitöltve:"+t.isFilled());
    }
}
