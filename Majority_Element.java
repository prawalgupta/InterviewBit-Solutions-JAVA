/*Explanation: The Boyer-Moore voting algorithm is one of the popular optimal algorithms which is used to find the majority element
              among the given elements that have more than N/ 2 occurrences. This works perfectly fine for finding the majority element which 
              takes 2 traversals over the given elements, which works in O(N) time complexity and O(1) space complexity.*/



public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {
    int maj = A.get(0);
int mc = 1;
for(int i=1;i<A.size();i++){
if(A.get(i)==maj)
mc++;
else
mc--;
if(mc==0) {
maj = A.get(i);
mc=1;
}
}
return maj;
    }
}
