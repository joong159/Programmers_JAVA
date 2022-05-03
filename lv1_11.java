//정수 제곱근 판별
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        for (long i = 1; i <= n; i++)
        {
            if (i * i == n)
            {
                long ans = (i + 1) * (i + 1);
            return answer = ans;
            }
        }
        return answer = -1;
    }
}