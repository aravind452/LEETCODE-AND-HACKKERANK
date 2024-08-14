import java.util.*;

public class UniqueOccurences {

  public boolean uniqueOccurrences(int[] arr) {
    HashMap<Integer, Integer> occurrencesMap = new HashMap<>();

    for (int num : arr) {
      occurrencesMap.put(num, occurrencesMap.getOrDefault(num, 0) + 1);
    }

    Set<Integer> occurrencesSet = new HashSet<>(occurrencesMap.values());
    return occurrencesMap.size() == occurrencesSet.size();
  }
}
