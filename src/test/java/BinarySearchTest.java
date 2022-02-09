import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    BinarySearch binarySearch = new BinarySearch();

    @Test
    void binarySearchUsingArrayList_Null() throws InvalidInputException{
        //int itemPlace = binarySearch.binarySearchUsingArrayList(list, 45);
        assertThrows(InvalidInputException.class, () -> binarySearch.binarySearchUsingArrayList(null, 45));
    }

    @Test
    void binarySearchUsingArrayList_Empty() throws InvalidInputException{
        List<Integer> list = new ArrayList<>();
        assertThrows(InvalidInputException.class, () -> binarySearch.binarySearchUsingArrayList(list, 45));
    }

    @Test
    void binarySearchUsingArrayList_NotFound1() throws InvalidInputException{
        List<Integer> list = Arrays.asList(2,3,5,9,21,98,101);
        int item = binarySearch.binarySearchUsingArrayList(list, 20);
        assertEquals(-1, item);
    }
    @Test
    void binarySearchUsingArrayList_NotFound2() throws InvalidInputException{
        List<Integer> list = Arrays.asList(2,8,9,13,20,21,23,45,50);
        int itemPlace = binarySearch.binarySearchUsingArrayList(list, 65);
        assertEquals(-1, itemPlace);
    }
    @Test
    void binarySearchUsingArrayList_NotFound3() throws InvalidInputException{
        List<Integer> list = Arrays.asList(2,8,9,13,20,21,23,45,50);
        int itemPlace = binarySearch.binarySearchUsingArrayList(list, 1);
        assertEquals(-1, itemPlace);
    }
    @Test
    void binarySearchUsingArrayList_NotFound4() throws InvalidInputException{
        List<Integer> list = Arrays.asList(2,8,9,13,20,21,23,45,50);
        int itemPlace = binarySearch.binarySearchUsingArrayList(list, 7);
        assertEquals(-1, itemPlace);
    }

    @Test
    void binarySearchUsingArrayList1() throws InvalidInputException{
        List<Integer> list = Arrays.asList(2,8,9,13,20,21,23,45,50);
        int itemPlace = binarySearch.binarySearchUsingArrayList(list, 2);
        assertEquals(0, itemPlace);
    }

    @Test
    void binarySearchUsingArrayList2() throws InvalidInputException{
        List<Integer> list = Arrays.asList(2,8,9,13,20,21,23,45,50);
        int itemPlace = binarySearch.binarySearchUsingArrayList(list, 8);
        assertEquals(1, itemPlace);
    }
    @Test
    void binarySearchUsingArrayList3() throws InvalidInputException{
        List<Integer> list = Arrays.asList(2,8,9,13,20,21,23,45,50);
        int itemPlace = binarySearch.binarySearchUsingArrayList(list, 9);
        assertEquals(2, itemPlace);
    }
    @Test
    void binarySearchUsingArrayList4() throws InvalidInputException{
        List<Integer> list = Arrays.asList(2,8,9,13,20,21,23,45,50);
        int itemPlace = binarySearch.binarySearchUsingArrayList(list, 13);
        assertEquals(3, itemPlace);
    }
    @Test
    void binarySearchUsingArrayList5() throws InvalidInputException{
        List<Integer> list = Arrays.asList(2,8,9,13,20,21,23,45,50);
        int itemPlace = binarySearch.binarySearchUsingArrayList(list, 20);
        assertEquals(4, itemPlace);
    }
    @Test
    void binarySearchUsingArrayList6() throws InvalidInputException{
        List<Integer> list = Arrays.asList(2,8,9,13,20,21,23,45,50);
        int itemPlace = binarySearch.binarySearchUsingArrayList(list, 21);
        assertEquals(5, itemPlace);
    }
    @Test
    void binarySearchUsingArrayList7() throws InvalidInputException{
        List<Integer> list = Arrays.asList(2,8,9,13,20,21,23,45,50);
        int itemPlace = binarySearch.binarySearchUsingArrayList(list, 23);
        assertEquals(6, itemPlace);
    }
    @Test
    void binarySearchUsingArrayList8() throws InvalidInputException{
        List<Integer> list = Arrays.asList(2,8,9,13,20,21,23,45,50);
        int itemPlace = binarySearch.binarySearchUsingArrayList(list, 45);
        assertEquals(7, itemPlace);
    }
    @Test
    void binarySearchUsingArrayList9() throws InvalidInputException{
        List<Integer> list = Arrays.asList(2,8,9,13,20,21,23,45,50);
        int itemPlace = binarySearch.binarySearchUsingArrayList(list, 50);
        assertEquals(8, itemPlace);
    }

}