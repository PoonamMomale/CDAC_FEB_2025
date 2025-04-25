
// default

 /* class Parent{
	Parent() {
		System.out.println("Parent method");
	}
}
class Child extends Parent {
	Child() {
		super();
		System.out.println("Child method ");
	}
}  */

// d-p, c-p

/* class Parent{
	Parent() {
		System.out.println("Parent method");
	}
}
class Child extends Parent {
	Child(String name) {
		super();
		System.out.println("Child method "+name);
	}
}  */

// d-c, p-p
/*
class Parent{
	Parent(String name) {
		System.out.println("Parent method "+name);
	}
}
class Child extends Parent {
	Child() {
		//super();
		System.out.println("Child method ");
	}
}  // we will get error as constructor cannot be applied to given types
*/

// d-p,c  ,  c-p

/*
class Parent{
	Parent() {
		System.out.println("Parent method");
	}
}
class Child extends Parent {
	Child() {
		System.out.println("Child method");
	}
	Child(String name) { // will run only one constructor method at the initialization
		super();
		System.out.println("Child method "+name);
	}
}  */

// d-p,c   , p-p

/*
class Parent{
	Parent() {
		System.out.println("Parent method");
	}
	Parent(String name) {
		System.out.println("Parent method "+name);
	}
}
class Child extends Parent {
	Child() {
		super("AA");   // will run parameterized constructor if passed value in super keyword
		System.out.println("Child method");
	}
} */

// d-p,c   , p-p,c

class Parent{
	Parent() {
		System.out.println("Parent method");
	}
	Parent(String name) {
		System.out.println("Parent method "+name);
	}
}
class Child extends Parent {
	Child() {
		super("abc");
		System.out.println("Child method");
	}
	Child(String name) { // will run only one constructor method at the initialization
		super();
		System.out.println("Child method "+name);
	}
}

class Main {
	public static void main(String args[]) {
		Child c = new Child();
	}
}

