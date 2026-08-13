class Solution {
    public boolean isPalindrome(String s) {
        String ns = s.replaceAll("[^\\p{Alnum}]","");
        String ls = ns.toLowerCase();
        String rev ="";

        for(int i=ls.length()-1;i>=0;i--){
            rev += ls.charAt(i);
        }
        return ls.equals(rev);
    }
}