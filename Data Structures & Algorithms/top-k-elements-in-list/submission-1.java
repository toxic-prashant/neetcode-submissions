class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        return Arrays.stream(nums).boxed().collect(Collectors.groupingBy(n -> n, Collectors.counting()))
        .entrySet().stream()
        .sorted((a, b) -> Long.compare(b.getValue(), a.getValue())) // descending frequency
                .limit(k)
        .mapToInt(Map.Entry::getKey)
        .toArray();
    }
}
