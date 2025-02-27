
class Demo {
	public static void main(String args[]) {

		int base = 3;
		int exponent = 4;
		int result = 1;

		for (int i = 0; i < exponent; i++) {
   			 result *= base;
		}
		System.out.println(base+" raised to the power "+exponent+" is " + result);

  	}
}