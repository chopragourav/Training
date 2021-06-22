package array;

public class Test {
	
	static boolean flag=false;
	boolean display() {
		int arr[]= {10,20,3,5000,9};
		for(int i=3;i>=0;i--) {
			if(arr[i]==9)
				return true;
		}
		return flag;
	}
	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t.display());
	}

}
