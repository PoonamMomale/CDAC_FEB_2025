// 1. Implement NullPointerException
// Write a Java program where you initialize a String as null and try to call the .length() method on it. Handle the exception using a try-catch block.

 class NullPointerExample {
    public static void main(String[] args) {
        String str = null;
        try {
            // Attempting to call length() on a null string
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e);
        }
    }
}

// 2. Implement ArithmeticException
// Write a Java program that performs division by zero and catches the ArithmeticException.

 class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            // Performing division by zero
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e);
        }
    }
}


//3. Implement ArrayIndexOutOfBoundsException
// Create an array of 5 elements and try to access an index that does not exist (e.g., index 10). Handle the exception properly.

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] arr = new int[5]; // Array with 5 elements
        try {
            // Trying to access index 10 which doesn't exist
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e);
        }
    }
}


// 4. Implement NumberFormatException
// Write a Java program that tries to convert a non-numeric string to an integer using Integer.parseInt() and catches the NumberFormatException.

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String str = "abc";
        try {
            // Trying to parse a non-numeric string
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Caught exception: " + e);
        }
    }
}


// 5. Implement IllegalArgumentException
// Write a Java method setAge(int age) that throws an IllegalArgumentException if the age is negative or greater than 150.

public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            // Trying to set an invalid age
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e);
        }
    }

    public static void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 0 and 150");
        }
        System.out.println("Age is: " + age);
    }
}


//Checked Exceptions
// Checked exceptions extend Exception and must be either handled using try-catch or declared with throws.

// 6. Implement IOException
// Write a Java program that attempts to read from a file that does not exist and catches IOException.

import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            // Trying to read from a non-existent file
            FileReader reader = new FileReader("nonexistentfile.txt");
        } catch (IOException e) {
            System.out.println("Caught exception: " + e);
        }
    }
}


// 7. Implement FileNotFoundException
//  Write a Java program that tries to open a file that does not exist using FileReader, and handle the FileNotFoundException.

import java.io.*;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Trying to open a file that doesn't exist
            FileReader reader = new FileReader("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Caught exception: " + e);
        } catch (IOException e) {
            System.out.println("Caught general IO exception: " + e);
        }
    }
}


