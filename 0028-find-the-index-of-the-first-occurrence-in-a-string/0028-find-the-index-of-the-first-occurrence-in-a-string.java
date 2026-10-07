class Solution {
    public int strStr(String haystack, String needle) {

        if (needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            String comp = haystack.substring(i, i + needle.length());

            if (comp.equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}