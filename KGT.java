import java.util.Scanner;
public class KGT {
    
    
    public static void main(String[] args) {
        
        
      Scanner scan = new Scanner(System.in);
        System.out.println("Print the first num");
      int a = scan.nextInt();  
        System.out.println("Print the second num");      
        int b = scan.nextInt();

        
        while(b!=0){
            if(a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        System.out.println(a);
    }
    
    
}
