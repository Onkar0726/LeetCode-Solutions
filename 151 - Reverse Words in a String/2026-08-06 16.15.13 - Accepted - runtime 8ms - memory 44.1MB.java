class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int n=words.length;
        int j=n-1;
        int i=0;
        while(j>i){
        String temp = words[i];
        words[i] = words[j];
        words[j] = temp;
        i++;
        j--;
        }
        String result = String.join(" ", words);
        return result;
    }
}