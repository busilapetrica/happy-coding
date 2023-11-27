package org.example;
/*
Write a program in C to print Floyd's Triangle.
1
01
101
0101
10101
 */
public class C03_P22_Print_Floyd_s_Triangle {
    public static void main(String[] args){
        int x=5, count=0;
        for(int i=1; i<=x; i++){
            for(int j=1; j<=i; j++) {
                if(count==0){
                    count++;
                }else{
                    count--;
                }
                System.out.print(count);
            }
            System.out.println();
        }
    }
}
