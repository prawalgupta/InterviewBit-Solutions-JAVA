Explaination:we can take all possibilities by taking two pointers
              from right and left
                  example if n=9 b=4

                  L R
                  4 0
                  3 1
                  2 2
                  1 3
                  0 4




public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int cursum=0;
        for(int i=0;i<B;i++){
            cursum+=A.get(i);
        }
        int max=cursum;
        //inc->include exc->exclude
        int inc=A.size()-1,exc=B-1;
        while(inc>=0&&exc>=0){
            cursum+=A.get(inc);
            cursum-=A.get(exc);
            max=Math.max(max,cursum);
            inc--;
            exc--;
        }
        return max;
    }
}
