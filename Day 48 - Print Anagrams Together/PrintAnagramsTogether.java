class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        Map<String, List<String>> groupedWords = new HashMap();
        
        for (String word : arr) {
            char letters[] = word.toCharArray();
            Arrays.sort(letters);
            String sortedLetters = String.valueOf(letters);
            
            groupedWords.putIfAbsent(sortedLetters, new ArrayList());
            groupedWords.get(sortedLetters).add(word);
        }
        
        return new ArrayList(groupedWords.values());
    }
}
