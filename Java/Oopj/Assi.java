//1.  Find the Largest and Smallest Element 
//○  Given an array, find the smallest and largest elements in it. 

import java.util.Scanner;
import java.util.Arrays; 
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;

class LargestSmallest {
    public static void main(String[] args) {
        
	    int arr[] = {3, 4, 23, 4 };

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) largest = arr[i];
            if (arr[i] < smallest) smallest = arr[i];
        }

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}

//  Reverse an Array 
//○  Reverse the given array in place. 

class ReverseArray {
    public static void main(String[] args) {
        
	    int arr[] = {3, 4, 23, 4 };
		int nArr[] = new int[arr.length];
		int j = 0;

        for (int i = arr.length-1; i > 0; i--) {
            nArr[j++] = arr[i];
        }

        System.out.print("Reversed array: ");
        for (int i = 0; i < nArr.length; i++) {
            System.out.print(nArr[i] + " ");
        }
		System.out.println();
    }
}

// .  Find the Second Largest Element 
//○  Find the second-largest element in the given array. 

class SecondLargest {
    public static void main(String[] args) {
        
	    int arr[] = {3, 4, 2, 0};
		int largest = arr[0];
		int sLargest = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > largest) {
				sLargest = largest;
				largest = arr[i];
			} 
		}
		System.out.println("Second largest number is "+sLargest);
    }
}


//  .  Count Even and Odd Numbers 
// ○  Count the number of even and odd numbers in an array. 

class CountEvenOdd {
    public static void main(String[] args) {
        
	    int arr[] = {3, 4, 2, 0};
		int evenCount = 0, oddCount = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenCount++;
			} 
			else {
				oddCount++;
			}
		}
		System.out.println("Even Count = "+evenCount+" Odd Count = "+oddCount);
    }
}


// Find Sum and Average 
//○  Compute the sum and average of all elements in the array. 

class SumAverage {
    public static void main(String[] args) {
        
	    int arr[] = {3, 4, 2, 0};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		int avg = (sum / (arr.length));
		System.out.println("Sum = "+sum+" Average = "+avg);
    }
}


// .  Remove Duplicates from a Sorted Array 
//○  Remove duplicate elements from a sorted array without using extra space. 


class Duplicates{
	
	static int removeDuplicates(int[] arr) {
			int j = 0;	
		
			for(int i = 1; i < arr.length; i++) {
				if(arr[i] != arr [j]){
					 j++;
					 arr[j] = arr[i];
				}
			}
			return j+1;
		}
		
    public static void main(String[] args) {
        
	    int arr[] = {0, 3, 4, 3};	
		Arrays.sort(arr);
		int k = removeDuplicates(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


//7.  Rotate an Array 
//○  Rotate the array to the right by k positions. 

 class RotateArray {
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 3);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


//8.  Merge Two Sorted Arrays 
//○  Merge two sorted arrays into a single sorted array without using extra space. 

class MergeSortedArrays {
    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int[] result = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < n) result[k++] = arr1[i++];
        while (j < m) result[k++] = arr2[j++];

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 6, 7, 8};
        int[] arr2 = {2, 4, 9};
        merge(arr1, arr2);
    }
}



//9.  Find Missing Number in an Array 
//○  Given an array of size n-1 containing numbers from 1 to n, find the missing number. 

class MissingNumber {
    public static int findMissing(int[] arr, int n) {
        int total = (n * (n + 1)) / 2;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return total - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        System.out.println(findMissing(arr, 6));
    }
}



//10.  Find Intersection and Union of Two Arrays 
//○  Find the intersection and union of two unsorted arrays. 

 class IntersectionUnion {
    public static void findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }
        System.out.println("Intersection: " + intersection);
    }

    public static void findUnion(int[] arr1, int[] arr2) {
        Set<Integer> union = new HashSet<>();
        for (int num : arr1) {
            union.add(num);
        }
        for (int num : arr2) {
            union.add(num);
        }
        System.out.println("Union: " + union);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        findIntersection(arr1, arr2);
        findUnion(arr1, arr2);
    }
}



//11.  Find a Subarray with Given Sum 
//○  Given an array of integers, find the subarray that sums to a given value S. 

 class SubarrayWithSum {
    public static void findSubarray(int[] arr, int sum) {
        int currentSum = arr[0], start = 0;
        for (int i = 1; i <= arr.length; i++) {
            while (currentSum > sum && start < i - 1) {
                currentSum -= arr[start++];
            }
            if (currentSum == sum) {
                System.out.println("Subarray with given sum: [" + start + ", " + (i - 1) + "]");
                return;
            }
            if (i < arr.length) {
                currentSum += arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        findSubarray(arr, 33);
    }
}



//12.  Write a program to accept 20 integer numbers in a single Dimensional Array. Find and 
//Display the following: 
//○  Number of even numbers. 
//○  Number of odd numbers. 
//○  Number of multiples of 3 


 class CountNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        int even = 0, odd = 0, multiplesOf3 = 0;

        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            if (num % 2 == 0) even++;
            if (num % 2 != 0) odd++;
            if (num % 3 == 0) multiplesOf3++;
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("Multiples of 3: " + multiplesOf3);
    }
}



//13.  Write a program to accept the marks in Physics, Chemistry and Maths secured by 20 class 
//students in a single Dimensional Array. Find and display the following: 
//○  Number of students securing 75% and above in aggregate. 
//○  Number of students securing 40% and below in aggregate. 

 class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] physics = new int[20];
        int[] chemistry = new int[20];
        int[] maths = new int[20];
        int above75 = 0, below40 = 0;

        for (int i = 0; i < 20; i++) {
            physics[i] = sc.nextInt();
            chemistry[i] = sc.nextInt();
            maths[i] = sc.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            int totalMarks = physics[i] + chemistry[i] + maths[i];
            int percentage = (totalMarks * 100) / 300;
            if (percentage >= 75) above75++;
            if (percentage <= 40) below40++;
        }

        System.out.println("Students with 75% and above: " + above75);
        System.out.println("Students with 40% and below: " + below40);
    }
}



//14.  Write a program in Java to accept 20 numbers in a single dimensional array arr[20]. Transfer 
//and store all the even numbers in an array even[ ] and all the odd numbers in another array 
//odd[ ]. Finally, print the elements of the even & the odd array. 

 class EvenOddArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        int[] even = new int[20];
        int[] odd = new int[20];
        int evenIndex = 0, oddIndex = 0;

        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            if (num % 2 == 0) even[evenIndex++] = num;
            else odd[oddIndex++] = num;
        }

        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) System.out.print(even[i] + " ");

        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < oddIndex; i++) System.out.print(odd[i] + " ");
    }
}



//15.  Write a Java program to print all sub-arrays with 0 sum present in a given array of integers. 
//Example: 
//Input : 
//nums1 = { 1, 3, -7, 3, 2, 3, 1, -3, -2, -2 } 
//nums2 = { 1, 2, -3, 4, 5, 6 } 
//nums3= { 1, 2, -2, 3, 4, 5, 6 } 
//Output: 
//Sub-arrays with 0 sum : [1, 3, -7, 3] 
//Sub-arrays with 0 sum : [3, -7, 3, 2, 3, 1, -3, -2] 
//Sub-arrays with 0 sum : [1, 2, -3] 
//Sub-arrays with 0 sum : [2, -2] 
//CDAC Mumbai 


 class SubarraysWithZeroSum {
    public static void printSubarrays(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == 0) {
                System.out.println("Sub-array with 0 sum: " + java.util.Arrays.toString(java.util.Arrays.copyOfRange(nums, 0, i + 1)));
            }

            if (map.containsKey(sum)) {
                System.out.println("Sub-array with 0 sum: " + java.util.Arrays.toString(java.util.Arrays.copyOfRange(nums, map.get(sum) + 1, i + 1)));
            }

            map.put(sum, i);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -7, 3, 2, 3, 1, -3, -2, -2};
        printSubarrays(nums);
    }
}


/*16.  Given two sorted arrays A and B of size p and q, write a Java program to merge elements of 
A with B by maintaining the sorted order i.e. fill A with first p smallest elements and fill B 
with remaining elements. 
Example: 
Input : 
int[] A = { 1, 5, 6, 7, 8, 10 } 
int[] B = { 2, 4, 9 } 
Output: 
Sorted Arrays: 
A: [1, 2, 4, 5, 6, 7] 
B: [8, 9, 10]  */

 class MergeSortedArraysMaintainOrder {
    public static void merge(int[] A, int[] B) {
        int p = A.length, q = B.length;
        int i = p - 1, j = 0;
        while (i >= 0 && j < q) {
            if (A[i] > B[j]) {
                int temp = A[i];
                A[i] = B[j];
                B[j] = temp;
                i--;
                j++;
            } else {
                break;
            }
        }
        java.util.Arrays.sort(A);
        java.util.Arrays.sort(B);
        System.out.println("Sorted Arrays: ");
        System.out.print("A: ");
        for (int num : A) System.out.print(num + " ");
        System.out.println();
        System.out.print("B: ");
        for (int num : B) System.out.print(num + " ");
    }

    public static void main(String[] args) {
        int[] A = {1, 5, 6, 7, 8, 10};
        int[] B = {2, 4, 9};
        merge(A, B);
    }
}



/*17.  Write a Java program to find the maximum product of two integers in a given array of 
integers. 
Example: 
Input : 
nums = { 2, 3, 5, 7, -7, 5, 8, -5 } 
Output: 
Pair is (7, 8), Maximum Product: 56  */

 class MaxProduct {
    public static void maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
            
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        int maxProduct = Math.max(max1 * max2, min1 * min2);
        System.out.println("Maximum Product: " + maxProduct);
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 7, -7, 5, 8, -5};
        maxProduct(nums);
    }
}



//18.  Print a Matrix// 
//○  Given an m x n m//atrix, print all its elements row-wise. 

class PrintMatrix {
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        printMatrix(matrix);
    }
}


//19.  Transpose of a// Matrix 
//○  Given a matrix, //return its transpose (swap rows and columns). 

class MatrixTranspose {
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] result = transpose(matrix);
        printMatrix(result);
    }
}


//20.  Sum of Two Mat//rices 
//○  Given two matric//es of the same size, compute their sum. 

 class MatrixSum {
    public static int[][] sumMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] sum = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        return sum;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = {
            {1, 2},
            {3, 4}
        };
        int[][] B = {
            {5, 6},
            {7, 8}
        };
        int[][] result = sumMatrices(A, B);
        printMatrix(result);
    }
}



//21.  Row-wise and C//olumn-wise Sum 
//○  Find the sum of //each row and each column of a given matrix.
 
  class MatrixSumRowCol {
    public static void rowColumnSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("Row-wise sum:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }
            System.out.print(rowSum + " ");
        }
        System.out.println();

        System.out.println("Column-wise sum:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += matrix[i][j];
            }
            System.out.print(colSum + " ");
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        rowColumnSum(matrix);
    }
}

 
//22.  Find the Maxim//um Element in a Matrix 
//○  Find the largest element in a given matrix. 

 class MaxElementInMatrix {
    public static int findMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int val : row) {
                max = Math.max(max, val);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Maximum element: " + findMax(matrix));
    }
}



//23.  Matrix Multiplication 
//○  Multiply two matrices and return the resultant matrix. 

 class MatrixMultiplication {
    public static int[][] multiply(int[][] A, int[][] B) {
        int rowsA = A.length, colsA = A[0].length;
        int rowsB = B.length, colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];

        if (colsA != rowsB) {
            System.out.println("Matrix multiplication not possible.");
            return result;
        }

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = {
            {1, 2},
            {3, 4}
        };
        int[][] B = {
            {5, 6},
            {7, 8}
        };
        int[][] result = multiply(A, B);
        printMatrix(result);
    }
}



//24.  Rotate a Matrix by 90 Degrees 
//○  Rotate a given N x N matrix by 90 degrees clockwise. 

 class RotateMatrix {
    public static void rotate90Degrees(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        rotate90Degrees(matrix);
        printMatrix(matrix);
    }
}



//25.  Find the Diagonal Sum 
//○  Compute the sum of both diagonals in a square matrix.

 class DiagonalSum {
    public static int findDiagonalSum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i] + matrix[i][n - i - 1];
        }
        if (n % 2 != 0) {
            sum -= matrix[n / 2][n / 2];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Diagonal sum: " + findDiagonalSum(matrix));
    }
}


