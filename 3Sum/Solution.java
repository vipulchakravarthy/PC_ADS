import java.util.Arrays;
import java.util.*;

public class Solution{
	public static void main(String[] args) {
			int[] nums = {-1, -3, -4, 0, 1, 3 , 4};
	 		Arrays.sort(nums);
	        List<List<Integer>> list = new ArrayList<List<Integer>>();
	        int sum = 0;
	        for(int i = 0; i < nums.length;i++){
	           int l = i + 1;
	            int h = nums.length-1;
	            while(l < h){
	                sum = nums[l] + nums[h];
	                if(sum == -nums[i] && l != i && h != i){
	                    List<Integer> li = new ArrayList<>();
	                    li.add(nums[i]);
	                    li.add(nums[l]);
	                    li.add(nums[h]);
	                    if(!list.contains(li)){
	                        list.add(li);
	                    }
	                    l++;
	                    h--;
	                }
	                else if(sum > -nums[i]){
	                    h--;
	                }else{
	                    l++;
	                }
	            }
	        }
	        System.out.println(list);
		}
}
