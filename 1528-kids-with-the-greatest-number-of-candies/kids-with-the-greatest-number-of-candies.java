class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;
        //finf maximum no of candies any kid currently has
        for(int candy : candies){
            if(candy>maxCandies){
                maxCandies = candy;
            }
        }
        //determine if each kid can have greatest number of candies
        for(int candy:candies){
            result.add(candy + extraCandies >= maxCandies);
        }
        return result;
    }
}