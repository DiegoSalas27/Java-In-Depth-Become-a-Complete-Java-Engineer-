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

    char happyFace = '\u263A';

    void compute() {
        int nextId = id + 1;

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
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.compute();
    }
}
