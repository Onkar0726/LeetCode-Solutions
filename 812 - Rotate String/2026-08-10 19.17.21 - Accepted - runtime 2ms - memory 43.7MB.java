class Solution {
    public boolean rotateString(String s, String goal) {
          if (s == null || goal == null || s.length() != goal.length()) {
        return false;
    }
    String concatenated = s + s;
    return concatenated.contains(goal);
}
    }
