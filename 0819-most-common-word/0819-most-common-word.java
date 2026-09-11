import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
       
        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word);
        }

        
        paragraph = paragraph.toLowerCase()
                             .replaceAll("[^a-z]", " ");

        Map<String, Integer> count = new HashMap<>();
        for (String word : paragraph.split("\\s+")) {
            if (word.length() == 0 || bannedSet.contains(word)) {
                continue;
            }
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        String result = "";
        int maxFreq = 0;
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }
}
