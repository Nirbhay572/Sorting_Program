import java.util.*;
public class MergeSort{
    public static void conquer(int number[],int si , int mid , int ei){
        int merged[] = new int[ei-si+1];
        int indx1 = si;
        int indx2 = mid+1;
        int x = 0;
        while(indx1 <= mid && indx2 <= ei){
            if(number[indx1] <= number[indx2]){
                merged[x++] = number[indx1++];
            }else{
                merged[x++] = number[indx2++];
            }
        }
        while(indx1 <= mid){
            merged[x++] = number[indx1++];
        }
        while(indx2 <= ei){
            merged[x++] = number[indx2++];
        }
        for(int i=0,j=si;i<merged.length;i++,j++){
            number[j] = merged[i];
        }
    }
    public static void Divide(int number[] , int si , int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        Divide(number,si,mid);
        Divide(number,mid+1,ei);
        conquer(number,si,mid,ei);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element : ");
        int n = sc.nextInt();
        int number[] = new int[n];
        System.out.print("Enter the element : ");
        for(int i=0;i<number.length;i++){
            number[i] = sc.nextInt();
        }
        System.out.print("\nElement before sorting : ");{
            for(int i=0;i<number.length;i++){
                System.out.print(number[i]+" ");
            }
        }
        System.out.print("\nElement after Sorting : ");
        Divide(number, 0, number.length-1);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
    }
}
// import java.util.*;
// public class MQ_Sort{
//     public static int partition(int array[],int low,int high){
//         int pivot = array[high];
//         int i=low-1;
//         for(int j=low;j<high;j++){
//             if(array[j] < pivot){
//                 i++;
//                 int temp = array[i];
//                 array[i] = array[j];
//                 array[j] = temp;
//             }
//         }
//         i++;
//         int temp = array[i];
//         array[i] = pivot;
//         array[high] = temp;
//         return i ;
//     }
//     public static void QuickSort(int array[] , int low , int high){
//         if(low<high){
//             int pindx = partition(array,low,high);
//             QuickSort(array, low, pindx-1);
//             QuickSort(array, pindx+1, high);
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of element : ");
//         int n = sc.nextInt();
//         int array[] = new int[n];
//         System.out.print("Enter your element : ");
//         for(int i=0;i<array.length;i++){
//             array[i] = sc.nextInt();
//         }
//         System.out.print("\nElement before sorting : ");
//         for(int i=0;i<array.length;i++){
//             System.out.print(array[i]+" ");
//         }
//         System.out.print("\nElement after Sorting : ");
//         QuickSort(array, 0, array.length-1);
//         for(int i=0;i<array.length;i++){
//             System.out.print(array[i]+" ");
//         }

//     }
// }