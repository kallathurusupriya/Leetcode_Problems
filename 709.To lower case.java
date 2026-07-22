class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                result.append((char)(c + ('a' - 'A')));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
