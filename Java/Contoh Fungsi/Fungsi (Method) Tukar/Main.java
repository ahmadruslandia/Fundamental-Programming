public class Main {
    static void tukar(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    public static void main(String[] args) {
        int a, b;

        a = 1;
        b = 2;

        tukar(a, b);
    }
}