
import java.util.Scanner;


public class Fakulty {
    
    
    //Iteration more space needed
    static int fakultaetIterativ(int n) {
		int ergebnis = 1;
		for (int i = 1; i <= n; i++) {
			ergebnis = ergebnis * i;
		}
		return ergebnis;
	}
    //Rekursion
    static int fakultaetRekursiv(int n) {
		if (n == 1)
			return 1;
		else
			return fakultaetRekursiv(n - 1) * n;
	}
    
      
        
        
    public static void main(String[] args) {
     
         System.out.println(fakultaetIterativ(5));
      
    }      

 
}
