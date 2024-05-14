class CollatzCalculator {

    int computeStepCount(int start) {
        if (start <= 0) {
            throw new IllegalArgumentException("Only positive integers are allowed");
        }
        
        return process(start, 0);
    }

    int process(int n, int tries) {
        if (n == 1) {
            return tries;
        }
        
        if (isEven(n)) {
            return process(n / 2, tries + 1);
        }

        return process(n * 3 + 1, tries + 1);
    }

    boolean isEven(int n) {
        return n % 2 == 0;
    }
}
