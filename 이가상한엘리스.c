//4, 1, 2
//3으로 나눠서 나머지가 0이 될 경우 4
//1이 될 경우 1
//2가 될 경우 2

class Solution {
  public String solution(int num) {
      String answer = "";
      
      while(num != 0){
          if((num % 3) == 0){
              answer = '4' + answer;
              num = (num/3) - 1;
          }else{
              answer = (num % 3) + answer;
              num /= 3;
          }
      }
      return answer;
  }
}
