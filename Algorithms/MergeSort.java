package Algorithms;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {9,2,4,6,3,7,5};
        MSort(arr);
        for (int i=0; i<arr.length-1;i++){
            System.out.print(arr[i]);
        }
    }

    static int[]  MSort(int []arr){
        if (arr.length<2){
            return arr;
        }
        else{
            int mid=arr.length/2;
            int LeftArr[]=new int[mid];
            int RightArr[]=new int[arr.length-mid];
            for (int i=0;i<mid;i++){
                LeftArr[i]=arr[i];
            }
            for (int i=mid;i<arr.length;i++) {
                RightArr[i-mid]=arr[i];
            }
            LeftArr=MSort(LeftArr);
            RightArr=MSort(RightArr);
            arr=Merge(arr,LeftArr,RightArr);
            return arr;
        }
    }
    static int[] Merge(int arr[], int LeftArr[],int RightArr[]){
        int leftsize=LeftArr.length;
        int rightsize=RightArr.length;
        int i=0,j=0,k=0;
        while (i<leftsize && j<rightsize){
            if (LeftArr[i] <= RightArr[j]){
                arr[k]=LeftArr[i];
                i++;
            }
            else{
                arr[k]=RightArr[j];
                j++;
            }
            k++;
        }
        while (i<leftsize){
            arr[k]=LeftArr[i];
            i++;
            k++ ;
        }
        while (j<rightsize){
            arr[k]=RightArr[j];
            j++;
            k++;
        }
        return arr;
    }
}
