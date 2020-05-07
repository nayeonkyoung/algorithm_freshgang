import java.util.Stack;
class Solution {
    public int[] solution(int[] heights) {
        Stack<Integer>stk = new Stack<>();
        int[] answer = new int[heights.length];
        for(int i = 0 ; i < heights.length ; i++) {
        	stk.push(heights[i]);
        	
        }
        while(!stk.isEmpty()) {
        	int tmp = stk.pop();
        	
        	for(int j = stk.size() ; j >= 0 ; j--) {
        		if(tmp < heights[j]) {
        			answer[stk.size()] = j + 1;
        			break;
        		}
        	}
        }
        return answer;
    }
}