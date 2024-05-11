import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.stream.Collectors;

class ProteinTranslator {
    final Map<String, String> constant = new HashMap<String, String>() {{
	put("AUG", "Methionine");
	put("UUU", "Phenylalanine");
	put("UUC", "Phenylalanine");
	put("UUA", "Leucine");
	put("UUG", "Leucine");
	put("UCU", "Serine");
	put("UCC", "Serine");
	put("UCA", "Serine");
	put("UCG", "Serine");
	put("UAU", "Tyrosine");
	put("UAC", "Tyrosine");
	put("UGU", "Cysteine");
	put("UGC", "Cysteine");
	put("UGG", "Tryptophan");
	put("UAA", "STOP");
	put("UAG", "STOP");
	put("UGA", "STOP");
	}};

    List<String> translate(String rnaSequence) {
	return
	    doTranslate(rnaSequence, new ArrayList<String>()).stream()
	    .filter(r -> r != null)
	    .collect(Collectors.toList());
    }

    List<String> doTranslate(String rnaSequence, List<String> accumulator) {
	if (rnaSequence.isEmpty()) {
	    return accumulator;
	} else if(rnaSequence.length() < 3) {
	    throw new IllegalArgumentException("Invalid codon");
	} else {
	    var rnaSubs = rnaSequence.substring(0, 3);
	    var rna = constant.get(rnaSubs);

	    if (rna == null) {
		throw new IllegalArgumentException("Invalid codon");
	    } else if(rna == "STOP") {
		return accumulator;
	    } else {
		accumulator.add(rna);
		return doTranslate(rnaSequence.substring(3), accumulator);
	    }
	}
    }

    List<List<String>> chunk(String[] rnaSequence) {
	List<List<String>> accumulator = new ArrayList<List<String>>();
	List<String> sub = new ArrayList<String>();
	int chunkCount = 0;
	
	for (String s: rnaSequence) {
	    if (chunkCount == 2) {
		sub.add(s);
		accumulator.add(new ArrayList<String>(sub));
		sub.clear();
		chunkCount = 0;
	    } else {
		sub.add(s);
		chunkCount++;
	    }
	}

	return accumulator;
    }
}
