package BinarySearch;

public class Algorithm {
    static int binarySearch(int [] arr,int target){
        int start=0;
        int end= arr.length;
        while (start<=end){
            int mid=(start+end)/2;
            if (target==arr[mid]){
                return mid;
            }
            if (target>arr[mid]){
                start=mid+1;
            }
            if (target<arr[mid]) {
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(arr,6));
    }
}
