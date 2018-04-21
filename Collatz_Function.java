
package lueckenfueller;


public class Collatz_Function {
    
    public static void main(String[] args) {
      calc(19);
    }
    
    public static void calc(int n){
        
        while(n != 0){
            if(n % 2 == 0){
             n /= 2;
                System.out.println(n);
                
            }
            else{
            
                n *= 3 + 1;
                System.out.println(n);
            }
            
            
        }
        
    }
    
    
}
