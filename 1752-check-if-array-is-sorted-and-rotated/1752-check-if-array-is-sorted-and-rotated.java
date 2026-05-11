class Solution {
    public boolean check(int[] arr) {
        int c = 0;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]>arr[(i+1)%arr.length]){
            c++;
        }
    }
    return c<=1;
    }
}