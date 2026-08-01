class Solution {
    public int dominantIndex(int[] nums) {
        int largest=Integer.MIN_VALUE; 
        int sec_large=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                sec_large=largest;
                largest=nums[i];
                index=i;
            }
            else if(nums[i]<largest && nums[i]>sec_large){
                sec_large=nums[i];
            }
        }
        if((sec_large*2)<=largest){
            return index;
        }
        return -1;
    }
}