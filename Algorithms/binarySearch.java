package Algorithms;

import java.util.Arrays;

public class binarySearch {
    static int BSearch(int arr[], int key){
        Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid =(low+high)/2;
            if (arr[mid]==key){
                return mid;
            }
            else if (arr[mid]>key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,1,5,7,69,23,6};
        int key=69;
        if (BSearch(arr, key)==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element "+key+" found at "+"index "+BSearch(arr, key)); //Position after sorting is shown
        }
    }
}
