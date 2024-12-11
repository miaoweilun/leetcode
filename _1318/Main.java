package _1318;

public class Main {

    public int minFlips(int a, int b, int c) {
        int a_b = a | b;
        int cha = a_b ^ c;      // 不同的位置取1
        int diff_c = cha & c;
        int diff_a = cha & a;
        int diff_b = cha & b;

        // 遍历不同的位置，
        //      如果c在该位置上的数为1（说明ab在这个位置上都为0，需要改一个，计数+1）；
        //      如果c在该位置上的数为0（说明ab在这个位置上至少一个为1，有几个1，计数加几个）；
        int num = 1, ans=0;
        for(int i=0; i<32; i++){
            if((cha & num) != 0){
                int number = num & c;
                if(number != 0){
                    ans++;
                }else{
                    if((num & a) != 0)
                        ans++;
                    if((num & b) != 0)
                        ans++;
                }
            }
            num <<= 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Main().minFlips(2, 6, 5));
    }
}
