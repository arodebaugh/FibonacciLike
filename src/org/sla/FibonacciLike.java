package org.sla;

public class FibonacciLike implements Runnable {
    private int max;
    private int first;
    private int second;
    private int[] sequence;

    private String printOut;
    private Boolean recursive;

    FibonacciLike(int m, int f, int s, boolean r) {
        max = m;
        first = f;
        second = s;
        recursive = r;
        sequence = new int[max];
    }

    void generateSequence() {
        sequence[0] = first;
        sequence[1] = second;

        for (int x = 2; x <= max - 1; x++) {
            int pattern = sequence[x - 1] + sequence[x - 2];
            sequence[x] = pattern;
        }

        printOut = String.valueOf(sequence[0]);

        for (int x = 1; x <= max-2; x++) {
            printOut += ", " + sequence[x];
        }

        System.out.println(printOut);
    }

    void generateRecursiveSequence(int n) {
        if (n == 0) {
            sequence[0] = first;
            generateRecursiveSequence(n + 1);
        } else if (n == 1) {
            sequence[1] = first;
            generateRecursiveSequence(n + 1);
        } else if (n <  max - 1) {
            int pattern = sequence[n - 1] + sequence[n - 2];
            sequence[n] = pattern;
            generateRecursiveSequence(n + 1);
        } else {
            recursivePrintOut(0);
        }
    }

    void recursivePrintOut(int n) {
        if (n == 0) {
            printOut = String.valueOf(sequence[0]);
            recursivePrintOut(n + 1);
        } else if (n < (max - 2)) {
            printOut += ", " + sequence[n];
            recursivePrintOut(n + 1);
        } else if (n == (max - 2)) {
            printOut += ", " + sequence[n];
            System.out.println(printOut);
        }
    }

    public void run() {
        if (recursive) {
            generateRecursiveSequence(0);
        } else {
            generateSequence();
        }
    }
}
