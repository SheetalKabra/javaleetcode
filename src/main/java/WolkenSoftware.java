import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WolkenSoftware {
    public static void main(String[] args) {
        //take title of meeting as String, I have to sort in alpabetical order, but special char should be at the same place
        String s = "Updated invitation: Sheetal Kabra- Technical Interview (JAVA)| Wolken Softwar... @ Thu Feb 16, 2023 5pm - 6pm (IST) (sheetalkabra4@gmail.com)";
        //Ascii values: A - Z => 65 - 90
        //Ascii values: A - Z => 97 - 122

        Map<Integer, Integer> map = new HashMap<>();

        Map<Character, Integer> map1 = new HashMap<>();
        int N = s.length();
        for(int i=0; i<N; i++){
            int ascii = s.charAt(i);
            if(ascii >= 65 && ascii <= 90){
                int key = ascii - 'A';
                //0, 1 , 2 , 3: 0-25
                if(map.containsKey(key)){
                    map.put(key, map.get(key)+1);

                }else{
                    map.put(key, 1);

                }

            }else if(ascii >= 97 && ascii <= 122){
                //26 - 51
                int key = ascii - 'a' + 26;
                if(map.containsKey(key)){
                    map.put(key, map.get(key)+1);
                }else{
                    map.put(key, 1);
                }
            }
            if((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)){
                if(map1.containsKey(s.charAt(i))){
                    map1.put(s.charAt(i), map1.get(s.charAt(i))+1);
                }else{
                    map1.put(s.charAt(i), 1);
                }
            }

        }
        //System.out.println("map1:"+map1);
        StringBuilder result = new StringBuilder();
        char[] ch = new char[N];
        int counter = 0;

        //System.out.println("map:"+map);
        for(int i=0; i<N; i++){
            int ascii = s.charAt(i);
            if((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)){
                while(!map.containsKey(counter)){
                    counter++;
                }
                if(map.containsKey(counter)){
                    if(counter>= 0 && counter<=25){
                        int counterascii= counter+65;
                        result.append((char)counterascii);
                        ch[i] = (char)counterascii;
                    }else if(counter >= 26 && counter <= 51){
                        int counterascii= counter - 26 + 97;
                        result.append((char)counterascii);
                        ch[i] = (char)counterascii;
                    }

                    map.put(counter, map.get(counter)-1);
                    if(map.get(counter) == 0){
                        counter++;
                    }
                }
            }else{
                result.append(s.charAt(i));
                ch[i] = s.charAt(i);
            }
        }
        System.out.println(s);
        //System.out.println(Arrays.toString(ch));
        System.out.println(result);




    }
}
