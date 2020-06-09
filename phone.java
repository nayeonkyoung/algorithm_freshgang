class Solution {
    public boolean solution(String[] address) {
       for(int i=0; i<address.length-1; i++) {
            for(int j=i+1; j<address.length; j++) {
                //startsWith 함수를 사용해서 비교 후 boolean 타입으로 반환시키기
                if(address[i].startsWith(address[j]) || address[j].startsWith(address[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
