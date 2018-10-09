
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MotorTeljÖsszehasonlító implements Comparator<Autó> {

    @Override
    public int compare(Autó o1, Autó o2) {
        int MaxTeljMotor1 = o1.getMotorTeljesítmény();
        int MaxTeljMotor2 = o2.getMotorTeljesítmény();
        if(MaxTeljMotor1 < MaxTeljMotor2){
            return 1;
        }
        else if(MaxTeljMotor1 == MaxTeljMotor2){
            return 0;
        }
        else{
            return -1;
        }
    }
    
}
