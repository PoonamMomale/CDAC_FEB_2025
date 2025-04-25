class Demo {
	public static void main2(String[] args) {
		System.out.println("Hey");
	}
} //valid

class Demo2 {
	public static void main2(String []args) {
		System.out.println("Hey2");
	}
} //valid

class Demo3 {
	public static void main3(String args[]) {
		System.out.println("Hey3");
	}
} // valid

class Demo4 {
	public static void main$(String... args)  {
		System.out.println("Hey4");
	}
} //valid

class Demo5 {
	static public void main(String[] args){
		System.out.println("Hey5");
	}
} // valid


  public static final void main(String[] args)   - valid
  final public static void main(String[] args)  - valid
  final strictfp public static void main(String[] args) - valid
  public void main(String[] args)  - invalid
  static void main(String[] args)  - invalid
  public void static main(String[] args)  - invalid
  abstract public static void main(String[] args) - invalid