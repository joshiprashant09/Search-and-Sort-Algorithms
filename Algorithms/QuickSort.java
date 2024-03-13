package Algorithms;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={2,5,9,1,4,3,7};
        QSort(arr,0,6);
    }
    static void QSort(int[] arr, int lowIndex, int highIndex){
        int pivot=arr[highIndex];
        int leftPointer=lowIndex;
        int rightPointer=highIndex;
        if (lowIndex>= highIndex){
            return;
        }
        while (leftPointer<rightPointer){
            while(arr[leftPointer]<=pivot && leftPointer<rightPointer){
                leftPointer++;
            }
            while(arr[rightPointer]>=pivot && leftPointer<rightPointer){
                rightPointer--;
            }
            swap(arr,leftPointer,rightPointer);
        }
        swap(arr, lowIndex, highIndex);
        QSort(arr, lowIndex, leftPointer-1);
        QSort(arr, leftPointer+1, highIndex);
    }
    static void swap(int[] arr, int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
