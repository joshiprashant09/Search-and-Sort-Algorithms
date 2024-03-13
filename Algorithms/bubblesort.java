package Algorithms;

public class bubblesort {
    public static void main(String[] args) {
        int arr[]={2,1,4,6,3,8,5};
        int temp=0;
        System.out.println("Before sorting");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        for (int i=0;i<arr.length;i++){
            for  (int j = 0 ;j < arr.length-i-1;j++ ){
                if (arr[j] > arr [j+1]){ 
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After sorting");
        for (int x=0;x<arr.length;x++){
            System.out.print(arr[x]+" ");
        }
    }
}
