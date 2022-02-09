import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    SelectionSort selectionSort = new SelectionSort();
    @Test
    void selectionSortUsingArrayList_Null() {
        assertThrows(InvalidInputException.class, ()->selectionSort.selectionSortUsingArrayList(null));
    }

    @Test
    void selectionSortUsingArrayList_Empty() {
        List<Integer> list = new ArrayList<>();
        assertThrows(InvalidInputException.class, ()->selectionSort.selectionSortUsingArrayList(list));
    }

    @Test
    void selectionSortUsingArrayList_Empty1() {
        List<Integer> list = new ArrayList<>();
        assertThrows(InvalidInputException.class, ()->selectionSort.selectionSortUsingArrayList(list));
    }

    @Test
    void selectionSortUsingArrayList1() throws InvalidInputException {
        List<Integer> list = Arrays.asList(8,9,3,7,2,1,0,4);
        selectionSort.selectionSortUsingArrayList(list);
        assertEquals(Arrays.asList(0,1,2,3,4,7,8,9), list);
    }

    @Test
    void selectionSortUsingArrayList2() throws InvalidInputException {
        List<Integer> list = Arrays.asList(8,7,6,5,4,3,2,1);
        selectionSort.selectionSortUsingArrayList(list);
        assertEquals(Arrays.asList(1,2,3,4,5,6,7,8), list);
    }
}