import java.util.*;

class TreeHeight {    
    public int solution(Tree T) {

        return traverseTreeAndFindMaxHeight(T) - 1;
    }

    private int traverseTreeAndFindMaxHeight(Tree T) {

        if (isTreeNull(T)) return 0;
        
        int leftHeight = 1 + traverseTreeAndFindMaxHeight(T.l);
        int rightHeight = 1 + traverseTreeAndFindMaxHeight(T.r);

        return findMaxHeight(leftHeight, rightHeight);
    }

    private boolean isTreeNull(Tree T) {
        return T == null;
    }

    private int findMaxHeight(int leftHeight, int rightHeight) {
        return Math.max(rightHeight, leftHeight);
    }
}
