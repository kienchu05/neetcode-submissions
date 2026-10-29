class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int maxPile = 0;

        for(int pile :piles){
            maxPile = Math.max(maxPile, pile);
        }

        while (l < maxPile){
            int mid = (l + maxPile) / 2;

            int hours = 0;
            for(int pile : piles){
                hours +=  Math.ceil((double) pile / mid);
            }
            if(hours <= h){
                maxPile = mid;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
}
