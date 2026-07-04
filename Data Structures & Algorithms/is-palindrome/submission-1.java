class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while(i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if (i > j) break;
            char c3 = Character.toLowerCase(s.charAt(i));
            char c4 = Character.toLowerCase(s.charAt(j));
            if (!(c3 == c4)) return false;
            i++;
            j--;
        }
        return true;
    }
}
