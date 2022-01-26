/*Explanation: KADANE's ALGORITHM
								The simple idea of Kadane’s algorithm is to look for all positive contiguous segments of the array (max_ending_here is used for this).
								And keep track of maximum sum contiguous segment among all positive segments (max_so_far is used for this). Each time we get a positive-sum 
								compare it with max_so_far and update max_so_far if it is greater than max_so_far*/



public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {

        int cursum=0;
        int maxsum=A.get(0);
        for(int i=0;i<A.size();i++){
            cursum= cursum+A.get(i);
            if(cursum>maxsum){
                maxsum=cursum;
            }
            if(cursum<0){
                cursum=0;
            }
        }
        return maxsum;
    }
}
