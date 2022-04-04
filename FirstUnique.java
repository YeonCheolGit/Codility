import java.util.*;

class FirstUnique {
    public int solution(int[] A) {
        Map<Integer, Integer> duplicatedCounts = countDuplicatedElements(A);

        return findFirstUniqueElement(A, duplicatedCounts);
    }

    private Map<Integer, Integer> countDuplicatedElements(int[] A) {
        Map<Integer, Integer> duplicatedCounts = new HashMap<>();

        for (int element : A) {
            Integer foundResult = duplicatedCounts.getOrDefault(element, 0);
            duplicatedCounts.put(element, ++foundResult);
        }

        return duplicatedCounts;
    }

    private int findFirstUniqueElement(int[] A, Map<Integer, Integer> duplicatedCounts) {
        for (int element : A) {
            if (isDuplicateCountOne(duplicatedCounts, element)) return element;
        }

        return -1;
    }

    private boolean isDuplicateCountOne (Map<Integer, Integer> duplicatedCounts, int element) {
        return duplicatedCounts.get(element) == 1;
    }
}
