// Числа Фибоначчи

public class Main {
    public static void main(String[] args) {
        int a=1;
        int b = 0;
        for(int i = 0; i<20; i++){
            System.out.print((a) + " ");
            int c = a;
            a += b;
            b = c;
        }
    }
}
