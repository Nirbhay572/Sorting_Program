// import java.util.*;
// public class BubbelSort{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of element : ");
//         int n = sc.nextInt();
//         int array[] = new int[n];
//         System.out.print("Enter the element value : ");
//         for(int i=0;i<array.length;i++){
//             array[i] = sc.nextInt();
//         }
//         System.out.print("Element before sorting : ");
//         for(int i=0;i<array.length;i++){
//             System.out.print(array[i]+" ");
//         }
//         System.out.print("\nElement after Sorting : ");
//         for(int i=0;i<array.length-1;i++){
//             for(int j=0;j<array.length-1-i;j++){
//                 if(array[j]>array[j+1]){
//                     int temp = array[j];
//                     array[j] = array[j+1];
//                     array[j+1] = temp;
//                 }
//             }
//         }
//         for(int i=0;i<array.length;i++){
//             System.out.print(array[i]+" ");
//         }
//     }
// }
