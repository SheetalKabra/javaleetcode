import Scaler.InsertionSort;
import Scaler.InvalidInputException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    InsertionSort insertionSort = new InsertionSort();
    @Test
    void insertionSortUsingArrayList_Null() {
        assertThrows(InvalidInputException.class, ()->insertionSort.insertionSortUsingArrayList(null));
    }

    @Test
    void insertionSortUsingArrayList_Empty() {
        List<Integer> list = new ArrayList<>();
        assertThrows(InvalidInputException.class, ()->insertionSort.insertionSortUsingArrayList(list));
    }

    @Test
    void insertionSortUsingArrayList1() throws InvalidInputException {
        List<Integer> list = Arrays.asList(8,9,3,7,2,1,0,4);
        insertionSort.insertionSortUsingArrayList(list);
        assertEquals(Arrays.asList(0,1,2,3,4,7,8,9), list);
    }

    @Test
    void insertionSortUsingArrayList2() throws InvalidInputException {
        List<Integer> list = Arrays.asList(8,7,6,5,4,3,2,1);
        insertionSort.insertionSortUsingArrayList(list);
        assertEquals(Arrays.asList(1,2,3,4,5,6,7,8), list);
    }
}