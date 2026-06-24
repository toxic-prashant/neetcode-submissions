class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();

        for(String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String str = new String(c);
            if(mp.containsKey(str)) {
                mp.get(str).add(s); 
            } else {
                List<String> l = new ArrayList<>();
                l.add(s);
                mp.put(str, l);
            }
        }
        return new ArrayList<>(mp.values());
    }
}
