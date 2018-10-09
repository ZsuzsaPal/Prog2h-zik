
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
public class MaximálisSzállíthatóTeherÖsszehasonlító implements Comparator<Teherautó>{
//comparator:ez mondja meg,milyen tipusokat hasonlítok össze,a <> között pedig amilyen típust összehasonlítunk
    @Override
    public int compare(Teherautó o1, Teherautó o2) {
        int maxTeherElső= o1.getMaxSzállíthatóTeher();
        int maxTeherMásodik=o2.getMaxSzállíthatóTeher();
        
        if(maxTeherElső<maxTeherMásodik){
            return 1;
        }
        if(maxTeherElső==maxTeherMásodik){
            return 0;
        }
      //  if(maxTeherElső>maxTeherMásodik){
            return -1;
            
        }
 
    }
    
    
    

