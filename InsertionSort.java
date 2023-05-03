// import java.util.*;
// public class InsertionSort{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of element : ");
//         int n = sc.nextInt();
//         int array[] = new int[n];
//         System.out.print("Enter the element : ");
//         for(int i=0;i<array.length;i++){
//             array[i] = sc.nextInt();
//         }
//         System.out.print("\nElement before Sorting : ");
//         for(int i=0;i<array.length;i++){
//             System.out.print(array[i]+" ");
//         }
//         System.out.print("\nElement after sorting : ");
//         for(int i=1;i<array.length;i++){
//             int current = array[i];
//             int j = i-1;
//             while(j>=0 && current < array[j]){
//                 array[j+1] = array[j];
//                 j--;
//             }
//             array[j+1] = current;
//         }
//         for(int i=0;i<array.length;i++){
//             System.out.print(array[i]+" ");
//         }
//     }
// }
