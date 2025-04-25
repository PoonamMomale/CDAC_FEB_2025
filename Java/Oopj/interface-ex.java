// Interface A
interface A {
    // Define a method in interface A
    void methodA();
}

// Interface B extends A and adds its own method
interface B extends A {
    void methodB();
}

// Interface C extends A and adds its own method
interface C extends A {
    void methodC();
}

// Class D implements all interfaces A, B, and C
class D implements B, C {
    // Implement methodA from interface A
  
    public void methodA() {
        System.out.println("Method A implemented in class D.");
    }

    // Implement methodB from interface B
    
    public void methodB() {
        System.out.println("Method B implemented in class D.");
    }

    // Implement methodC from interface C
    
    public void methodC() {
        System.out.println("Method C implemented in class D.");
    }
}

 class Main {
    public static void main(String[] args) {
        // Create an object of class D
        D d = new D();

        // Calling methods from interfaces A, B, and C
        d.methodA();
        d.methodB();
        d.methodC();
    }
}
