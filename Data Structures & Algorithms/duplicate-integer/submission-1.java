class Solution {
    public boolean hasDuplicate(int[] nums) {
        long distinctCount = Arrays.stream(nums).distinct().count();
        return distinctCount != nums.length;
    }
}