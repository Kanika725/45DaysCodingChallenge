class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        HashMap<String, List<String>> anagramWordMap = new HashMap<>();

        for (int i = 0; i < string_list.length; i++) {
            char arr[] = string_list[i].toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(anagramWordMap.containsKey(sorted)){ 
                List<String> anagrams = anagramWordMap.get(sorted);
                anagrams.add(string_list[i]);
            } else {
                List<String> anagrams = new ArrayList<>();
                anagrams.add(string_list[i]);
                anagramWordMap.put(sorted, anagrams);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(String s: anagramWordMap.keySet()){
            result.add(anagramWordMap.get(s));
        }
        return result;
    }
}
