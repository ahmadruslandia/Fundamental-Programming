public class Main {
    public static void main(String[] args) {
        char[] varlttr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        varlttr[1] ='x';
        varlttr[9] ='z';

        System.out.println("Letter : " + varlttr[1]);
        System.out.println("Letter : " + varlttr[9]);
    }
}