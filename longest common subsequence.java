class Solution{ 
    public int longestCommonSubsequence(String text1,String text2){ 
 
        return lcs(text1,text2,0,0,text1.length(),text2.length()); 
    } 
    private int lcs(String text1,String text2,int i,int j,int n,int m){ 
        if(i==n || j==m)return 0; 
 
        if(text1.charAt(i)==text2.charAt(j)){ 
            return 1 +lcs(text1,text2,i+1,j+1,n,m); 
        }else{ 
            return Math.max( 
                lcs(text1,text2,i+1,j,n,m), 
                lcs(text1,text2,i,j+1,n,m) 
            ); 
        } 
    } 
 
}
