import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] Array= new Solution(Arrays.sort(nums));
        for(int i=0;i<nums.length;i++){
            Array[i]=Math.powExact(Array[i],2);
        }
    return Array;
    }
}