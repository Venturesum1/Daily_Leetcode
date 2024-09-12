class Solution {

    public int countConsistentStrings(String allowed, String[] words) {
        int consistentCount = 0;

        for (String word : words) {
            boolean isWordConsistent = true;

            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                boolean isCharAllowed = false;

                for (int j = 0; j < allowed.length(); j++) {
                    if (allowed.charAt(j) == currentChar) {
                        isCharAllowed = true;
                        break; 
                    }
                }

                if (!isCharAllowed) {
                    isWordConsistent = false;
                    break; 
                }
            }

            if (isWordConsistent) {
                consistentCount++;
            }
        }

        return consistentCount;
    }
}