// Программа выводит в консоль все простые числа от 2 до 100
// Так как 1(единица) не является ни простым, ни составным числом, она в консоль не выводится

public class Main {
    public static void main(String[] args) {
        for (int a=1; a<100;a++){
            for (int b=2; b<=a;b++){
                if(a%b==0){
                    if(a/b!=1) break;
                    System.out.print(a + " ");
                }
            }
        }
    }
}
