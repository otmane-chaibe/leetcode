/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(hmap.containsKey(target- nums[i])){
              return new int[] { hmap.get(target- nums[i]), i };
            }
            hmap.put(nums[i], i);
        }
        
       throw new IllegalArgumentException("no solution"); 
    }
}
