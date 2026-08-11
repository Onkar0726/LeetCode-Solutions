class Solution {
    public String reverseWords(String s) {
         String[] words = s.split(" ");
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
        String var = String.join(" ", words);
        String result = var.trim().replaceAll("\\s+", " ");
        return result;
    }
}