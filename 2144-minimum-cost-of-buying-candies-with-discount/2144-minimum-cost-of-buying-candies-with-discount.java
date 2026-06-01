class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0 ;
        int l = 0;
       for(int i = cost.length-1 ; i >= 0 ; i--){
        if(l==2){
            l = 0;
        }
        else{
            sum=sum+cost[i];
            l++;
        }
       }
        return sum; 

    }
}