import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) throws InvalidInputException {
        BinarySearch binarySearch = new BinarySearch();
        List<Integer> list = Arrays.asList(2,8,9,13,28,21,23,45,50);
        binarySearch.binarySearchUsingArrayList(list, 45);
    }
    public void binarySearchUsingArrayList(List<Integer> list, int searchItem) throws InvalidInputException{
        if(list.size() == 0 || list == null){
            throw new InvalidInputException();
        }
        int l = 0;
        int r = list.size()-1;
        int itemPlace = binarySearch(list, l, r, searchItem);
        System.out.println(itemPlace);
        //return itemPlace;
    }

    public int binarySearch(List<Integer> list, int l, int r, int searchItem){
        int m = (l+r)/2;
        System.out.println(m);
        while(r>=l){
            if(list.get(m) == searchItem){
                System.out.println("m");
                return m;
            }else if(list.get(m) > searchItem){
                //goto lhs
                System.out.println("lhs");
                binarySearch(list, l, m-1, searchItem);
            }else if(list.get(m) < searchItem){
                //goto rhs
                System.out.println("rhs");
                binarySearch(list, m+1, r, searchItem);
            }
        }
        return -1;
    }

}
