/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Metódusok {
    
   /* 
   // 1. 
    public static void Novekvoben(int a, int b, int c){

	if(a > b && a > c && b > c){
            System.out.println("Növekvő sorrendben:"+c+","+b+","+a); 
		}
	else if(a > b && a > c && c > b){
            System.out.println("Növekvő sorrendben:"+b+","+c+","+a);
	}
	else if(b > a && b> c && a > c){
            System.out.println("Növekvő sorrendben:"+c+","+a+","+b );
	}
        else if(b > a && b > c && c > a) {
            System.out.println("Növekvő sorrendben:"+a+","+c+","+b);
         }
        else if(c > a && c > b && a> b){
            System.out.println("Növekvő sorrendben:"+b+","+a+","+c);
        }
        else{
            System.out.println("Növekvő sorrendben:"+a+","+b+","+c);
        }
        
}

*/

/*
//2.
    public static void Minabszmax(int a, int b, int c){
	int min = 0;
	int abszmax = 0;
	
	if(a < b && a < c){
	min = a;
	} 
	else if(b < a && b < c){
	min = b;
	} 
	else{
	min = c;
	} 
	System.out.println("Az értékek minimuma:"+min);
	
	a = Math.abs(a);
	b = Math.abs(b);
	c = Math.abs(c);
	if ( a > b && a > c) {
	abszmax = a;
	}
	else if(b > a && b > c) {
	abszmax = b;
	}
	else{
	abszmax = c;
	}

	System.out.println("Az abszolútértékek maximuma:"+abszmax);
}
	
*/

/*    
//3. 
    public static void Sorrend(int a, int b, int c, int d){
	System.out.println(a+","+b+","+c+","+d);
	if( d >= 0){
	System.out.println(a+","+c+","+b+","+d);
	}
	else{
	System.out.println(a+","+b+","+d+","+c);
	} 
    }
*/
    
 
/*
//4.
  public static boolean Haromszog(int a, int b, int c){
       
        if (a < c + b || b < c + a || c < b + a) {
            return true;
	}
         else {
            return false;
        }
  }
*/

/*
//5.
public static void hanySzokoev(int ev1, int ev2){
	int kezdoev =  ev1;
	int vegsoev = ev2;


	if(ev1 > ev2){
	kezdoev = ev2;
	vegsoev = ev1;
	}

	int i;
        int szamlalo=0;
	for(i=kezdoev; i>=vegsoev; i++){
	if((i %4 == 0 && i%100 !=0) || i % 400 ==0){
	szamlalo++;
	}
	}
	   System.out.println(szamlalo);
	}
*/

/*
//6. 
    public static void Ertekeles(int érdemjegy){
switch(érdemjegy){
	case 5:
	System.out.println("Jeles");
	break;
	case 4:
	System.out.println("Jó");
	break;
	case 3:
	System.out.println("Közepes");
	break;
	case 2:
	System.out.println("Elégséges");
	break;
	case 1:
	System.out.println("Elégtelen");
	break;

        }
    }
    //
*/
  
 /*   
 //7.
    public static int Hanyados(int a, int b) {

        int hanyados = 0;
        
        while (a >= b) {
            hanyados += 1;
            a -= b;
        }
        return hanyados;
    }
   */ 
 
    
  /*  
 //8.
    public static void Primszame(int n){
    int i;
    int osztok_szama=0;
    
    for(i=1;i<=n;i++){
    if(n % i == 0){
    osztok_szama++;
    }
    }
    if(osztok_szama==2){
    System.out.println("A megadott szám prím szám");
    }
    else{
    System.out.println("A megadott szám nem prím szám");
    }
    } 
*/
    
  /*
//9.
public static int n1=0, n2 = 1, n3 =0;
public static void Fibonacci(int count){
    if(count > 0){
    n3 = n1 + n2;
    n1 = n2;
    n2 = n3;
    System.out.println(""+n3);
    Fibonacci(count-1);
    }
*/

  /*
//10.
    public static int Forditott_szam(int n){
int ujszam=0;
while(n!=0){
    ujszam = ujszam*10;
    ujszam = ujszam + n%10;
    n = n / 10;
}
return ujszam;
}
*/

/*
//11.
    public static void Faktorialis(int a){
    long int fakt=1;
    int i;
    for(i=1;i<=a;i++){
    fakt*=i;
    }
    System.out.println("A megadott szam faktorialisa:"+fakt);
    
*/
    
/*    
 //12.
    public static void Oszthato(int n1,int n2,int k){
        int i;
    for(i=n1;i<=n2;i++){
    if(i % k ==0){
    System.out.println(i);
           }
    System.out.println(\n);
    }
 }
*/
    
//14.
   /* public static void Kisebb() {
        int a;
        for (a = 999; a > 100; --a) {
            int b = a % 10;
            int c = a / 100;
            int d = a / 10 % 10;
            int n = (b * b * b) + (c * c * c) + (d * d * d);

            if (a == n) {
                System.out.println(a);
            }
        }
    }
    */
    
  


}