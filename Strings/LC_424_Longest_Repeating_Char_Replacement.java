class Solution {
    public int characterReplacement(String s, int k) {
        int len = s.length();
        int low = 0;
        int[] arr = new int[26];
        int ans = 0;

        for (int high = 0; high < len; high++) {

            int x = s.charAt(high) - 'A';
            arr[x]++;

            int length = high - low + 1;
            int maxfreq = findMax(arr);
            int diff = length - maxfreq;

            if (diff > k) {
                while (diff > k) {
                    int y = s.charAt(low) - 'A';
                    arr[y]--;
                    low++;

                    length = high - low + 1;
                    maxfreq = findMax(arr);
                    diff = length - maxfreq;
                }
            }

            ans = Math.max(ans, high - low + 1);
        }

        return ans;
    }

    private int findMax(int[] arr) {
        int m = 0;
        for (int v : arr) m = Math.max(m, v);
        return m;
    }
}
