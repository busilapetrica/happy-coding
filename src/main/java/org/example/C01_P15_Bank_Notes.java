package org.example;
/*Write a java program to read an amount (integer value) and break the amount into the smallest possible number of bank notes.
        Test Data :
        Input the amount: 375
        Expected Output:
        There are:
        3 Note(s) of 100.00
        1 Note(s) of 50.00
        1 Note(s) of 20.00
        0 Note(s) of 10.00
        1 Note(s) of 5.00
        0 Note(s) of 2.00
        0 Note(s) of 1.00*/
public class C01_P15_Bank_Notes {
    public static void main(String[] args){
        int total_bank_notes, amount = 375;

        total_bank_notes = amount/100;
        System.out.println(total_bank_notes + " bank notes of 100");
        amount = amount - (total_bank_notes*100);

        total_bank_notes = amount/50 ;
        System.out.println(total_bank_notes + " bank notes of 50");
        amount = amount -(total_bank_notes*50);

        total_bank_notes = amount/20;
        System.out.println(total_bank_notes + " bank notes of 20");
        amount = amount -(total_bank_notes*20);

        total_bank_notes = amount/10;
        System.out.println(total_bank_notes + " bank notes of 10");
        amount = amount -(total_bank_notes*10);

        total_bank_notes = amount/5;
        System.out.println(total_bank_notes + " bank notes of 5");
        amount = amount -(total_bank_notes*5);

        total_bank_notes = amount/2;
        System.out.println(total_bank_notes + " bank notes of 2");
        amount = amount -(total_bank_notes*2);

        total_bank_notes = amount/1;
        System.out.println(total_bank_notes + " bank notes of 1");
        amount = amount -(total_bank_notes*1);

    }
}
