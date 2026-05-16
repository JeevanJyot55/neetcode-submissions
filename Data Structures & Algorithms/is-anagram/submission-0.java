class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        for(char chars: s.toCharArray()){
            count[chars - 'a'] += 1;
        }
        for(char chars: t.toCharArray()){
            count[chars - 'a'] -= 1;
        }
        for(int num: count){
            if(num != 0){
                return false;
            }
        }
        return true;
    }
}
