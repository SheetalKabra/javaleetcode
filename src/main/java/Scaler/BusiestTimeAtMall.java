package Scaler;

import java.io.*;
import java.util.*;

class BusiestTimeAtMall {

    static int findBusiestPeriod(int[][] data) {
        // your code goes here
        int finalTimestamp = data[0][0];
        int timestamp = data[0][0];
        int noOfVisitors = Integer.MIN_VALUE;
        int sum = 0;
        int size = data.length;
        int i=0;
        while(size > i){
            if(timestamp == data[i][0]){
                if(data[i][2] == 1){
                    sum = sum + data[i][1];
                }else{
                    sum = sum - data[i][1];
                }
                i++;
            }else{
                if(sum > noOfVisitors){
                    noOfVisitors = sum;
                    finalTimestamp = timestamp;
                }
                timestamp = data[i][0];
            }
            if(size == i ){
                if(sum > noOfVisitors){
                    noOfVisitors = sum;
                    finalTimestamp = timestamp;
                }
            }

        }
        return finalTimestamp;
    }

    public static void main(String[] args) {
        int[][] data = {
                {1487799425,14,1},//0
                {1487799425,4,1}, //1
                {1487799425,2,1}, //2
                {1487800378,10,1}, //3
                {1487801478,18,1}, //4
                {1487901013,1,1}, //5
                {1487901211,7,1}, //6
                {1487901211,7,1} //7
        };

//        int[][] data = {
//                {1487799425,21,0},
//                {1487799427,22,1},
//                {1487901318,7,0}};
//        int[][] data = {
//                {1487799425, 14, 1},
//                {1487799425, 4,  0},
//                {1487799425, 2,  0},
//                {1487800378, 10, 1},
//                {1487801478, 18, 0},
//                {1487801478, 18, 1},
//                {1487901013, 1,  0},
//                {1487901211, 7,  1},
//                {1487901211, 7,  0}};

//        int[][] data = {{1487799425,14,1},
//                        {1487799425,4,0},
//                        {1487799425,2,0},
//                        {1487800378,10,1},
//                        {1487801478,18,0},
//                        {1487801478,19,1},
//                        {1487801478,1,0},
//                        {1487801478,1,1},
//                        {1487901013,1,0},
//                        {1487901211,7,1},
//                        {1487901211,8,0}};
        System.out.println(findBusiestPeriod(data));
    }


//    Input: [[1487799426,21,1]],Expected: 1487799426,Actual: 1487799426
//    Test Case #2
//    Input: [[1487799425,21,0],[1487799427,22,1],[1487901318,7,0]],Expected: 1487799427,Actual: 1487799427
//    Test Case #3
//    Input: [[1487799425,21,1],[1487799425,4,0],[1487901318,7,0]],Expected: 1487799425,Actual: 1487799425
//    Test Case #4
//    Input: [[1487799425,14,1],[1487799425,4,0],[1487799425,2,0],[1487800378,10,1],[1487801478,18,0],[1487801478,18,1],[1487901013,1,0],[1487901211,7,1],[1487901211,7,0]],Expected: 1487800378,Actual: 1487800378
//    Test Case #5
//    Input: [[1487799425,14,1],[1487799425,4,1],[1487799425,2,1],[1487800378,10,1],[1487801478,18,1],[1487901013,1,1],[1487901211,7,1],[1487901211,7,1]],Expected: 1487901211,Actual: 1487901211

}


