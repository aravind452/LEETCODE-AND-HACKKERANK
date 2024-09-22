package AUGUST;
import java.util.Arrays;

public class SortedSubArraySum {

  public static void main(String[] args){
    int[] arr = {1, 2, 3, 4};
    int left = 1;
    int right = 5;
    int n = arr.length;
    int count = 0;
    int newarr[] = new int[n*(n+1)/2];
    for(int i=0;i<arr.length;i++){
      int sum = 0;
      for(int j=i;j<arr.length;j++){
        sum = sum + arr[j];
        newarr[count] = sum;
        count++;

      }
      
    }
    Arrays.sort(newarr);
    
    
    int newsum = 0;
    
    for(int i=left-1;i<right;i++){
      newsum = newsum + newarr[i] ;
    }
    System.out.println(newsum);
  }
  
}
