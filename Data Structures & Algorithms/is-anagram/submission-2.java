class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Integer> hm = new HashMap<>();
        Map<Character, Integer> hm2 = new HashMap<>();

        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            hm2.put(c, hm2.getOrDefault(c, 0) + 1);
        }
        return hm.equals(hm2);
    }
}
