package leetCodeQuestions;

public class q27 {
        public static int removeElement(int[] nums, int val) {

            int l = nums.length;
            int r=0;
            while(r<l){
                if(nums[r]==val){
                    nums[r]=nums[l-1];
                    l--;
                }
                else{
                    r++;
                }
            }
            return l;
        }

    public static void main(String[] args) {
            int[] n = {1,2,2,1};
            int v = 1;
        System.out.println(removeElement(n,v));
    }
}

