import java.util.ArrayList;

public class SringOperations {
    public String solve(String A) {
        /**
         I first need to create the char array of double size of A,
         why I am creating char array, as if I took new String B,
         and everytime I apply operation on String B, It will create a new string in the string pool.
         So to not create strings on every operations i will create char arryay, and then convert char array to string B.
         */
        int N = A.length();
        ArrayList<Character> arr = new ArrayList<>();
        //insert all except uppercase
        for(int i=0; i<N ;i++){
            if(A.charAt(i) >= 65 && A.charAt(i) <= 90){
                continue;
            }else{
                arr.add(A.charAt(i));
            }
        }

        char[] newarr = new char[2*(arr.size())];
        //create a char array and insert the arr and arr itself
        for(int i=0; i<arr.size(); i++){
            newarr[i] = arr.get(i);
            newarr[i+arr.size()] = arr.get(i);
        }

        //replace each vowel with #
        for(int i=0; i<arr.size(); i++){
            if(newarr[i] == 'a' || newarr[i] == 'e' || newarr[i] == 'i' || newarr[i] == 'o' || newarr[i] == 'u'){
                newarr[i] = '#';
                newarr[i+arr.size()] = '#';
            }
        }
        return new String(newarr);
    }

    public static void main(String[] args) {
        SringOperations s = new SringOperations();
        System.out.println(s.solve("AbcaZeoB"));
    }
}
