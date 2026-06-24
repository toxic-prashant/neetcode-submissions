class Solution {
    public List<Integer> majorityElement(int[] nums) {
        return Arrays.stream(nums).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting()))
        .entrySet()
        .stream()
        .filter(e -> e.getValue() > nums.length / 3)
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());
    }
}