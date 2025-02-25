class Solution {
    public static int getMaxArea(int arr[]) {
        // your code here
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        
        for(int i = 0; i <= n; i++) {
            int height = (i == n) ? 0 : arr[i];
            while (!stack.isEmpty() && arr[stack.peek()] > height) {
                int h = arr[stack.pop()];
                int width = stack.isEmpty() ? i : (i - stack.peek() -1);
                maxArea = Math.max(maxArea, h*width);
            }
            stack.push(i);
        }
        return maxArea;
    }

}
