package org.example;
/******************************************************************************
 Write a java program to read a password until it is valid. For wrong password print "Incorrect password" and for correct password print, "Correct password" and quit the program. The correct password is 1234.
 Test Data :
 Input the password: 1234
 Expected Output:
 Correct password
 *******************************************************************************/
import java.util.Scanner;
public class C04_P36_Check_Password {
    private C04_P36_Check_Password () {}

    public static boolean checkpassword(int password) {
        boolean checkPasword = false;
        if(password == 12345){
            checkPasword = true;
        }else{
            checkPasword = false;
        }
        return checkPasword;
    }
}
