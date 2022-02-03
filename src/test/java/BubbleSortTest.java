import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    BubbleSort bubbleSort = new BubbleSort();
    @Test
    void bubbleSortUsingArrayList_Null() {
        assertThrows(InvalidInputException.class, ()->bubbleSort.bubbleSortUsingArrayList(null));
    }

    @Test
    void bubbleSortUsingArrayList_Empty(){
        List<Integer> list = new ArrayList<>();
        assertThrows(InvalidInputException.class, ()->bubbleSort.bubbleSortUsingArrayList(list));
    }

    @Test
    void bubbleSortUsingArrayList1() throws InvalidInputException {
        List<Integer> list = Arrays.asList(8,9,3,7,2,1,0,4);
        bubbleSort.bubbleSortUsingArrayList(list);
        assertEquals(Arrays.asList(0,1,2,3,4,7,8,9), list);
    }

    @Test
    void bubbleSortUsingArrayList2() throws InvalidInputException {
        List<Integer> list = Arrays.asList(8,7,6,5,4,3,2,1);
        bubbleSort.bubbleSortUsingArrayList(list);
        assertEquals(Arrays.asList(1,2,3,4,5,6,7,8), list);
    }

}