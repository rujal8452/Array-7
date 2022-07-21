public class Problem3 {
    // TC : O(nk)
    // SC : O(1)
    // where n = total number of word and k = avg length of word
    public int shortestWordDistance(String[] wordsDict, String word1, String word2) {
        if (wordsDict == null || wordsDict.length == 0) return 0;

        int i1 = -1;
        int i2 = -1;
        int result = wordsDict.length;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                i1 = i;
            }
            if (wordsDict[i].equals(word2)) {
                if (i1 == i) {
                    i1 = i2;
                }
                i2 = i;
            }
            if (i1 != -1 && i2 != -1) {
                result = Math.min(result, Math.abs(i1 - i2));
            }
            if (result == 1) return result;
        }
        return result;
    }
}