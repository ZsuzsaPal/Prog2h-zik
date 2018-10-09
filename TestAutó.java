
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class TestAutó {
    public static void main(String[] args) {
        Autó[] autók = new Autó[]{
            new Autó("999EEE",200),
            new Autó("099EEW",130),
            new Autó("949POW",250),
            new Autó("998QWE",290),
            new Autó("912XYA",120),
            new Teherautó("000ERT",300,122),
            new Teherautó("934QAX",210,450),
            new Teherautó("PTE345",140,872),
            new Teherautó("YXC111",220,222),
            new Teherautó("996EEK",190,112),
        };
    
           
        Teherautó[] teherautók = new Teherautó[]{
            new Teherautó("102KKK",200,200),
            new Teherautó("101KKo",240,200),
            new Teherautó("102KKQ",200,210),
            new Teherautó("145OKK",320,290),
            new Teherautó("101IKK",100,400),
            new Teherautó("104KKP",300,100),
            new Teherautó("10P81E",120,280),
            new Teherautó("934IEA",340,500),
            new Teherautó("745EAD",420,300),
            new Teherautó("999ASD",240,130),
              
        };
        rendezMaxSzállíthatóTeherCsökkenőleg(teherautók);
        
        for(int i=0;i<teherautók.length;i++){
            
        System.out.println(teherautók[i].getMaxSzállíthatóTeher());
        
        }
        Autó a =keresMaxMotorTeljesítmény(autók);//metódus által visszaadott értéket eltároljuk,hogy ki tudjuk írni
        
        System.out.println(a.getMotorTeljesítmény());
    }
    public static void rendezMaxSzállíthatóTeherCsökkenőleg(Teherautó[] teher){
        MaximálisSzállíthatóTeherÖsszehasonlító m = new MaximálisSzállíthatóTeherÖsszehasonlító();
        Arrays.sort(teher,m);
    }
    public static Autó keresMaxMotorTeljesítmény(Autó[] autó){
        MotorTeljÖsszehasonlító motor = new MotorTeljÖsszehasonlító();
        Arrays.sort(autó,motor);
        return autó[1];
     
     
     
    }
}
