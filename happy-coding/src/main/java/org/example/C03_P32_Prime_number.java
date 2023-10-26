package org.example;

/**
 * Hello world!
 *
 */
public class C03_P32_Prime_number
{
    public static void main( String[] args )
    {

        int n = 15;
        boolean isNumberPrime = true;

        for(int i=2; i<n; i++){

            if(n%i == 0){
                isNumberPrime = false;
            }
            break;
        }
        if(isNumberPrime){

            System.out.println("the number " + n + " is prime");
        }else{
            System.out.println("the number " + n + " is not prime");

        }
    }
}
