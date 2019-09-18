import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Problem59 {
    public static void main(String[] args) {
        
    }

    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(pRoot == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> nodList = new ArrayList<>();
        queue.add(pRoot);
        int start = 0;
        int end = 1;
        while(queue != null) {
            TreeNode current = queue.remove();
            nodList.add(current.val);
            ++start;
            if(end % 2 == 0) {
                if(current.)
            } else {

            }

            if(start == end) {
                start = 0;
                end = queue.size();
                
            }
        }
    }
}