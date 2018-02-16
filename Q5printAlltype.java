package acadview_assignment_7;

public class Q5printAlltype {

	public static <T> void print(T arr[]) {
		int i;
		for (i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
		}
		
	

	public static void main(String[] args)throws InterruptedException {
		

		Integer in[] = { 1, 2, 3, 3, 4 };
		print(in);
		System.out.println();
		String st[] = { "hello", "amit" };
		print(st);
		System.out.println();
		Float fl[] = { 1.22f, 2.1f, 3.1f };
		print(fl);
		System.out.println();
}
}