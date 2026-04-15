class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        
        int diffrence = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i], i);

        }for(int i=0; i<nums.length; i++)
        {
            diffrence = target-nums[i];
            if(map.containsKey(diffrence)&& map.get(diffrence) != i){arr[0] = i;
            arr[1] = map.get(diffrence);
            return arr; }
        }return arr;
        
    }
}
