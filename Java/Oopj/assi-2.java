class PrimitiveDataTypes {
    public static void main(String[] args) {
        
        byte byteVar = 10;              // Range: -128 to 127
        short shortVar = 1000;          // Range: -32,768 to 32,767
        int intVar = 100000;            // Range: -2^31 to 2^31-1
        long longVar = 10000000000L;    // Range: -2^63 to 2^63-1
        float floatVar = 10.5f;         // Range: +/- 3.4e−038 to 3.4e+038
        double doubleVar = 20.5;        // Range: +/- 1.7e−308 to 1.7e+308
        char charVar = 'A';             // Range: 0 to 65,535 (Unicode characters)
        boolean booleanVar = true;      // Values: true or false

        byte defaultByte = 0;
        short defaultShort = 0;
        int defaultInt = 0;
        long defaultLong = 0L;
        float defaultFloat = 0.0f;
        double defaultDouble = 0.0;
        char defaultChar = '\u0000';  // Unicode value for the default null character
        boolean defaultBoolean = false;

        System.out.println("Default values of primitive data types:");
        System.out.println("byte: " + defaultByte);
        System.out.println("short: " + defaultShort);
        System.out.println("int: " + defaultInt);
        System.out.println("long: " + defaultLong);
        System.out.println("float: " + defaultFloat);
        System.out.println("double: " + defaultDouble);
        System.out.println("char: '" + defaultChar + "'");
        System.out.println("boolean: " + defaultBoolean);

        System.out.println("\nAssigned values of primitive data types:");
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: '" + charVar + "'");
        System.out.println("boolean: " + booleanVar);
    }
}
