import java.util.Arrays;

class RaindropConverter {

    String convert(int number) {
	String result =  Arrays.asList(3, 5, 7)
	    .stream()
	    .filter(n -> ifIsDivisible(n, number))
	    .map(n -> convertN(n))
	    .reduce("", (acc, i) -> acc + i);

	if(result.isEmpty()) {
	    return String.valueOf(number);
	}
	
	return result;
    }

    boolean ifIsDivisible(int nT, int number) {
	return number % nT == 0;
    }

    String convertN(int n) {
	switch(n) {
	case 3: return "Pling";
	case 5: return "Plang";
	default: return "Plong";
	}
    }

}
