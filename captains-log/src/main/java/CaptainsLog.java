import java.util.Random;
import java.text.MessageFormat;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
	int index = random.nextInt(10);
	return PLANET_CLASSES[index];
    }

    String randomShipRegistryNumber() {
	int start = 1_000;
	int end = 10_000;
	
	return "NCC-" + String.valueOf(start + random.nextInt(end - start));
    }

    double randomStardate() {
	double start = 41_000.0;
	double end = 42_000.0;
	return start + random.nextDouble() * (end - start);
    }
}
