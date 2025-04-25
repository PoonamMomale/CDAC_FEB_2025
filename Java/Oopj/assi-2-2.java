// 2. Write a program to convert an int value to double automatically and display both values.

class IntToDouble {
	public static void main1(String args[]) {
		int a = 10; 
		double b = a;
		
		System.out.println("Int and Double values:"+a+" "+b);
	}
}

// 3. Write a program to convert a double value to int using typecasting and explain the data loss.

class DoubleToInt {
	public static void main2(String args[]) {
		double a = 25.99;

        int b = (int) a;

        System.out.println("Double value: " + a);
        System.out.println("Int value: " + b);
	}
} // The original double value is 25.99. When it is typecast to int, the fractional part .99 is lost, and the result is the integer part 25. 
// This demonstrates data loss because the precision of the fractional part is discarded in the conversion process.

//4. Write a program to calculate the average of three int numbers using typecasting to display the result in double.

class AvgOfInt {
	public static void main3(String args[]) {
		int a=4, b=4, c=4;
		int avg = (a+b+c)/3;
		double r = (double) avg;
        System.out.println("Average: " + r);
	}
} 

// 5. Write a program to demonstrate binary, octal, hexadecimal, and floating-point literals in Java.

class DisplayLiterals {
	public static void main4(String args[]) {
		int a = 0b101101;
        System.out.println("Binary literal: " + a);
		
		int b = 045;
        System.out.println("Octal literal: " + b);
		
	    int c = 0x22A;
        System.out.println("Hexadecimal literal: " + c);
		
		float d = 22.2222f;
        System.out.println("Floating-point literal: " + d);
		
		double e = 22.434343434555d;
        System.out.println("Double literal: " + e);
	}
} 

// 6. Write a program to display character and string literals along with their ASCII values.

class CharStrLiterals {
	public static void main5(String args[]) {
		char a = 'f';
		int c = (int) a;
        System.out.println(a+"'s ASCII value: " + c);
		
		String str = "heyy";
		System.out.println(str+"'s ASCII value: ");
		for(int i=0; i<str.length(); i++) {
			int str_asc = str.charAt(i);
			System.out.print((int) str_asc +" ");
		}
	}
} 

// 7. Write a program that uses boolean literals to control program flow in an if-else statement.

class BooleanLiterals {
	public static void main6(String args[]) {
		boolean a = true;
		boolean b = false;
		if(a) {
			System.out.println("got true conditional if block");
		}
		else {
			System.out.println("got true conditional else block");
		}
		if(b) {
			System.out.println("got false conditional if block");
		}
		else {
			System.out.println("got false conditional else block");
		}
	}
} 

// 8. Write a program to perform addition, subtraction, multiplication, division, and modulus operations on two integer numbers and display the results.

class ArithmeticOp {
	public static void main7(String args[]) {
        int num1 = 10;
        int num2 = 30;

        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;  
        int mod = num1 % num2;  

		System.out.println("Addition is "+add+", Substraction is "+sub+", Multiplication is "+mul+", Division is "+div+" , Modulus is "+mod);
	}
} 

// 10. Write a program to compare two integers using all relational operators (==, !=, >, <, >=, <=) and display the results.

class RelationalOp {
	public static void main8(String args[]) {
        int a = 10;
        int b = 30;
	
		boolean isEqual = (a==b);
		boolean isNotEqual = (a!=b);
		boolean isLessThan = (a<b);
		boolean isGreaterThan= (a>b);
		boolean isLTE= (a<=b);
		boolean isGTE = (a>=b);
		
		System.out.println(a+" == "+b+": "+isEqual);
		System.out.println(a+" != "+b+": "+isNotEqual);
		System.out.println(a+" < "+b+": "+isLessThan);
		System.out.println(a+" > "+b+": "+isGreaterThan);
		System.out.println(a+" <= "+b+": "+isLTE);
		System.out.println(a+" >= "+b+": "+isGTE);
		
	}
} 

// 11. Write a program to check if a number is positive and even using logical operators (&&, ||, !).

class LogicalOp {
	public static void main9(String args[]) {
        int n = 5;
        if (n > 0 && n % 2 == 0) {
            System.out.println("The number is positive and even.");
        } else if (n> 0 && !(n % 2 == 0)) {
            System.out.println("The number is positive but not even (odd).");
        } else if (!(n > 0)) {
            System.out.println("The number is not positive.");
        }
	}
} 

// 12. Write a program to demonstrate the use of assignment operators (=, +=, -=, *=, /=, %=) on two integers. 

class AssignmentOp {
	public static void main(String args[]) {
        int n1 = 10;
        int n2 = 5;

        n1 = n2;
        System.out.println("After n1 = n2, n1 = " + n1);

        n1 += n2;
        System.out.println("After n1 += n2, n1 = " + n1);

        n1 -= n2;
        System.out.println("After n1 -= n2, n1 = " + n1);

        n1 *= n2;
        System.out.println("After n1 *= n2, n1 = " + n1);

        n1 /= n2;
        System.out.println("After n1 /= n2, n1 = " + n1);

        n1 %= n2;
        System.out.println("After n1 %= n2, n1 = " + n1);

	}
} 