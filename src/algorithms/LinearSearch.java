package algorithms;

public class LinearSearch {
public static void main(String[] args) {
	int nums[]= {1,4,3,6,2,9,5,6};
	int target=6;
	int result=LinearSearch(nums,target);
	System.out.println("Element found At Index: "+result);
}
static int LinearSearch(int[] nums, int target) {
	for(int i=0;i<nums.length;i++)
	{
		if(nums[i]==target)
			return i;
	}
	return -1;
}
}
