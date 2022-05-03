// 평균 구하기
class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        double sum = 0;
        double num;
        for (int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
            if (i == arr.length - 1)
            {
                num = sum / (i + 1);
                answer = num;
            }
        }
        return answer;
    }
}