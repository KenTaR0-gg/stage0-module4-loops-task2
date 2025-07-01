package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int i = 0;
        while (i <= printTillInclusive) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

//    public void printEvenNumbers(int begin, int end) {
//        int i = begin;
//        while (i <= end) {
//            if (i % 2 == 0 && i != 0) {
//                System.out.println(i);
//            }
//            i++;
//        }
//    }
//
//
//    public static void main(String[] args) {
//        int begin = 23;
//        int end = 27;
//        EvenNumbersPrinter evenNumbersPrinter = new EvenNumbersPrinter();
//        evenNumbersPrinter.printEvenNumbers(23, 27);
//    }
//
//}
