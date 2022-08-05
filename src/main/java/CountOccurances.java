public class CountOccurances {
    public int solve(String A) {
        /**
         String B = "bob";
         I will start my loop from s=0 to N-(bob).length(), and
         after that I will apply the 2nd loop which starts from s to (bob).length()
         now check whether a part of string = bob.
         if yes do count++;
         */
        String B = "bob";
        int lenA = A.length();
        int lenB = B.length();
        int count = 0;
        boolean isExists = false;
        for(int s=0; s<=lenA-lenB; s++){
            int k=0;
            isExists = false;
            for(int e=s; e<lenB+s; e++){
                //System.out.println("s="+s+", e="+e+", k="+k);
                if(A.charAt(e) == B.charAt(k)){
                    //System.out.println("if");
                    isExists = true;
                }else{
                    //System.out.println("else");
                    isExists = false;
                    break;
                }
                k++;
            }
            //System.out.println("s="+s+", "+isExists);
            if(isExists == true){

                count++;
            }
            //System.out.println("count:"+count);
        }
        //System.out.println("count:"+count);
        return count;
    }

    public static void main(String[] args) {
        CountOccurances c = new CountOccurances();
        System.out.println(c.solve("bobob"));
    }
}
