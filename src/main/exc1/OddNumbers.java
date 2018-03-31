package exc1;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) {
        new OddNumbers().run(System.out, System.in, 5);
    }
    // How to improve code: 1 allow to print in decimals, 2 allow to add only odd numbers (most important), 3 allow longer numbers (can crash the code)

    public void run(PrintStream out, InputStream in, int count) {
        out.println("Add your numbers to calculate mean:");
        List<Long> numbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(in)) {
            for (int i = 0; i < count; i++) {
                numbers.add(scanner.nextLong());
            }
        }
        out.println("The average of odd numbers: " + calculateOddAverage(numbers));
    }

    protected long calculateOddAverage(List<Long> numbers) {
        long oddAvg = 0;
        for (Long n : numbers) {
            if (n % 2 != 0) {
                oddAvg = oddAvg == 0 ? n : getAverage(oddAvg, n);
            }
        }
        return oddAvg;
    }

    protected long getAverage(long a, long b) {
        return (a + b) / 2;
    }
}
