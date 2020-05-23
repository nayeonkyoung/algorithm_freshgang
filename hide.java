import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1; 
        HashMap<String, Integer> clothesMap = new HashMap<String, Integer>();
        
        for(int i =0; i<clothes.length; i++){
            //해쉬에 옷 종류, 이름 넣기
            clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 0)+1);
        }
        
        Set<String> trySet = clothesMap.trySet();
        
        for(String key : trySet) {
            //경우의 수
        	answer *= clothesMap.get(key)+1; 
        }
        return answer-1; //아무 것도 입지 않는 경우
    }
}