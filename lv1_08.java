// 최대공약수와 최소공배수
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int big = Math.max(n, m);
        int small = Math.min(n, m);
        
        answer[0] = gcp(big, small);
        answer[1] = big * small / answer[0];
        
        return answer;
    }
    
    static int gcp(int a, int b)
    {
        if (a % b == 0)
            return b;
        return gcp(b, a%b);
    }
}