import java.util.*;

class Solution {
    private static final int LIMIT_ARRAY_LENGTH = 1000000000;

    public int solution(int[] A) {
        if (checkExceedLimit(A.length)) return -1;

        return getArrayLengthAndInversionElements(A);
    }

    private boolean checkExceedLimit(int arrayLength) {
        return arrayLength > LIMIT_ARRAY_LENGTH;
    }

    private int getArrayLengthAndInversionElements(int[] A) {
        final int arrayLength = A.length;

        return iterateArrayAndGetInversionCount(arrayLength, A);
    }

    private int iterateArrayAndGetInversionCount(int arrayLength, int[] array) {
        int inversionCount = 0;

        for (int i=0; i<arrayLength; i++) {
            for (int j=i+1; j<arrayLength; j++) {
                if (isCurrentElementiggerThanNext(array[i], array[j])) inversionCount++;
            }
        }

        return inversionCount;
    }

    private boolean isCurrentElementiggerThanNext(int currentNode, int nextNode) {
        return currentNode > nextNode;   
    }
}
