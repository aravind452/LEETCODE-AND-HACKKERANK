package AUGUST;
public class ArraysEqual {

  public static void main(String[] args){
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = {5,3,2,3,1};

    int[] ans = new int[1001];
    int flag = 0;


    for(int i=0;i<arr1.length;i++){
      ans[arr1[i]]++;
    }
    for(int i=0;i<arr2.length;i++){
      ans[arr2[i]]--;
    }
    for(int i=0;i<ans.length;i++){
      if(ans[i]!=0){
        flag = 1;
       
        break;
      }

    }
    if(flag==0){
      System.out.println("Arrays are equal");
    }
    else {
      System.out.println("Arrays are not equal");
    }
  }
  
}
