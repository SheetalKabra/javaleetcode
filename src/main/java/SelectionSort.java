import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(65,12,98,42,11,61,8));
////        int length = arrayList.toArray().length;
////        for(int i=0; i<length-1; i++){
////            System.out.println(arrayList.toArray()[i]);
////        }
//        SelectionSort ss = new SelectionSort();
//        ss.selectionSort(arrayList.toArray(new Integer[arrayList.size()]));
//        ss.selectionSortUsingArrayList(arrayList);
    }

    public void selectionSort(Integer[] arr){
        System.out.println("Before sorting:" );
        int length = arr.length;
        for(int i=0; i<length-1; i++){
            System.out.println(arr[i]);
        }
        for(int i=0; i<length-1; i++){
            for(int j=i+1;j<length;j++){
                if(arr[i] > arr[j]){
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After sorting:" );
        for(int i=0; i<length-1; i++){
            System.out.println(arr[i]);
        }
    }


    public void selectionSortUsingArrayList(List<Integer> arrayList) throws InvalidInputException {
        if(arrayList == null || arrayList.size() == 0){
            throw new InvalidInputException();
        }
        int size = arrayList.size();
//        System.out.println("Before sorting:" );
//        for(int i=0; i<size-1; i++){
//            System.out.println(arrayList.get(i));
//        }
        for(int i=0; i<size-1; i++){
            for(int j=i+1;j<size;j++){
                if(arrayList.get(i) > arrayList.get(j)){
                    //swap
                    int temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, temp);
                }
            }
        }
//        System.out.println("After sorting:" );
//        for(int i=0; i<size-1; i++){
//            System.out.println(arrayList.get(i));
//        }
    }
}
