
public class binarysearch {
    
    
    public static void main(String[] args) {
        
        int [] arr = {32,43,55,26,76,28,57,43,27,54,54,66,74,21};
        
       
      
             int x = (int)(Math.random()*14);
             int randomnum = arr[x];
    
             if(arr[arr.length/2] == arr[x]){
                 System.out.println("Die gesuchte zahl wurde gefunden");
             }
             else {
                 System.out.println("failed");
             }
    }
    
}
