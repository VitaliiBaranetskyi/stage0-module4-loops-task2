package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int count = 2;
        while (count <= printToInclusive) {
            int i = 1, sum = 0;
            while (i < count) {
                if(count % i == 0)
                    sum++;
                i++;
            }
            if(sum <= 1)
                System.out.println(count);
            count++;
        }
    }
}
