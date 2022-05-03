//제일 작은 수 제거하기
class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        if (len == 1){
            int[] ans = new int[] {-1};
            return ans;
        }
        else{
            int min=arr[0];
            for (int i=1; i<len; i++){
                if (arr[i]<min)
                    min = arr[i];
            }
            int[] ans = new int[len-1];
            int j=0;
            for (int i:arr){
                if (i != min)
                    ans[j++]=i;
            }
            return ans;
        }
    }
}