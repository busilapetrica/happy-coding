package org.example.c02controlFlow.validate;
/**********************************************************
Write a java program to read an amount (integer value) and break the amount into
 the smallest possible number of bank notes.
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
        0 Note(s) of 1.00
 ***************************************************************/
public class PrintSmallestPossibleNumberOfBankNotes {
    private PrintSmallestPossibleNumberOfBankNotes() {}

    public static String bankNotes(int amount) {
        int total_bank_notes;
        total_bank_notes = amount /100;
        String result = "";

        result += printBankNotes(total_bank_notes , 100);
        amount = amount - (total_bank_notes*100);

        total_bank_notes = amount /50 ;
        result += printBankNotes(total_bank_notes , 50);
        amount = amount -(total_bank_notes*50);

        total_bank_notes = amount /20;
        result += printBankNotes(total_bank_notes , 20);
        amount = amount -(total_bank_notes*20);

        total_bank_notes = amount /10;
        result += printBankNotes(total_bank_notes , 10);
        amount = amount -(total_bank_notes*10);

        total_bank_notes = amount /5;
        result += printBankNotes(total_bank_notes , 5);
        amount = amount -(total_bank_notes*5);

        total_bank_notes = amount /2;
        result += printBankNotes(total_bank_notes , 2);
        amount = amount -(total_bank_notes*2);

        total_bank_notes = amount /1;
        result += printBankNotes(total_bank_notes , 1);
        amount = amount -(total_bank_notes*1);
        return result;
    }

    public static String printBankNotes(int totalBankNotes, int bankNotes){
        String result = "";
        result = totalBankNotes + " bank notes of " + bankNotes + "\n";
        return result;
    }
}
