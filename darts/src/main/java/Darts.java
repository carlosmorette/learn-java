class Darts {
	
    int score(double xOfDart, double yOfDart) {
	return compute(xOfDart, yOfDart);
    }

    int compute(double x, double y) {
	var xAbs = Math.abs(x);
	var yAbs = Math.abs(y);

	if (xAbs == 7.0 && yAbs == 7.0) {
	    return 1;
	}

	if (xAbs > 7.0 && yAbs > 7.0) {
	    return 0;
	}

	if (xAbs > 3.5 && yAbs > 3.5) {
	    return 1;
	}

	if (xAbs > 0.7 && yAbs > 0.7) {
	    return 5;
	}

	if (xAbs == 0 && yAbs == 1) {
	    return 10;
	}

	return Math.min(computeLand(xAbs), computeLand(yAbs));
    }

    int computeLand(double n) {
	if (n <= 0.7) {
	    return 10;
	} else if (n <= 3.5 || n < 7.0) {
	    return 5;
	} else if (n <= 7.0) {
	    return 1;
	} else if (n <= 10) {
	    return 1;
	} else {
	    return 0;
	}
    }
}
