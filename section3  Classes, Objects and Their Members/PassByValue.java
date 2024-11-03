public class PassByValue {
    static void go(int[] array) {
        System.out.println("array[0]: " + array[0]);
        System.out.println("array[1]: " + array[1]);
        array[1] = 22;
    }

    static void go2(Integer value) {
        System.out.println("value: " + value);
        value = 1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2};
        go(array);
        System.out.println("array[1] updated: " + array[1]);
        Integer num = 1;
        go2(num);
        System.out.println("value updated: " + num);
    }
}
