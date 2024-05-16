class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        return doComputeSquareOfSumTo(input, 0);
    }

    private int doComputeSquareOfSumTo(int input, int acc) {
        if (input == 0) {
            return (int) Math.pow(acc, 2);
        }

        return doComputeSquareOfSumTo(input - 1, acc + input);
    }

    int computeSumOfSquaresTo(int input) {
        return doComputeSumOfSquaresTo(input, 0);
    }

    private int doComputeSumOfSquaresTo(int input, int acc) {
        if (input == 0) {
            return acc;
        } else {
            return doComputeSumOfSquaresTo(input - 1, acc + (int) Math.pow(input, 2));
        }
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}
