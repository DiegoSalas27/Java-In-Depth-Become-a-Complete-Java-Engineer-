public class Student {
    int id = 1000;

    byte age = 18;

    // byte rank = 165; //[-128, 127] possible lossy conversion from int to byte

    short rank = 165;
    long phone = 223_456_7890L; // Java 7 onwards -- readability

    // Integer literals: int literal, long literal
    int minValue = Integer.MIN_VALUE; // Boxed Primitive class
    int maxValue = Integer.MAX_VALUE;

    float gpa = 3.8f; // 3.8 (double) / 3.8f (float)

    double gpa2 = 3.8e4; // scientific notation

    char degree = 'B';

    char degreeUnicode = '\u0042'; // unicode representation in hexadecimal (UTF 16) <- also called code point

    char happyFace = '\u263A'; // global variable

    // static variables are specific to the class.
    public static int computeCount;

    void compute() {
        computeCount += 1;
        int nextId = id + 1; // local variable

        System.out.println("id: " + id);
        System.out.println("nextId: " + nextId);
        System.out.println("age: " + age);
        System.out.println("phone: " + phone);
        System.out.println("min int value : " + minValue);
        System.out.println("max int value: " + maxValue);
        System.out.println("gpa: " + gpa);
        System.out.println("gpa2: " + gpa2);
        System.out.println("degree: " + degree);
        System.out.println("degreeUnicode: " + degreeUnicode);
        System.out.println("happyFace: " + happyFace);
        System.out.println("Student.computeCount: " + computeCount + "\n");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.compute(); // computeCount = 1
        Student s2 = new Student();
        s2.compute(); // computeCount = 2
        Student s3 = new Student();
        s3.compute(); // computeCount = 3
        System.out.println("Students1.computeCount: " + s1.computeCount + "\n");
        System.out.println("Student2.computeCount: " + s2.computeCount + "\n");
        System.out.println("Student3.computeCount: " + s3.computeCount + "\n");

    }
}
