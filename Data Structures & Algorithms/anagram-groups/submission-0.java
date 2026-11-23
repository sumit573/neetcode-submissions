class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String label = new String(chars);
            if(!map.containsKey(label)){
                map.put(label, new ArrayList<>());
            }
            map.get(label).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
