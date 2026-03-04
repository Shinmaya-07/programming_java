import java.io.*;
import java.util.*;

class leader{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n=6;
      int i,j;
      int yes =0;
      int[] arr = {16,17,4,3,5,2};
      for(i=0;i<n;i++){
         yes =0;
         for(j=i+1;j<n;j++){
            if(arr[i] > arr[j]){
               yes = 1;
            }
            else{
               yes=0;
               break;
            }
         }
         if(yes == 1){
            System.out.println(arr[i]);
         }
      }
      System.out.println(arr[5]);

   }
}
