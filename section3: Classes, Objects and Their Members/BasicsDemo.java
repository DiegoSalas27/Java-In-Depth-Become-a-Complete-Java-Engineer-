import java.math.BigDecimal;

class BasicsDemo {
  // Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
  static void print() {
    System.out.println("\n\nInside print ...");
    System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
    System.out.println();                 // Print empty line
    System.out.print("Hello, world!!");   // Cursor stayed after the printed string
    System.out.println("Hello,");
    System.out.print(" ");                // Print a space
    System.out.print("world!!");
  }

  static void primitives() {
    System.out.println("\n\nInside primitives ...");
    int intHex = 0x0041; // Hexadecimal format 0 - 9 A - F/ 167 power 0 * 1 + 16 power 1 * 4
    System.out.println("intHext: " + intHex);

    // hexadecimal are useful to perform bitwise operations. Although binary numbers better. Binary operations
    // are only possible since Java 7.

    int intBinary = 0b01000001; // 65
    System.out.println("intBinary: " + intBinary);
  }
  
  public static void main(String[] args) {	
	   	// Language Basics 1
//		print();
//        primitives();
    System.out.println(1 - 0.9);
    System.out.println(0.1 + 0.2);

    double price = 1000;
    double discountPercent = 0.9;
    double discountAmount = price * discountPercent;
    System.out.println(price - discountAmount);
    System.out.println(price * (1 - discountAmount)); // 0.1 cannot be accurately represented.
    // when working with money, don't use double or float, use BigDecimal.

    // avoid float and double if exact numbers are required.
    BigDecimal first = new BigDecimal("0.1");
    BigDecimal second = new BigDecimal("0.2");
    System.out.println(first.add(second));
  }
}