package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        System.out.println("1");
        int i = 1;
        int m = 1;
        while (i <= printToInclusive) {
            m = m * i;
            System.out.println(m);
            i++;
        }
    }


    public static void main(String[] args) {
        FactorialNumbers factorialNumbers = new FactorialNumbers();
        factorialNumbers.printFactorialRow(7);
    }
}
