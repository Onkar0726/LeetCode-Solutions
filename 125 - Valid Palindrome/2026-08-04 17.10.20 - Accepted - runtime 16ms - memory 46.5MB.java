class Solution {
    public boolean isPalindrome(String s) {
         s = s.toLowerCase();
         s=s.trim();
         s=s.replaceAll("[^a-zA-Z0-9]", "");
         int n=s.length();
         int j=n-1;
         if (s.isEmpty()) {
            return true;
            }
        for(int i=0;i<n;i++){
            if (s.charAt(i) == s.charAt(j)){
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}