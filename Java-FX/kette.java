import java.util.Scanner;
public class kette {
    
    
    //From Number to Binary
    

    
   
      public static void main(String[]args){
      Scanner scan = new Scanner(System.in); 
      int t = scan.nextInt(); //t ist der Input des Users
      int x = t;
     
   
  
   
   
   if(t > 0 && t <= 1000 && (x > 0 && x <= 1000)){ 
      System.out.print(t + "\t");
         
      for(;t>1;){ 
      t /= 2;
      System.out.print(t + "\t");    
                } 
                        } 
    
   
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
