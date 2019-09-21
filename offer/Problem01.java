public class Problem01 {
    public static void main(String[] args) {
        
    }

    public boolean Find(int target, int [][] array) {
        int row = array.length;
        int column = array[0].length;
        int i = row -1;
        int j = 0;
        while(i >= 0 && j < column) {
            if(target == array[i][j]) {
                return true;
            } else if(target > array[i][j]) {
                ++j;
                continue;
            } else {
                --i;
                continue;
            }
        }
        return false;
        
    }
}