// Программа выводит в консоль числа-вампиры

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        for(int a = 10; a < 100; a++){
            for(int b = 10; b <= a; b++){
                char[] aArr = ("" + a).toCharArray();
                char[] bArr = ("" + b).toCharArray();
                char[] cArr = {aArr[0], aArr[1], bArr[0], bArr[1]};
                Arrays.sort(cArr);
                int d = a*b;
                char[] dArr = ("" + d).toCharArray();
                Arrays.sort(dArr);
                int result = Arrays.compare(cArr, dArr);
                if (result == 0) System.out.println(a + " * " + b + " = " + d);
            }
        }
    }
}
