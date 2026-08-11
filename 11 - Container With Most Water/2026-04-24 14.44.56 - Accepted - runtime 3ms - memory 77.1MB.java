class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;

        while (i < j) {
            int h;
            if (height[i] < height[j]) {
                h = height[i];
                i++;  
            } else {
                h = height[j];
                j--;   
            }

            int width = j - i + 1; 
            int area = h * width;

            if (area > maxArea) {
                maxArea = area;
            }
        }

        return maxArea;
    }
}