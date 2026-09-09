class Solution {
    public int countCommas(int n) {
        int count=0;

        int temp=n;

        while(n>0){
            count++;
            n/=10;
        }

        if(count<4)return 0;

        return (temp-1000)+1;

    }
}