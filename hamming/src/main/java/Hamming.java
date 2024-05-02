import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Hamming {
    private class Tuple<L, R> {
	private L i1;
	private R i2;

	Tuple (L i1, R i2) {
	    this.i1 = i1;
	    this.i2 = i2;
	}

	L getL() {return i1;}
	R getR() {return i2;}
    }
    
    int hammingDistance;

    public Hamming(String leftStrand, String rightStrand) {
	if (!(leftStrand.length() == rightStrand.length())) {
	    throw new IllegalArgumentException("strands must be of equal length");
	} else if (leftStrand.isEmpty() && rightStrand.isEmpty()) {
	    this.hammingDistance = 0;
	} else {
	    List<Tuple<String, Integer>> list1 = putIndexes(Arrays.asList(leftStrand.split("")));
	    List<String> list2 = Arrays.asList(rightStrand.split(""));
	    int counter = 0;

	    for (Tuple<String, Integer> t: list1) {
		String vI1 = t.getL();
		Integer i = t.getR();
		String vI2 = list2.get(i);

		if((vI1.charAt(0) != vI2.charAt(0))) {
		    counter++;
		}
	    }

	    this.hammingDistance = counter;
	}
    }

    public int getHammingDistance() {
	return hammingDistance;
    }

    public List<Tuple<String, Integer>> putIndexes(List<String> list) {
	List<Tuple<String, Integer>> accumulator = new ArrayList<Tuple<String, Integer>>();
	int index = 0;

	for(String s: list) {
	    accumulator.add(new Tuple<String, Integer>(s, index));
	    index++;
	}
	return accumulator;
    }
}
