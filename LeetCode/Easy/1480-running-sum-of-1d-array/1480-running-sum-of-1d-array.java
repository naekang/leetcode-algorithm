class Solution {
    public int[] runningSum(int[] nums) {
        int[] answer = new int[nums.length];
        int num = 0;
        
        for (int i = 0; i < nums.length; i++) {
            num += nums[i];
            answer[i] = num;
        }
        
        return answer;
    }
}