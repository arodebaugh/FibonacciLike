package org.sla;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int max = 1 + (int)(Math.random() * 50);
            int first = 1 + (int)(Math.random() * 5);
            int second = 1 + (int)(Math.random() * 5);
            FibonacciLike f = new FibonacciLike(max, first, second, false);
            Thread thread = new Thread(f);
            thread.run();
        }
    }
}
