package Paper13;

public class PAPER {
	
	public static String longestCommonSubstring(String s1, String s2) 
	{
	    int m = s1.length();
	    int n = s2.length();
	    int[][] table = new int[m+1][n+1];
	    int maxLen = 0, maxEnd = 0;
	    for (int i = 1; i <= m; i++) {
	        for (int j = 1; j <= n; j++) {
	            if (s1.charAt(i-1) == s2.charAt(j-1)) {
	                table[i][j] = table[i-1][j-1] + 1;
	            }
	            if (table[i][j] > maxLen) {
	                maxLen = table[i][j];
	                maxEnd = i;
	            }
	        }
	    }
	    return s1.substring(maxEnd - maxLen, maxEnd);
	}
}
