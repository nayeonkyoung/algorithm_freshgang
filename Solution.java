package hi;

//이중 for문을 활용해 주식가격이 떨어지지 않는 시간을 count
class Solution {
  public int[] solution(int[] prices) {
      int[] result = new int[prices.length]; //prices의 크기만큼의 result 크기의 배열을 만들어 준다.
      
      for (int i = 0; i < result.length; i++) { //result만큼의 for문을 돈다.
          for (int j = i+1; j < result.length; j++) { //이중 for문
              if (prices[i] > prices[j]) { //price를 돌면서 두 수를 비교하여 앞에가 크다면
                  result[i] = j-i; // j의 숫자를 -1만큼 낮춘다.
                  break;
              }
              if (j==result.length-1) result[i] = j-i; // 아니면 j가 result만큼의 크기라면 result의 i번째가 j의 크기의 -1만큼을 넣어준다.
          }
      }
      return result; //result의 값을 return 해준다.
  }
}