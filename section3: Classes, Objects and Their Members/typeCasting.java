public class typeCasting {
    static void myTypeCasting() {
        System.out.println("\nInside TypeCasting ...");
        // Explicit casting
        long y = 400000000090900902L;
//        int x = y;
         int x = (int) y;
        System.out.println("Explicit long to int: " + x);

        // Information loss due to out-of-range assignment
        byte narrowedByte = (byte) 123456;
        System.out.println("narrowedByte: " + narrowedByte);

        // Truncation
        int isTruncated = (int) 0.99;
        System.out.println("isTruncated: " + isTruncated);

        // Implicit cast (int too long)
        y = x;

        // Implicit cast (char to int)
        char cChar = 'A';
        int iInt = cChar;
        System.out.println("iInt: " + iInt);

        // Byte to char using an explicit cast
        byte bByte = 65;
        cChar = (char) bByte; // special conversion (widening from byte --> int followed by narrowing from int --> char)
        System.out.println("cChar: " + cChar);
    }

    public static void main(String [] args) {
        myTypeCasting();
    }
}
