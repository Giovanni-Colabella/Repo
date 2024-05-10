@FunctionalInterface
interface A {
    int add (int i, int j);
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        A obj = (i,j) -> i+j;
        int result = obj.add(2, 5);
        System.out.println("result is: " +result);
    }
}