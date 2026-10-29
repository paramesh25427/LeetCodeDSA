// 771. Jewels and Stones
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

// Letters are case sensitive, so "a" is considered a different type of stone from "A".

 

// Example 1:

// Input: jewels = "aA", stones = "aAAbbbb"
// Output: 3

//SOLUTION

//approach 1
import java.util.HashMap;
import java.util.Map;
class Solution1 {
    public int numJewelsInStones(String jewels, String stones) {
        int total=0;
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:stones.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:jewels.toCharArray()){
            if(map.containsKey(ch)){
                total+=map.get(ch);
            }
        }
        return total;
    }
}

//aproach 2
class Solution2c{
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                count++;
            }
        }

        return count;
    }
}