class Solution {
    public void sortColors(int[] nums) {
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for(int n : nums) {
            if(n == 0) cnt0++;
            else if(n == 1) cnt1++;
            else cnt2++;
        }

        int i = 0;
        while(cnt0-- > 0)nums[i++] = 0;
        while(cnt1-- > 0)nums[i++] = 1;
        while(cnt2-- > 0)nums[i++] = 2;

        System.out.println(Arrays.toString(nums));
    }
}