package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i = 0;
        if (power >= 0) {
            while (i <= power) {
                int c = (int) Math.pow(2, i);
                System.out.println(c);
                i++;

            }
        } else {
            System.out.println("too much power");
        }
    }


    public static void main(String[] args) {
        PowerOfTwo power = new PowerOfTwo();
        power.printPower(3);
    }
}
