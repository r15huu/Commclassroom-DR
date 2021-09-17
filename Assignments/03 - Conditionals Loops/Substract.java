package com.company;

public class Substract {

    class Solution {
        public int subtractProductAndSum(int n) {
            Scanner input = new Scanner(System.in);
            int x = input.nextInt();

            int y = 1;
            int z = 0;
            int k = 0;

            while(k == 0){
                if(n>9){
                    y = n%10;
                    n = n/10;
                    y *= y * 1;
                    z += y + 0;

                } else if (n<=9){
                    n = y;
                    y *= y * 1;
                    z += y + 0;
                    k = 1;
                }

            }

            int res = y - z;
            return res;
        }
    }
}
