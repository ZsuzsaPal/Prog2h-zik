
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
public class GeometricShape {
    private String coloured;
    private boolean filled;
    public Date dateCreated;

    public GeometricShape(String coloured, boolean filled) {
        this.coloured = coloured;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public GeometricShape() {
        this("white",false);
    }
    

    public String getColoured() {
        return coloured;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColoured(String coloured) {
        this.coloured = coloured;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricShape{" + "dateCreated=" + dateCreated + '}';
    }
    
    
    
    
}
