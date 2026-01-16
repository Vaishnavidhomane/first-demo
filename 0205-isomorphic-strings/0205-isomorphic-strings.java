class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) 
        return false;

        int[] lastS = new int[256];
        int[] lastT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (lastS[c1] != lastT[c2]) {
                return false;
            }

            lastS[c1] = i + 1;
            lastT[c2] = i + 1;
        }
        return true;
    }
}
