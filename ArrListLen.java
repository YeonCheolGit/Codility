import java.util.*;

class ArrListLen {
    public int solution(int[] A) {
        return iterateArrayAndFindIterationCount(A);
    }

    private int iterateArrayAndFindIterationCount(int[] A) {
        int currentValue = 0;
        int defaultiterationCount = 0;

        for (int i=1; i<=A.length; i++) {
            currentValue = A[currentValue];
            defaultiterationCount = i;
            if (isLessThenZero(currentValue)) return i;
        }

        return defaultiterationCount;
    }

    private boolean isLessThenZero(int currentValue) {
        return currentValue < 0;
    }
}
