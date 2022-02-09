import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    QuickSort quickSort = new QuickSort();
    @Test
    void quickSortUsingArrayList_Null() {
        assertThrows(InvalidInputException.class, () -> quickSort.quickSortUsingArrayList(null));
    }
    @Test
    void quickSortUsingArrayList_Empty() {
        List<Integer> list = new ArrayList<Integer>();
        assertThrows(InvalidInputException.class, () -> quickSort.quickSortUsingArrayList(list));
    }
    @Test
    void quickSortUsingArrayList1() throws InvalidInputException{
        List<Integer> list = Arrays.asList(8,7,9,3,2,1);
        quickSort.quickSortUsingArrayList(list);
        assertEquals(Arrays.asList(1,2,3,7,8,9), list);
    }
}