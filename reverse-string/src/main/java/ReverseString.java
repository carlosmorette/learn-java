import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

class ReverseString {

    String reverse(String inputString) {
        if (inputString == "") {
            return inputString;
        }   
        
	return doReverse(Arrays.asList(inputString.split("")), new ArrayList<String>());
    }

    String doReverse(List<String> strList, List<String> accumulator) {
	if (strList.isEmpty()) {
	    return accumulator
		.stream()
		.collect(Collectors.joining(""));
	}

	accumulator.add(0, head(strList));
	return doReverse(tail(strList), accumulator);
    }

    String head(List<String> list) {
	return list.get(0);
    }

    List<String> tail(List<String> list) {
	return list.subList(1, list.size());
    }
}
