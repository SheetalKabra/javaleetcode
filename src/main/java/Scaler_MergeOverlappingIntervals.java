import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Intervall {
    int start;
    int end;
    Intervall() { start = 0; end = 0; }
    Intervall(int s, int e) { start = s; end = e; }
    // Comparator for sorting the list by roll no
//    public static Comparator<Intervall> StuRollno = new Comparator<Intervall>() {
//        // Method
//        public int compare(Intervall s1, Intervall s2) {
//            int rollno1 = s1.start;
//            int rollno2 = s2.start;
//            // For ascending order
//            return rollno1 - rollno2;
//            // For descending order
//            // rollno2-rollno1;
//        }
//    };
}
public class Scaler_MergeOverlappingIntervals {
    public static void main(String[] args) {
        //(54, 75), (56, 60), (61, 86), (22, 43), (56, 87), (32, 53), (14, 81), (64, 65),
        // (9, 42), (12, 33), (22, 58), (84, 90), (27, 59), (41, 48), (43, 47), (22, 29),
        // (16, 23), (41, 72), (15, 87), (20, 59), (45, 84), (14, 77), (72, 93), (20, 58),
        // (47, 53), (25, 88), (5, 89), (34, 97), (14, 47);
//        new Intervall(54, 75), new Intervall(56, 60), new Intervall(61, 86), new Intervall(22, 43),
//                new Intervall(56, 87), new Intervall(32, 53), new Intervall(14, 81), new Intervall(64, 65),
//                new Intervall(9, 42), new Intervall(12, 33), new Intervall(22, 58), new Intervall(84, 90),
//                new Intervall(27, 59), new Intervall(41, 48), new Intervall(43, 47), new Intervall(22, 29),
//                new Intervall(16, 23), new Intervall(41, 72), new Intervall(15, 87), new Intervall(20, 59),
//                new Intervall(45, 84), new Intervall(14, 77), new Intervall(72, 93), new Intervall(20, 58),
//                new Intervall(47, 53), new Intervall(25, 88), new Intervall(5, 89), new Intervall(34, 97),
//                new Intervall(14, 47)


//                ArrayList<Intervall> B = merge(new ArrayList<>(Arrays.asList(
//                        new Intervall(54, 75), new Intervall(56, 60), new Intervall(61, 86), new Intervall(22, 43),
//                        new Intervall(56, 87), new Intervall(32, 53), new Intervall(14, 81), new Intervall(64, 65),
//                        new Intervall(9, 42), new Intervall(12, 33), new Intervall(22, 58), new Intervall(84, 90),
//                        new Intervall(27, 59), new Intervall(41, 48), new Intervall(43, 47), new Intervall(22, 29),
//                        new Intervall(16, 23), new Intervall(41, 72), new Intervall(15, 87), new Intervall(20, 59),
//                        new Intervall(45, 84), new Intervall(14, 77), new Intervall(72, 93), new Intervall(20, 58),
//                        new Intervall(47, 53), new Intervall(25, 88), new Intervall(5, 89), new Intervall(34, 97),
//                        new Intervall(14, 47))));

        ArrayList<Intervall> B = merge(new ArrayList<>(Arrays.asList(
                new Intervall(54, 75), new Intervall(56, 60), new Intervall(61, 86), new Intervall(22, 43),
                new Intervall(56, 87), new Intervall(32, 53), new Intervall(14, 81), new Intervall(64, 65),
                new Intervall(9, 42), new Intervall(12, 33), new Intervall(22, 58), new Intervall(84, 90),
                new Intervall(27, 59), new Intervall(41, 48), new Intervall(43, 47), new Intervall(22, 29),
                new Intervall(16, 23), new Intervall(41, 72), new Intervall(15, 87), new Intervall(20, 59),
                new Intervall(45, 84), new Intervall(14, 77), new Intervall(72, 93), new Intervall(20, 58),
                new Intervall(47, 53), new Intervall(25, 88), new Intervall(5, 89), new Intervall(34, 97),
                new Intervall(14, 47))));
        //System.out.println("");
        //System.out.println("======================");
        for(int i= 0;i <B.size(); i++){
            System.out.print("["+B.get(i).start+", "+B.get(i).end+"]");
        }
    }
    public static ArrayList<Intervall> merge(ArrayList<Intervall> Intervalls) {
        Collections.sort(Intervalls, new Comparator<Intervall>() {
            // Method
            public int compare(Intervall s1, Intervall s2) {
                int start1 = s1.start;
                int start2 = s2.start;
                // For ascending order
                return start1 - start2;
                // For descending order
                // rollno2-rollno1;
            }
        });
        ArrayList<Intervall> B = new ArrayList<>();

//        for(int i= 0;i <Intervalls.size(); i++){
//            System.out.print("["+Intervalls.get(i).start+", "+Intervalls.get(i).end+"]");
//        }
        //System.out.println("=========================");


        B.add(Intervalls.get(0));
        //System.out.println("["+B.get(0).start+", "+B.get(0).end+"]");
        for(int i=1; i<Intervalls.size(); i++){
            //1. current event ended before next event started
            int Bsize = B.size();
            //System.out.println("i:"+i+"["+B.get(Bsize-1).start+", "+B.get(Bsize-1).end+"]");
            if(B.get(Bsize-1).end < Intervalls.get(i).start){
                B.add(Intervalls.get(i));
            }else if(B.get(Bsize-1).start > Intervalls.get(i).end){
                //current event started after next event ended
                B.add(Bsize-1, Intervalls.get(i));
            }else{
                int start = Math.min(B.get(Bsize-1).start, Intervalls.get(i).start);
                int end = Math.max(B.get(Bsize-1).end, Intervalls.get(i).end);
                Intervall newIntervall = new Intervall(start,end);
                B.set(Bsize-1, newIntervall);
            }
        }
        return B;
    }
}
