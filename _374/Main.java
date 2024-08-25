package _374;

class GuessGame{
    int guess(int num){
        return 0;
    }
}

class Solution extends GuessGame {
    public int guessNumber(int n) {
        int mid=1, left=1, right=n;
        while(left <= right){
            mid = left + (right - left) / 2; // 防止计算时溢出
            int ans = guess(mid);
            if(ans==0)
                return mid;
            if(ans==-1)
                right=mid-1;
            else
                left=mid+1;
        }
        return mid;

    }
}

public class Main {
}
