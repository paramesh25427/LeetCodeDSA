// 349. Intersection of Two Arrays
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.


// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]

//SOLUTION

//approach 1
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
class Solution1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int num:nums1) set.add(num);
        for(int num:nums2){
            if(set.contains(num)){
                list.add(num);
                set.remove(num);
            }
        }
        int res[] = new int[list.size()];
        int i=0;
        for(int num:list){
            res[i++] = num;
        }
        return res;
        
    }
}

//approach 2
class Solution2 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> list = new HashSet<>();
        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:nums2){
            if(map.containsKey(num)){
                list.add(num);
                map.put(num,map.get(num)-1);
            }
        }
        int res[] = new int[list.size()];
        int i=0;
        for(int num:list){
            res[i++] = num;
        }
        return res;
        
    }
}

