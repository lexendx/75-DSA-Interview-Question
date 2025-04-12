public class MergeString {
  
        public String mergeAlternately(String word1, String word2) {
            StringBuilder res = new StringBuilder();
            int i = 0, len1 = word1.length(), len2 = word2.length();
    
            while (i < len1 || i < len2) {
                if (i < len1) res.append(word1.charAt(i));
                if (i < len2) res.append(word2.charAt(i));
                i++;
            }
    
            return res.toString();
        }
    }
    

