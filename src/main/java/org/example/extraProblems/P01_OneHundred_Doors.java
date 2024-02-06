package org.example.extraProblems;

/******************************************************************************
 * 100 doors 100 doors in a row are all initially closed. You make 100 passes by the doors.
 *  The first time through, you visit every door and toggle the door (if the door is closed,
 *  you open it; if it is open, you close it). The second time you only visit every 2nd door
 *  (door #2, #4, #6, ...).
 *  The third time, every 3rd door (door #3, #6, #9, ...),
 *  etc, until you only visit the 100th door.
 *  Question: What state are the doors in after the last pass?
 *  Which are open, which are closed?
 *  *******************************************************************************/
public class P01_OneHundred_Doors {
    public P01_OneHundred_Doors() {
    }
    public static boolean[] getDoorsState(boolean[] array) {

       for (int i = 0; i < array.length; i++) {
          array[i] = true;
      }

        for (int i = 2; i < array.length; i++) {
            for (int j = i-1; j < array.length; j += i) {
                array[j] = !array[j];
            }
        }
        return array;
    }
}