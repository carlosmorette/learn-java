class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
	String[] numbersList = String.valueOf(numberToCheck).split("");
	int numberSize = numbersList.length;
	int accumulator = 0;
	    
	for (String n: numbersList) {
	    accumulator += Math.round(Math.pow(Integer.parseInt(n), numberSize));
	}

	return accumulator == numberToCheck;
    }
}
