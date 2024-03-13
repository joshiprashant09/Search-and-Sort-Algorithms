package Algorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {9,2,4,6,3,7,5};
        Isort(arr);
        for (int i=0; i<arr.length-1;i++){
            System.out.print(arr[i]);
        }
    }
    static void Isort(int arr[]){
        for (int i=1; i<arr.length-1; i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
