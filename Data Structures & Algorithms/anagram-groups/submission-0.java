class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            // If key exists, add to list
            if(map.containsKey(sorted)) {
                map.get(sorted).add(s);
            } 
            // else create new list
            else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(sorted, list);
            }
        }

        // Convert map values to required output
        return new ArrayList<>(map.values());
    }
}
