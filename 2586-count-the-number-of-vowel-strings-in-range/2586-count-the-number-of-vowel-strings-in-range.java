class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        String vowels = "aeiou";
        
        for (int i = left; i <= right; i++) {
            String w = words[i];
            char start = w.charAt(0);
            char end = w.charAt(w.length() - 1);
            
            if (vowels.indexOf(start) != -1 && vowels.indexOf(end) != -1) {
                count++;
            }
        }
        
        return count;
    }
}