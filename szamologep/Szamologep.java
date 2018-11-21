package szamologep;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Szamologep extends JFrame implements ActionListener{
    private JButton bt0;
    private JButton bt1;
    private JButton bt2;
    private JButton bt3;
    private JButton bt4;
    private JButton bt5;
    private JButton bt6;
    private JButton bt7;
    private JButton bt8;
    private JButton bt9;
    private JButton bt10;
    private JButton bt11;
    private JButton bt12;
    private JButton bt13;
    private JButton bt14;
    private JButton bt15;
    private JButton bt16;
    private JButton bt17;
    private JButton bt18;
    private JButton bt19;
    private JButton bt20;
    private JButton bt21;
    private JButton bt22;
    private JButton bt23;
    private JButton bt24;
    private JButton bt25;
    private JButton bt26;
    private JButton bt27;

    private JTextField tf1=new JTextField(40);
    
    private JPanel p1=new JPanel();
    private JPanel p2=new JPanel();
    private JPanel p3=new JPanel();
    private JPanel p4=new JPanel();
    private JPanel p5=new JPanel();
    private JPanel p6=new JPanel();
    private JPanel p7=new JPanel();
   

    
    public Szamologep(){
        super("Számológép");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        bt0= new JButton("");
        bt1 = new JButton("Backspace");
        bt2 = new JButton("CE");
        bt3 = new JButton("C");
        bt4 = new JButton("MC");
        bt5 = new JButton("7");
        bt6 = new JButton("8");
        bt7 = new JButton("9");
        bt8= new JButton("/");
        bt9 = new JButton("sqrt");
        bt10 = new JButton("MR");
        bt11 = new JButton("4");
        bt12= new JButton("5");
        bt13= new JButton("6");
        bt14= new JButton("*");
        bt15 = new JButton("%");
        bt16= new JButton("MS");
        bt17= new JButton("1");
        bt18 = new JButton("2");
        bt19= new JButton("3");
        bt20= new JButton("-");
        bt21= new JButton("1/x");
        bt22= new JButton("M+");
        bt23= new JButton("0");
        bt24= new JButton("+/-");
        bt25= new JButton(".");
        bt26= new JButton("+");
        bt27= new JButton("=");
       
         
       
       GridLayout gr = new GridLayout(1,4);//masodik sor elrendezese
       GridLayout gr1 = new GridLayout(1,6);//utolso 4 sor elrendezese,1 sorba 6 gomb
       GridLayout gr2 = new GridLayout(6,1);//6 panelt rakunk a frame-re es mindegyiket egymas ala tehat soronkent egyet ezert lesz 1
      // GridLayout gr3 = new GridLayout(2,1);
         
         
         
        
        p1.add(tf1);
        p2.add(bt0);
        p2.add(bt1);
        p2.add(bt2);
        p2.add(bt3);
        p3.add(bt4);
        p3.add(bt5);
        p3.add(bt6);
        p3.add(bt7);
        p3.add(bt8);
        p3.add(bt9);
        p4.add(bt10);
        p4.add(bt11);
        p4.add(bt12);
        p4.add(bt13);
        p4.add(bt14);
        p4.add(bt15);
        p5.add(bt16);
        p5.add(bt17);
        p5.add(bt18);
        p5.add(bt19);
        p5.add(bt20);
        p5.add(bt21);
        p6.add(bt22);
        p6.add(bt23);
        p6.add(bt24);
        p6.add(bt25);
        p6.add(bt26);
        p6.add(bt27);
        
        p1.setLayout(gr);
        p2.setLayout(gr);
        p3.setLayout(gr1);
        p4.setLayout(gr1);
        p5.setLayout(gr1);
        p6.setLayout(gr1);
        this.setLayout(gr2);//frame elrendezese
        
        
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.add(p5);
        this.add(p6);
        bt26.addActionListener(this);
        bt27.addActionListener(this);
        pack();
        
   }

    
    public static void main(String[] args) {
        Szamologep sz=new Szamologep();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        double eredmeny = 0;
        if(ae.getSource() == bt26){
            tf1.setText(tf1.getText().concat("+"));
    }
        
        /*
        if(ae.getSource() == bt26){
            tf1.setText(tf1.getText().concat("+"));
    }
        if(ae.getSource() == bt26){
            tf1.setText(tf1.getText().concat("+"));
    }
        if(ae.getSource() == bt26){
            tf1.setText(tf1.getText().concat("+"));
    }
        if(ae.getSource() == bt26){
            tf1.setText(tf1.getText().concat("+"));
    }
        if(ae.getSource() == bt26){
            tf1.setText(tf1.getText().concat("+"));
    }*/
        if(ae.getSource()== bt27){
            String[] szamok = tf1.getText().split("\\+");
            eredmeny = Double.parseDouble(szamok[0]);
            if(tf1.getText().contains("+")){ //mivel Stringrol van szo,contains-sel ellenorizzuk hogy ez a muvelet 
                  for(int i =1;i<szamok.length;i++){//es akk hajtodik vegre ha igaz
                      eredmeny+=Double.parseDouble(szamok[i]);
                  }
        }
            
            
            
            
            
            tf1.setText(Double.toString(eredmeny));
}
}
}
