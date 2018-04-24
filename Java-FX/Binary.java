import java.util.Scanner;
public class Binary {
    
    
    //From Number to Binary
    

   /*0
    1
    10
    11
    100
    */
    
   
   public static void main(String[]args){
      Scanner scan = new Scanner(System.in); 
      int t = scan.nextInt(); //t ist der Input des Users
      int x = t;
   
  
   
   
   if(t > 0 && t <= 1000){ // Condition ob der Input von 1-999 ist?
      System.out.print(t + "\t"); //Gibt den Input wider und fügt 1x table hinzu
         
 
      for(;t>1;){ 
       t /= 2;
       
             System.out.print(t + "\t");    
   } 
      } 
    if(x > 0 && x <= 1000){
       System.out.println("\n");

     for(;x>0;x /= 2){
         
         if(x%2==0){
             System.out.print(0 + "\t");
         }
         else{
             System.out.print(1 + "\t");
         }
     
 }
}
       
         }
       
   } 

      

      
           
   
        

