
public class VarargsDemo {
	
	static void varargsOverload(boolean k, int a, int b, int c) {
		System.out.println("without varargs method.");
	}
	
	static void varargsOverload(boolean k, int... a) {
		System.out.println("with varargs method with length: " + a.length);
	}
	
	public static void main(String[] args) {
		varargsOverload(true, 1, 2, 3);
		varargsOverload(true, 1, 2);
		varargsOverload(true);
	}
}
