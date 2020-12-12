package com.burak;
import java.util.Scanner;
public class findEvenNumber {
    public static void main(String[] args) {
        System.out.println("Please enter a number of element : ");
        int element= new Scanner(System.in).nextInt();
        //We want the number of element from user.
        int sum1=0;
        int sum2=0;
        int i;
        for(i=0;i<=element-1;i++){
            System.out.print("Please enter "+ element + " element of array1 :");
            int elm = new Scanner(System.in).nextInt();
            //We take a element of Array from user.
            if (elm%2==0){
                sum1=sum1+elm;
            }
            else{
                sum2=sum2+elm;
            }

        }
        System.out.println("The sum of even double number is :"+sum1);
        System.out.println("The sum of even single number is :"+sum2);
        //Finally print sum that even and single number.

    }
}

