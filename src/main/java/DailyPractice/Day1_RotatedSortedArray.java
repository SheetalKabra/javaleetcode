package DailyPractice;

public class Day1_RotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(searchElement(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        System.out.println(searchElement(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
        System.out.println(searchElement(new int[]{4, 5, 6, 7, 0, 1, 2}, 4));
    }

    private static int searchElement(int[] arr, int target){
        int len = arr.length;
        int low = 0;
        int high = len-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target) return mid;
            //either left half is sorted or right half is sorted
            //1. check if left half is sorted
            if(arr[low] <= arr[mid]){
                if(target >= arr[low] && target <= arr[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                //that means right half is sorted
                if(target >= arr[mid+1] && target <= arr[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
