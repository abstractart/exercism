import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<String>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        int myCandidates = 0;

        for (String card : myCollection) {
            if(!theirCollection.contains(card)) {
                myCandidates++;
            }
        }

        int theirCandidates = 0;

        for (String card : theirCollection) {
            if(!myCollection.contains(card)) {
                theirCandidates++;
            }
        }

        return theirCandidates > 0 && myCandidates > 0;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> result = new HashSet<>(collections.getFirst());

        for(int i = 1; i < collections.size(); i++) {
            Set<String> deleted = new HashSet<>(result);

            for (String card : collections.get(i)) {
                if (result.contains(card)) {
                    deleted.remove(card);
                }
            }

            for (String d: deleted) {
                result.remove(d);
            }
        }

        return result;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> result = new HashSet<>();

        for (Set<String> collection: collections) {
            result.addAll(collection);
        }

        return result;
    }
}
