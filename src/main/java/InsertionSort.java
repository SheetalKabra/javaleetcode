import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
//        List<Integer> arrayList = Arrays.asList(14, 33, 27, 10, 53, 19, 89, 44);
//        InsertionSort is = new InsertionSort();
//        is.insertionSort(arrayList.toArray(new Integer[arrayList.size()]));
//        is.insertionSortUsingArrayList(arrayList);

    }

    public Integer[] insertionSort(Integer[] arr) {
        int length = arr.length;
//        System.out.println("Before Sorting");
//        for (int i = 0; i < length; i++) {
//            System.out.println(arr[i]);
//        }
        boolean isSwap;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                isSwap = false;
                if (arr[j - 1] > arr[j]) {
                    isSwap = true;
                    //swap
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                if (isSwap == false) {
                    break;
                }

            }
        }
//        System.out.println("After Sorting");
//        for (int i = 0; i < length; i++) {
//            System.out.println(arr[i]);
//        }
        return arr;
    }

    public void insertionSortUsingArrayList(List<Integer> arrayList) throws InvalidInputException{
        if(arrayList == null || arrayList.size() == 0){
            throw new InvalidInputException();
        }
        int size = arrayList.size();
//        System.out.println("Before Sorting");
//        for (int i = 0; i < size; i++) {
//            System.out.println(arrayList.get(i));
//        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arrayList.get(j - 1) > arrayList.get(j)) {
                    //swap
                    int temp = arrayList.get(j - 1);
                    arrayList.set(j - 1, arrayList.get(j));
                    arrayList.set(j, temp);
                }
            }
        }
//        System.out.println("After Sorting");
//        for (int i = 0; i < size; i++) {
//            System.out.println(arrayList.get(i));
//        }
    }

}
