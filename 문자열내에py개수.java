class Solution {
    boolean solution(String s) {
        boolean answer = true;
    
        int pCount = 0;
        int yCount = 0;
        
        for(int i = 0 ; i < s.length() ; i++){
            if(Character.toUpperCase(s.charAt(i)) == 'P'){
                pCount++; // 대소문자 구문 없이 P 여부 카운트
            }else if(Character.toUpperCase(s.charAt(i)) == 'Y'){
                yCount++; // 대소문자 구문 없이 Y 여부 카운트
            }
        }
        if(pCount != yCount){
            answer = false;
        } // 같지 않다면

        return answer;
    }
}