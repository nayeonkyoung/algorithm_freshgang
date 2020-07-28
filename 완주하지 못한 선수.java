import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String,Integer> map = new HashMap<>();
        
        for(String s : participant){
            map.put(s, map.getOrDefault(s, 0) + 1); // key 값이 없는 경우 key값과 함께 1, 있는 경우 기존값에 + 1 연산
        }
        
        for(String s : completion){
            map.put(s, map.get(s) - 1); // map key가 같을 경우 value - 1 연산
        }
        
        for(String key : map.keySet()){
            if(map.get(key)!=0) return key; // map value가 1이면 완주를 못했다는 뜻
        }
        
        return null;
    }
}
