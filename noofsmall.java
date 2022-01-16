import java.util.Arrays;


public class noofsmall {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)) );  
        
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr  = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 1; j < nums.length; j++) {
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        int [] arr = new int[nums.length];
       for (int i = 0; i < arr.length; i++) {
           int temp = index[i];
           arr[temp] = nums[temp];
       }
        return arr;
        
        
    }
}
