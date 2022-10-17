package ChapterOne.VarB;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Prime {
    public static void main(String[] args) {
        if (args.length != 0) {
            List<Integer> prime = new ArrayList<>();
            for (String arg : args) {
                if (isPrime(Integer.parseInt(arg))) {
                    prime.add(Integer.parseInt(arg));
                } 
            }
            System.out.println(prime.toString());
        }
    }

    public static boolean isPrime(int num) {
        if (num == 1 || num <= 0) {
            return false;
        } else {
            double sQrT = Math.sqrt(num);
            return IntStream.rangeClosed(2, (int)sQrT).noneMatch(i -> num % i == 0);
        }
    }

}
