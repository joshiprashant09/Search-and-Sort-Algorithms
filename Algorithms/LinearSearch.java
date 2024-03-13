package Algorithms;
public class LinearSearch {
    static int LSearch(int arr[],int key){
        for (int i=0; i<arr.length-1;i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={1,4,2,5,3,7,9};
        int key=7;
        int position=LSearch(arr, key);
        if (position==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element "+key+ " found at position "+(position+1));
        }
    }
}
