//Q1:  Write a program to swap two numbers  without using a third variable  and without 
// using arithmetic operators like  +  or  -  . 
// Hint  : Use bitwise XOR  ^  operator. 

import java.util.Scanner;

class SwapNumbers {
		public static void main(String args[]) {
			int a = 10, b = 20;
			System.out.println("Values before swapping: "+a+" "+b);
			
			a = a^b;
			b = a^b;
			a = a^b;
			
			System.out.println("Values after swapping: "+a+" "+b);
		}
}


//Q2:  Write a program to check whether a given number is  even or odd  using only  bitwise operators  . 
// Hint  : Use  n & 1  to check. 

class EvenOdd {
		public static void main(String args[]) {
			int a = 5;
			if ((a & 1) == 0) {
				System.out.println("No is even");
			}
			else {
				System.out.println("No is odd");
			}
		}
}

// Q3:  Implement a program that calculates the  sum of digits  of an integer using  modulus (  %  ) and division (  /  ) operators 

class SumOfDigits {
    public static void main(String args[]) {
        int sum = 0;
        int n = 788;  

        while (n != 0) {
            sum += n % 10;  
            n = n / 10;    
        }

        System.out.println("Sum of digits: " + sum); 
    }
}

// Q4:  Write a program to find whether a given number is  divisible by 3  without using the modulus (  %  ) or division (  /  ) operators. 
//Hint  : Use  subtraction and bitwise shifts  . 

class DivisibleByThree {
    public static void main(String args[]) {
        int n = 6;
		
		while(n>=3) {
			n = n - 3;
		}
		if(n==0) {
			System.out.println("The no is divisible by 3");
		}
		else {
			System.out.println("The no is divisible not by 3");
		}
    }
}


// 5:  Write a Java program to  swap two numbers  using the  +=  and  -=  operators only. 

class SwapNumbersOp {
    public static void main(String args[]) {
        int a = 4, b = 5;
		System.out.println("Numbers before swapping "+a+" "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Numbers after swapping "+a+" "+b);
    }
}

// Q6:  Write a program to find the  largest of three numbers  using only the  ternary operator (  ? :  )  . 

class LargestOfThree{
    public static void main(String args[]) {
        int a = 4, b = 7, c = 5;
		int x= (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		System.out.println("The largerst number is "+x);
    }
}

// Q7:  Implement a Java program that checks whether a given year is a  leap year or not  using logical (  &&  ,  ||  ) operators  . 

class LeapYear{
    public static void main(String args[]) {
        int y = 3444;
		String x = ((y > 0) && (y %4 == 0)) ? "Given year is leap year" : "Given year is not leap year";
		System.out.println(x);
    }
}

// 8:  Write a program that  takes three boolean inputs  and prints  true  if at least two of them are  true  . Hint  : Use logical operators (  &&  ,  ||  ). 

class BooleanInputs{
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter boolean values: ");
        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        boolean c = scanner.nextBoolean();

        boolean result = (a && b) || (a && c) || (b && c);

        System.out.println("At least two of the values are true: " + result);
    }
}

//9:  Implement a Java program that checks if a number is  within a specific range (20 to 50)  without using  if-else  . Hint  : Use  logical AND (  &&  ) in a print statement  . 

class SpecificRange{
    public static void main(String args[]) {
		int num = 45;
		System.out.println((num >= 20 && num <=50 ) ? "The given no is within range"  : "The given no is not within range" );
    }
}

// 10:  Write a program to determine if a  character is a vowel  or a consonant using the ternary operator. 

 class CheckVowel{
    public static void main(String args[]) {
		char ch = 'e';
		String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')? "Vowel" : "Consonant";
        System.out.println("The character " + ch + " is a " + result);
    }
}

// Q11:  Write a program to check if a given number is a  power of 2  using bitwise operators. Hint  :  n & (n - 1) == 0  for positive numbers.

class BitwiseOp{
    public static void main(String args[]) {
		int n = 55;
		System.out.println( (n > 0) && (n & (n - 1)) == 0 ? "No is power of 2" : "No is not power of 2" );
    }
}

// Q12:  Write a Java program to  multiply a number by 8  without using  *  or  /  operators. Hint  : Use bitwise left shift (  <<  ). 
 
 class MultiplyByEight{
    public static void main(String args[]) {
		int n = 2;
		int result = n << 3;
        System.out.println("The number " + n + " multiplied by 8 is: " + result);
    }
}

// 13:  Implement a Java program to find the  absolute value  of an integer using bitwise operators. Hint  :  mask = num >> 31; abs = (num + mask) ^ mask; 	
		 
 class AbsoluteValue{
    public static void main(String args[]) {
		int num = 45;
		int mask = num >> 31;
        int abs = (num + mask) ^ mask;
        System.out.println("The absolute value of " + num + " is: " + abs);
    }
}

// 14:  Write a program to count the  number of 1s (set bits)  in a binary representation of a number using bitwise operations. Hint  : Use  n & (n - 1) 

 class NumberofOnes {
    public static void main(String args[]) {
		int num = 23;
		int count = 0;
        while (num > 0) {
            num = num & (num - 1); 
            count++; 
        }
        System.out.println("The number of 1s (set bits) in the binary representation is: " + count);
    }
}

// Q15:  Implement a program to swap  odd and even bits  of a number using bitwise operators. Hint  : Use masks:  (x & 0xAAAAAAAA) >> 1 | (x & 0x55555555) << 1 

class SwapOddEvenBits {
    public static void main(String args[]) {
		int num = 30;
		int evenMask = 0xAAAAAAAA; 
        int oddMask = 0x55555555;  

        int evenBits = num & evenMask;
        int oddBits = num & oddMask;

        evenBits >>= 1;
        oddBits <<= 1;

        int result = evenBits | oddBits;

        System.out.println("Original number: " + num);
        System.out.println("Number after swapping odd and even bits: " + result);
    }
}

// Q16: Determine If a Number is Positive, Negative, or Zero Using Ternary Operator

class NumberSign {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println(result);
        
    }
}

// Q17: Find the Minimum of Four Numbers Using Nested Ternary Operators
/*
class MinimumOfFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

         int min = (a < b) ? ((a < c) ? ((a < d) ? a : d)  : ((c < d) ? c : d)) : ((b < c)   ? ((b < d) ? b : d) : ((c < d) ? c : d))); 

        System.out.println("Minimum of four numbers: " + min);
        
    }
}*/

// Q18: Check Pass or Fail Based on Percentage Using Ternary Operator

class PassFail {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int percentage = scanner.nextInt();

        String result = (percentage >= 40) ? "Pass" : "Fail";
        System.out.println(result);
        
        scanner.close();
    }
}

// Q19: Check if a Character is Uppercase, Lowercase, or Not a Letter Using Ternary Operator

 class CharCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase" :
                        (ch >= 'a' && ch <= 'z') ? "Lowercase" : 
                        "Not a letter";
        System.out.println(result);
        
        scanner.close();
    }
}

// Q20: Return the Absolute Value of a Given Number Using Ternary Operator

 class AbsoluteValueUsingTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int absValue = (number < 0) ? -number : number;
        System.out.println("Absolute value: " + absValue);
        
        scanner.close();
    }
}

// Q21: Increment a Number Without Using + or ++ Operators

class IncrementWithoutPlus {
    public static int increment(int x) {
        return ~(-x)
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Incremented value: " + increment(number));
    }
}

// Q22: Implement a Calculator Using Switch-Case

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        char operator = scanner.next().charAt(0);

        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                result = 0;
                System.out.println("Invalid operator");
                break;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}

// Q23: Find If a Number is Odd or Even Using Bitwise AND

 class OddEvenCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String result = (number & 1) == 0 ? "Even" : "Odd";
        System.out.println(result);
        
        scanner.close();
    }
}

// Q24: Print All Even Numbers From 1 to 100 Using Bitwise AND

 class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if ((i & 1) == 0) { 
                System.out.println(i);
            }
        }
    }
}

// Q25: Reverse an Integer Without Using String Conversion

class ReverseInteger {
    public static int reverse(int number) {
        int rev = 0;
        while (number != 0) {
            rev = rev * 10 + number % 10;
            number /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Reversed number: " + reverse(number));
        
        scanner.close();
    }
}

