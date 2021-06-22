package array;

public class Test3 {
	/* int meth(int []arr) {
			if(arr.length>=2)
				return arr[0]+arr[1];
			else if(arr.length==1)
				return arr[0];
			else
				return 0;
		}
	
	public boolean firstLast6(int[] nums) {
		if(nums[0]==6 || nums[nums.length-1]==6)
			return true;
		return false;
	}
	
	public boolean sameFirstLast(int[] nums) {
		if(nums.length>=1 && nums[0]==nums[nums.length-1])
			return true;
		return false;
	}
	
	public int[] makePi() {
		int[] arr={3,1,4};
		return  arr; 
	}
	
	public boolean commonEnd(int[] a, int[] b) {
		if(a[0]==b[0] ||a[a.length-1]==b[b.length-1])
			return true;
		return false;
	}
	*/
	
	public int sum3(int[] nums) {
		return nums[0]+nums[1]+nums[2];
	}
	
	public static void main(String[] args) {
		Test3 t=new Test3();
		/*int[] input= {5,5,3};
		int result=t.meth(input);
		System.out.println(result);
		int[] nums= {6,2,7};
		boolean result=t.firstLast6(nums);
		System.out.println(result);
		
		int[] nums= {1,2,3,1};
		boolean result=t.sameFirstLast(nums);
		System.out.println(result); 
		
		int[] input=t.makePi();
		for(int x :input)
			System.out.println(x);
				
		int[] a= {1,2,3};
		int[] b= {7,3,2};
		boolean result=t.commonEnd(a, b);
		System.out.println(result);
		*/
		
		int[] nums= {1,2,3};
		int result=t.sum3(nums);
		System.out.println(result);
	}
}
