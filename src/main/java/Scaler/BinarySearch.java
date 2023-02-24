package Scaler;

import java.util.List;

public class BinarySearch extends InterviewBit1 {

//    public static void main(String[] args) throws Scaler.InvalidInputException {
//        Scaler.BinarySearch bs = new Scaler.BinarySearch();
//        List<Integer> list = Arrays.asList(2,8,9,13,28,21,23,45,50);
//        bs.binarySearchUsingArrayList(null, 45);
//    }


    public int  binarySearchUsingArrayList(List<Integer> list, int searchItem) throws InvalidInputException {
        if(list == null || list.size() == 0){
            throw new InvalidInputException();
        }
        int l = 0;
        int r = list.size()-1;
        int itemPlace = this.binarySearch(list, l, r, searchItem);
        return itemPlace;
    }

    public int binarySearch(List<Integer> list, int l, int r, int searchItem){
        int m = (l+r)/2;
        while(r>=l){
            if(list.get(m) == searchItem){
                return m;
            }else if(list.get(m) > searchItem){
                //goto lhs
                return binarySearch(list, l, m-1, searchItem);
            }else if(list.get(m) < searchItem){
                //goto rhs
                return binarySearch(list, m+1, r, searchItem);
            }
        }
        return -1;
    }

}
