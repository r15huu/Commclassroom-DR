class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int  n = candies.length;
        List<Boolean> result = new ArrayList<>();
        
        //definingTheGreatestNumber
        int max = -1;
        for(int i= 0; i<n; i++){
            max = Math.max(candies[i], max);
        }
        
        //creatingTheArray
        for(int j= 0; j<n; j++){
            result.add(candies[j] + extraCandies >= max);
        }
        
        return result;
    }
}
