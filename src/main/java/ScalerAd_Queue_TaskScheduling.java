import java.util.*;
import java.util.LinkedList;

public class ScalerAd_Queue_TaskScheduling {
    public static void main(String[] args) {
//        System.out.println(solve(new ArrayList<>(Arrays.asList(2, 3, 1, 5, 4)), new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2))));
//        System.out.println(solve(new ArrayList<>(Arrays.asList(1)), new ArrayList<>(Arrays.asList(1))));
        System.out.println(solve(
        new ArrayList<>(Arrays.asList(27, 123, 58, 130, 43, 52, 92, 150, 106, 122, 57, 22, 9, 12, 3, 154, 160, 132, 70, 31, 39, 62, 51, 126, 121, 82, 124, 68, 148, 142, 94, 32, 100, 108, 134, 118, 120, 99, 77, 74, 40, 37, 85, 71, 76, 90, 50, 107, 80, 10, 24, 48, 60, 111, 95, 36, 138, 109, 64, 29, 28, 105, 53, 46, 34, 158, 89, 73, 49, 30, 161, 20, 13, 44, 4, 67, 83, 75, 157, 110, 88, 61, 112, 116, 155, 147, 66, 81, 140, 103, 114, 159, 101, 91, 152, 79, 135, 119, 25, 55, 65, 26, 127, 84, 41, 54, 16, 72, 144, 86, 164, 97, 139, 21, 69, 63, 117, 87, 7, 17, 23, 35, 141, 15, 133, 137, 129, 33, 47, 125, 56, 163, 42, 143, 45, 102, 38, 96, 14, 2, 145, 115, 18, 136, 149, 93, 113, 78, 151, 6, 11, 8, 1, 146, 153, 156, 98, 5, 131, 128, 19, 104, 59, 162 )),
        new ArrayList<>(Arrays.asList(76, 5, 88, 93, 67, 41, 32, 113, 111, 101, 81, 89, 53, 48, 80, 137, 120, 164, 22, 71, 106, 54, 3, 18, 62, 112, 108, 141, 78, 58, 9, 82, 27, 125, 135, 2, 34, 150, 122, 79, 12, 155, 147, 121, 90, 11, 63, 161, 114, 26, 99, 65, 129, 68, 115, 29, 8, 143, 39, 133, 52, 51, 84, 131, 119, 10, 149, 6, 70, 110, 162, 59, 69, 60, 109, 87, 44, 140, 4, 103, 57, 46, 75, 128, 15, 64, 77, 124, 130, 105, 1, 7, 98, 43, 159, 158, 66, 95, 116, 14, 107, 37, 42, 72, 118, 47, 123, 142, 96, 45, 38, 33, 17, 100, 35, 19, 102, 13, 157, 132, 94, 20, 139, 92, 21, 134, 156, 56, 117, 154, 97, 163, 146, 152, 104, 86, 49, 25, 30, 31, 16, 74, 91, 144, 145, 136, 83, 40, 126, 61, 24, 36, 50, 23, 73, 153, 55, 85, 151, 148, 160, 127, 28, 138))));
    }
    public static int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<A.size(); i++){
            queue.add(A.get(i));
        }
        System.out.println("queue:"+queue);
        int cycle = 0;
        int i = 0;

        while(!queue.isEmpty()){
            System.out.println("B element:"+B.get(i));
            //int count = 0;
            while(!Objects.equals(queue.peek(), B.get(i))){
                int pollElement = queue.poll();
                System.out.println("at i ="+i+", pollElement:"+pollElement);
                cycle++;
                //count++;
                queue.add(pollElement);
//                if(i==15 && count==100){
//                    System.out.println("end: at 15, "+queue.peek());
//                    break;
//                }
            }
//            if(i==15){
//                System.out.println("end: at 15, "+queue.peek());
//                break;
//            }
            System.out.println("final queue:"+queue);
            cycle++;
            queue.poll();
            System.out.println("final final queue :"+queue);
            i++;


        }
        return cycle;
    }
}
