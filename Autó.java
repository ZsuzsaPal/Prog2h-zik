
import java.util.Date;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Autó {
    private String rendszám;
    private int motorTeljesítmény;
    private Date gyártásiDátuma;

    public Autó(String rendszám, int motorTeljesítmény) {
        this.rendszám = rendszám;
        this.motorTeljesítmény = motorTeljesítmény;
        this.gyártásiDátuma=new Date();
    }
    
    public String getRendszám() {
        return rendszám;
    }

    public void setRendszám(String rendszám) {
        this.rendszám = rendszám;
    }

    public int getMotorTeljesítmény() {
        return motorTeljesítmény;
    }

    public Date getGyártásiDátuma() {
        return gyártásiDátuma;
    }

    @Override
    public String toString() {
        return "Aut\u00f3{" + "rendsz\u00e1m=" + rendszám + ", motorTeljes\u00edtm\u00e9ny=" + motorTeljesítmény + ", gy\u00e1rt\u00e1siD\u00e1tuma=" + gyártásiDátuma + '}';
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Autó other = (Autó) obj;
        if (this.motorTeljesítmény != other.motorTeljesítmény) {
            return false;
        }
        if (!Objects.equals(this.rendszám, other.rendszám)) {
            return false;
        }
        if (!Objects.equals(this.gyártásiDátuma, other.gyártásiDátuma)) {
            return false;
        }
        return true;
    }
    
    
}
