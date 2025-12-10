class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=s.length(); 
        int low=0;
        Map<Character, Integer> hm = new HashMap<>();
        int count=0;
        for(int high=0;high<length;high++){
            char c=s.charAt(high);
            if(hm.containsKey(c)){
                while(hm.containsKey(c)){
                   char x= s.charAt(low);
                   hm.remove(x);
                   low++;
                }
            }
            hm.put(c, 1);
            count = Math.max(count, high - low + 1);
        }
        return count;
    }
}
