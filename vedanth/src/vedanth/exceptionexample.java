/*to handle multiple exceptions at same time */
package vedanth;
public class exceptionexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str =null;
		try {
			str = null;
		} 
		catch (NullPointerException nl) {
			System.out.println(str.length());
		}
		try {
			int a = 10 / 0;

		}

		catch (Exception e) {
			System.out.println("a:" + 1);

		}
	}
}
