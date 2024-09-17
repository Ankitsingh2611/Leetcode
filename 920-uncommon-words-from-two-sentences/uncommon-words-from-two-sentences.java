class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        // Split the sentences into words
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");

        // Create a map to store the frequency of each word
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words1) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        for (String word : words2) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        // Create a list to store the uncommon words
        List<String> uncommon = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                uncommon.add(entry.getKey());
            }
        }

        // Return the list of uncommon words
        return uncommon.toArray(new String[0]);
    }
}