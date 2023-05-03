import java.util.*;
public class QuickSort{
    public static int partition(int array[],int low,int high){
        int pivot = array[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = pivot;
        array[high] = temp;
        return i ;
    }
    public static void QuickSort(int array[] , int low , int high){
        if(low<high){
            int pindx = partition(array,low,high);
            QuickSort(array, low, pindx-1);
            QuickSort(array, pindx+1, high);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element : ");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.print("Enter your element : ");
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        System.out.print("\nElement before sorting : ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.print("\nElement after Sorting : ");
        QuickSort(array, 0, array.length-1);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}
