public class sumofarray {
    static int[] runningSum(int[] nums) {
        int[] running_sum = new int[nums.length];
        running_sum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            running_sum[i] = running_sum[i - 1] + nums[i];
        }
        return running_sum;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] sum = runningSum(a);
        for(int i=0;i<sum.length;i++) {
            System.out.println(sum[i]);
        }
    }
}
