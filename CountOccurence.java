import java.util.*;
public class CountOccurence {
class Solution {
    public int countOccurence(int[] arr, int k) {
        int n = arr.length;
        int limit = n / k;
        int count = 0;

        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int val : freq.values()) {
            if (val > limit) {
                count++;
            }
        }
        return count;
    }
}

}
