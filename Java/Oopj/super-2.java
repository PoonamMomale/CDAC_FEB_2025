class GP {
	GP() {
		System.out.println("GrandParent method");
	}
}
class Parent extends GP{
	Parent() {
		super();
		System.out.println("Parent method");
	}
}
class Child extends Parent {
	Child(String name) {
		super();
		System.out.println("Child method " +name);
	}
}
class Main {
	public static void main(String args[]) {
		Child c = new Child("ab");
			
	}
}