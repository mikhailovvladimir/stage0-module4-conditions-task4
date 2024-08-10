package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        // Find the greatest number among the three
        int greatest = first;

        if (second > greatest) {
            greatest = second;
        }

        if (third > greatest) {
            greatest = third;
        }
        
        System.out.println(greatest);
    }
}
