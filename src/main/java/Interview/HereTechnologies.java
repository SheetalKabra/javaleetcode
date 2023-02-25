package Interview;

//  package  whatever;  //  don't  place  package  name!
//  Installed  Libraries:  JSON-Simple,  JUNit  4,  Apache  Commons  Lang3
import  java.io.*;
import  java.util.*;
import java.util.stream.Stream;

class  Btree{
        Integer  value;
        Btree  left;
        Btree  right;

         Btree(Integer  value){
          this.value  =  value;
          this.left  =  null;
          this.right  =  null;
         }

        }

class  HereTechnologies  {

         public  static  void  main  (String[]  args) {

             Btree root = new Btree(2);
             root.left = new Btree(3);
             root.right = new Btree(4);
             root.right.left = new Btree(1);
             root.right.right = new Btree(0);

             root.left.left = new Btree(5);
             root.left.right = new Btree(0);

             levelSum(root);
         }

          //stream
//          List<Integer>  list  =  new  ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,10));
//          int  len  =  list.size();
//          list.stream().filter((num)  ->  {
//
//             if(num  ==  1){
//              return  false;
//             }
//             if(num  ==  2){
//              return  true;
//             }
//             for(int  i=2;  i<num;  i++){
//               if(num%i  ==  0){
//                return  false;
//               }
//             }
//             return  true;
//            }
//          );
//         }



         static  void  levelSum(Btree  root){
           Queue<Btree>  q  =  new  LinkedList<>();
           q.add(root);
           int  max  =  Integer.MIN_VALUE;
           while(!q.isEmpty()){
            int  size  =  q.size();//1,  //2
            int  sum  =  0;
            for(int  i=0;  i<size;  i++){
              Btree  node  =  q.poll();//2,  //3,  4
              sum  +=  node.value;  //2, //3+4
              if(node.left  !=  null){
               q.add(node.left);
              }
              if(node.right  !=  null){
               q.add(node.right);
              }
              //q:[3,4]
              //s:2
              //q:[4,  1,  0]
              //s:7
              //q:[1,  0,  5,  0]
            }
            System.out.println("sum:"+  sum);//2,  7
            max  =  Math.max(sum,  max);
           }
           System.out.println("max:  "+  max);

         }
        }




//  Queue  q:  2
//  2  ->  3,  4
//  4,  1,  0
//  1,  0,  5,  0






//  //  //    2     2
//  //  //  /  \
//  //  //  3 4    7
//  //  //  /\   /\
//  //  //  1  0 5  0   6


//  //  //  6  5  11  6

        //  //  //  Longest  Common  Prefix  in  a  given  set  of  strings
//  //  //  Input:

        //  //  //  keys  =  [codable,  code,  coder,  cod,  coding]
////
//        c
//        /
//        o
//        /
//        d
//        /
//        a
//        /


//Executor,  Multi  threading
//Explore  more  on  stream,  functional  interface



        //  //  //  Output:

        //  //  //  The  longest  common  prefix  is  cod

//  //  //  why  binary  complexity  is  logn

//  //  //  s.no,  amt
//  //  //  1    100
//  //  //  2    50
//  //  //  1    30
//  //  //  3    150
//  //  //  4    125

//  //1 130
//  //2 50
//  //3  150
//  //  4  125





//  //  //  **/







