//WAP that asks three integers from users and print the Greatest number.

package Java.LabQuestions.DataType;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Three numbers: ");
        num1= scanner.nextInt();
        num2= scanner.nextInt();
        num3= scanner.nextInt();
        scanner.close();
        if (num1>=num2 && num1>=num3) {
            System.out.println("The greatest number is "+num1 );
        } else if(num2>=num1 && num2>=num3) {
            System.out.println("The greatest number is "+ num2 );
        } else{
            System.out.println("The greatest number is "+ num3);
        }
    }
}
