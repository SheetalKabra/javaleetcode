import java.util.ArrayList;
import java.util.Arrays;

public class Scaler_Sorting_ArrayWithConsElem {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(3,2,1,4,5))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(3,2,1,5))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(285, 223, 327, 320, 107, 127, 266, 277, 324, 282, 322, 260, 257, 87, 288, 321, 269, 86, 69, 206, 66, 165, 160, 67, 316, 216, 161, 118, 330, 337, 274, 145, 256, 318, 250, 187, 273, 68, 105, 193, 314, 137, 77, 336, 287, 120, 334, 278, 281, 279, 289, 299, 291, 307, 190, 212, 286, 113, 227, 226, 301, 300, 174, 270, 123, 317, 275, 338, 202, 205, 70, 101, 344, 271, 102, 312, 157, 224, 201, 106, 88, 292, 305, 343, 246, 328, 138, 148, 315, 254, 108, 229, 346, 350, 255, 304, 247, 302, 208, 85, 158, 63, 225, 147, 172, 64, 78, 89, 258, 109, 323, 237, 80, 191, 110, 283, 83, 221, 296, 111, 72, 71, 155, 140, 95, 252, 126, 90, 91, 114, 228, 163, 303, 197, 162, 248, 75, 339, 116, 92, 209, 198, 139, 112, 276, 143, 306, 319, 180, 173, 325, 184, 335, 326, 156, 240, 293, 115, 261, 340, 290, 351, 58, 117, 341, 241, 329, 311, 119, 232, 121, 192, 135, 308, 213, 182, 313, 253, 146, 103, 214, 124, 331, 332, 230, 349, 194, 333, 259, 211, 284, 294, 342, 166, 309, 195, 73, 264, 164, 233, 98, 345, 74, 136, 239, 122, 231, 167, 175, 183, 93, 125, 84, 263, 200, 347, 132, 295, 128, 129, 177, 130, 280, 94, 234, 168, 297, 141, 104, 142, 207, 262, 131, 298, 144, 76, 154, 310, 57, 348, 59, 60, 265, 152, 61, 153, 62, 236, 65, 242, 235, 79, 176, 149, 133, 81, 82, 96, 169, 97, 210, 170, 99, 268, 151, 100, 251, 134, 150, 267, 159, 171, 272, 178, 196, 179, 203, 181, 185, 186, 188, 189, 199, 243, 204, 215, 217, 218, 238, 219, 220, 222, 244, 245, 249))));
        System.out.println(solve(new ArrayList<>(Arrays.asList(1, 1, 1, 5, 5))));
    }
    public static int solve(ArrayList<Integer> A) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<A.size(); i++){
            if(A.get(i) < min){
                min = A.get(i);
            }
        }
//        System.out.println("min:"+min);
        int xor1 = 0;
        int xor2 = 0;
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<A.size(); i++){
            //System.out.println("xor:"+xor+", "+A.get(i)+", "+min);
            xor1 ^= A.get(i);
            sum1 += A.get(i);
            xor2 ^= min;
            sum2 += min;
            //System.out.println("final xor:"+xor);
            min++;
        }
//        System.out.println("xor1:"+xor1);
//        System.out.println("xor2:"+xor2);
//        System.out.println("sum1:"+sum1);
//        System.out.println("sum2:"+sum2);


        if(xor1 == xor2 && sum1 == sum2){
            return 1;
        }else{
            return 0;
        }
    }
}
