
package lueckenfueller;
public class sortingalgorithm {
      int[] intArr = {12,42,33,94,25,67,38,91,20,24,22,11};
      
        public int[] sort() { 
        int k; 
        for (int i = 0; i < intArr.length - 1; i++) { 
            if (intArr[i] < intArr[i + 1]) { 
                continue; 
            } 
            k = intArr[i]; 
            intArr[i] = intArr[i + 1]; 
            intArr[i + 1] = k; 
            sort(); 
        } 
        return intArr; 
    } 
    public static void main(String[] args) {
         
      
    sortingalgorithm bs = new sortingalgorithm(); 
        int[] arr = bs.sort(); 
        for (int i = 0; i < arr.length; i++) { 
            System.out.println(i + 1 + ": " + arr[i]); 
        } 
    } 
    
}
