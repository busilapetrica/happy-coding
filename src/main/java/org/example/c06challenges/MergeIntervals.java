package org.example.c06challenges;

public class MergeIntervals {
    //int [][] existingIntervals = new int[][]{{1,3}, {5,7}, {8,9}, {10, 13}};

    public static int[][] mergeIntervals( int[][] existingIntervals, int[] newInterval){

        for(int i=0; i<existingIntervals.length; i++){
            if(newInterval[0] > existingIntervals[i][0] && newInterval[0] < existingIntervals[i][1]){
                if(newInterval[1] > existingIntervals[i][1] && newInterval[0] < existingIntervals[i][1]){

                }
            }
        }


        return new int[][] {};
    }

}
