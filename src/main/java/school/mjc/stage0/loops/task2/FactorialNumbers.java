package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int count = 0;
        while (count <= printToInclusive){
            int result = 1;
            for (int i = 1; i <= count; i++) {
                result = result * i;
            }
            System.out.println(result);
            count++;
        }
    }
}
