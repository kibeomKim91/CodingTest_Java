class Solution {
    public int[] solution(int start, int end) {
        int[] arr = new int[end-start+1];
        
        for (int i=0; i<end-start+1; i++) {
            arr[i] = start+i;
        }
        
        return arr;
    }
}