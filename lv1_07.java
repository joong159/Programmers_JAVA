// 콜라츠 추측
class Solution {
    public int solution(int num) {
        int answer = 0;
        int i = 0;
        while (num != 1)
        {
            if (num % 2 == 0)
                num = num / 2;
            else if (num % 2 == 1)
                num = num * 3 + 1;
            if (i > 500)
                return answer = -1;
            i++;
            answer = i;
        }
        return answer;
    }
}