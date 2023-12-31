class Solution {
    
    public String[] solution(String[] todo_list, boolean[] finished) {
        int count = 0;
        
        for(boolean boo : finished) {
            if(!boo) {
                count++;
            }
        }
        
        String[] arr = new String[count];
        int num = todo_list.length;
        int index = 0;
        
        for(int i=0; i<num; i++) {
            if(!finished[i]) {
                arr[index] = todo_list[i];
                index++;
            }
        }
        
        return arr;
    }
    
}