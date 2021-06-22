package array;

public class Test2 {
	boolean meth1(int []arr) {
		if(arr[0]!=2 && arr[1]!=2 && arr[0]!=3 && arr[1]!=3)
		return true;
		else
		return false;
	}
	public static void main(String[] args) {
		Test2 t=new Test2();
		int input[]= {1, 2};
		boolean result=t.meth1(input);
			System.out.print(result);
	}
}