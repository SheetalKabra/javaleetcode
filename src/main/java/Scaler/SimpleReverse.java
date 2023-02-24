package Scaler;

public class SimpleReverse {
    public String solve(String A) {
        /**
         1. convert string to char array
         2. Now reverse the char array
         3. And then again convert char array to String

         Note: We can simply take the new string and assign values from the end to start of A.
         but, this may cause a heap space error as everytime you assign a character to string, and it will create a new string into pool as string are immutable.

         */

        //create a char array from A String
        char[] arr = new char[A.length()];
        for(int i=0; i<A.length(); i++){
            arr[i] = A.charAt(i);
        }
        //now reverse the arr
        int s = 0;
        int e = A.length()-1;
        while(s<e){
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        //now again convert the char arr into String
        return new String(arr);
    }

    public static void main(String[] args) {
        SimpleReverse s = new SimpleReverse();
        System.out.println(s.solve("scaler"));
        System.out.println(s.solve("academy"));
    }
}
