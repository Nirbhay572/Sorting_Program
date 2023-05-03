// import java.util.*;
// public class SelectionSort{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of element : ");
//         int n = sc.nextInt();
//         int array[] = new int[n];
//         System.out.print("Enter the element of array : ");
//         for(int i=0;i<array.length;i++){
//             array[i] = sc.nextInt();
//         }
//         System.out.print("Element before sorting : ");
//         for(int i=0;i<array.length;i++){
//             System.out.print(array[i]+" ");
//         }
//         System.out.print("\nElement after sorting : ");
//         for(int i=0;i<array.length-1;i++){
//             int smallest = i;
//             for(int j=i+1;j<array.length;j++){
//                 if(array[j]<array[smallest]){
//                     smallest = j;
//                 }
//             }
//             int temp = array[i];
//             array[i] = array[smallest];
//             array[smallest] = temp; 
//         }
//         for(int i=0;i<array.length;i++){
//             System.out.print(array[i]+" ");
//         }
//     }
// }
