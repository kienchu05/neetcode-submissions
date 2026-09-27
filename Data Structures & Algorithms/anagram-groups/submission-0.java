class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> words = new HashMap<>();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars); // "act"
            String key = Arrays.toString(chars);

            words.putIfAbsent(key , new ArrayList<>());
            words.get(key).add(s);
        }
        return new ArrayList<>(words.values());
    }
}
