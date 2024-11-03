
public class ConstructorChaining {
	private final int id;
	private final String gender;
	private boolean isMale;
	private static String student;
	
	ConstructorChaining(int newId, String gender) {
		this(newId, gender, false);
	}
	
	ConstructorChaining(int newId, String gender, boolean isMale) {
		id = newId;
		this.gender = gender; // usually used to reference instance hidden/shadow variables (not constants in most cases)
		this.isMale = isMale;
		this.student = "hello";
	}
	
	public static void main(String[] args) {
		ConstructorChaining constructorChaining = new ConstructorChaining(1, "male");
		System.out.println("id: " + constructorChaining.id);
		System.out.println("gender: " + constructorChaining.gender);
		System.out.println("isMale: " + constructorChaining.isMale);
//		System.out.println("student: " + this.student); // this cannot be used in a static context
		System.out.println("student: " + student);
	}
}
