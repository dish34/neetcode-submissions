class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     Map<String, List<String>> groupMap = new HashMap<>();
     List<String> list;
     for (String str: strs) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String s = new String(ch);

        if (groupMap.containsKey(s)) {
            list = groupMap.get(s); 
            list.add(str);
            groupMap.put(s, list);
        }
        else {
            list = new ArrayList<>();
            list.add(str);
            groupMap.put(s, list);
        }
     }
     return new ArrayList<>(groupMap.values());

    }
}
