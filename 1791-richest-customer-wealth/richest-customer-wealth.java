class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int wealthy = 0;
        for (int i =0; i < m;i++) {
            int sumWealth =0;
            for(int j =0;j<n;j++) {
                sumWealth += accounts[i][j];
            }
            wealthy = Math.max(wealthy , sumWealth);
        }
        return wealthy;
    }
}