class Solution {
    public int maximumLengthSubstring(String s) {
         Map<Character, Integer> freqMap = new HashMap<>();
        char[] chars = s.toCharArray();
       int j = 0;
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (freqMap.containsKey(chars[i])) {
                freqMap.put(chars[i], freqMap.get(chars[i]) + 1);
            } else {
                freqMap.put(chars[i], 1);
            }
            while (freqMap.get(chars[i]) > 2) {
                freqMap.put(chars[j], freqMap.get(chars[j]) - 1);
                j++;
            }
             count = Math.max(count, i - j + 1);
        }
        return count;
    }
}