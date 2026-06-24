class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        int[] freq = new int[26];

        for(char c : s1) freq[c - 'a']++;

        for(char c : s2) freq[c - 'a']--;

        for(int n : freq){
            if(n != 0) return false;
        }
        return true;
    }
}
