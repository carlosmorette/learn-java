import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.Map;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
	Set<String> s = new HashSet<String>();

	for (String c: cards) {
	    s.add(c);
	}

	return s;
    }

    static boolean addCard(String card, Set<String> collection) {
	return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
	if(myCollection.size() == 0 || theirCollection.size() == 0) {
	    return false;
	}

	for (String s: theirCollection) {
	    if (!myCollection.contains(s)) {
		return true;
	    }
	}

	return false;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
	Map<String, Integer> cardsCounter = new HashMap<>();
	Integer size = collections.size();
	System.out.println(size);
	for(Set<String> set: collections) {
	    for(String s: set) {
		cardsCounter.merge(s, 1, (x, y) -> x + y);
	    }
	}

	Set<String> filtered =
	    cardsCounter.entrySet()
	    .stream()
	    .filter(a -> a.getValue() == size)
	    .map(a -> a.getKey())
	    .collect(Collectors.toSet());

	return filtered;
    }

    static Set<String> allCards(List<Set<String>> collections) {
	Set<String> cards = new HashSet<String>();

	for(Set<String> set: collections) {
	    for(String s: set) {
		cards.add(s);
	    }
	}
	
	return cards;
    }
}
