class Solution {
    public int majorityElement(int[] nums) {
        return Arrays.stream(nums).boxed().collect(Collectors.groupingBy(x -> x,Collectors.counting()))
        .entrySet()
        .stream()
        .filter(x -> x.getValue() > nums.length/2).findFirst()
        .get()
        .getKey();
    }
}