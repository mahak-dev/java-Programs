// Iterative java program to revese an array

import java.util.*;
public class reversearray{
   static void reversearray(int arr[], int start, int end)

   {
    int temp;

    while(start < end){
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
   }
   static void printarray(int arr[], int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");

            
        }

   }
   public static void main(String args[]){
    int arr[] = {1,2,3,4,5,6,7};
    printarray(arr, 7);
    reversearray(arr, 0, 6);
    System.out.println("Reverse array is\n");
    printarray(arr, 7);
   }
}