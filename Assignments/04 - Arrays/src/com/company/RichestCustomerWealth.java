package com.company;

public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int[] w = new int[m];
        int maxw = 0;

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                w[i] += accounts[i][j];
            }

            if(w[i]>=maxw){
                    maxw = w[i];
            }
        }

        return maxw;

    }
}

