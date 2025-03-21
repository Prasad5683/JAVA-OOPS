class StaticExample {
    // Static variable
    static int staticVar = 10;

    // Static block
    static {
        System.out.println("Static block executed!");
        staticVar = 20;  // Modify the static variable in the static block
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method. Static variable value: " + staticVar);
    }

    public static void main(String[] args) {
        // Access the static variable and method
        System.out.println("Static Variable value: " + staticVar);
        staticMethod();
    }
}
