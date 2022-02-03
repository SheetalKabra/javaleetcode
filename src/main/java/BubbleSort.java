import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
//    public static void main(String[] args) throws InvalidInputException {
//        List<Integer> array = Arrays.asList(5,4,3,2,1);
//        BubbleSort bs = new BubbleSort();
//        bs.bubbleSortUsingArrayList(array);
//        List<Integer> arrayList = Arrays.asList(8,5,9,3,2,1);
//        bs.bubbleSort(arrayList.toArray(new Integer[arrayList.size()]));
//    }

    public Integer[] bubbleSort(Integer[] arr){
        int length = arr.length;
        System.out.println("Before sorting:");
        for (int i=0;i<length;i++){
            System.out.println(arr[i]);
        }
        boolean isSwap = true;
        for(int i=0;i<length;i++){
            isSwap = false;
            for(int j=0;j<length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    isSwap = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(isSwap == false){
                break;
            }
        }
        System.out.println("After sorting:");
        for (int i=0;i<length;i++){
            System.out.println(arr[i]);
        }
        return arr;
    }

    public void bubbleSortUsingArrayList(List<Integer> arrayList) throws InvalidInputException {
        if(arrayList == null || arrayList.size() == 0){
            throw new InvalidInputException();
        }
        int size = arrayList.size();
        System.out.println("Before sorting:");
        for (int i=0;i<size;i++){
            System.out.println(arrayList.get(i));
        }
        boolean isSwap = true;
        for(int i=0; i<size-1; i++){
            isSwap = false;
            for(int j=0;j<size-i-1;j++){
                if(arrayList.get(j) > arrayList.get(j+1)){
                    //swap
                    isSwap = true;
                    int temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j+1));
                    arrayList.set(j+1, temp);
                }
            }
            if(isSwap == false){
                break;
            }
        }
        System.out.println("After sorting:");
        for (int i=0;i<size;i++){
            System.out.println(arrayList.get(i));
        }
    }

}
