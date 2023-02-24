package Scaler;

import java.util.List;

public class QuickSort {
//    public static void main(String[] args) {
//        Scaler.QuickSort qs = new Scaler.QuickSort();
//        List<Integer> list = Arrays.asList(8,5,9,3,2,1);
//        qs.quickSortUsingArrayList(list);
//        for(int k=0;k<list.size();k++){
//            System.out.print(list.get(k)+",");
//        }
//    }

    public void quickSortUsingArrayList(List<Integer> list) throws InvalidInputException {
        if(list == null || list.size() == 0){
            throw new InvalidInputException();
        }
        int l = 0;
        int h = list.size() -1;
        this.quickSort(list, l, h);
    }

    public int getPivot(List<Integer> list, int l, int h){
        int i = l-1;
        int pivot = list.get(h);
        for(int j=l; j<=h-1;j++){
            if(list.get(j) < pivot){
                i++;
                //swap arr[i] and arr[j]
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }
        int temp1 = list.get(i+1);
        list.set(i+1, list.get(h));
        list.set(h, temp1);
        return i+1;
    }

    public void quickSort(List<Integer> list, int l, int h){

        if(l < h){
            //System.out.println("getPivot(list, "+l+","+h+")");
            int pi = getPivot(list, l, h);
            //System.out.println("int pi =  "+pi);
            int a = pi-1;
            //System.out.println("quickSort(list, "+l+","+ a +")");
            quickSort(list, l, pi-1);
            int b = pi+1;
            //System.out.println("quickSort(list, "+b+","+ h +")");
            quickSort(list, pi+1, h);
        }
    }

}

