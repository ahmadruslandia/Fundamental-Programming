public class Main {
    public static void main(String[] args) {
        char[] huruf = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        huruf[1] ='x';
        huruf[9] ='z';

        System.out.println("Huruf : " + huruf[1]);
        System.out.println("Huruf : " + huruf[9]);
    }
}