package grooming;

public class Program3 {

	public static void main(String[] args) {
		String arr[]= {"universe","employee","traverse"};
		String s[]=new String[3];
		for (int i = 0; i < s.length; i++) {
			s[i]=arr[arr.length-1-i];
			System.out.print(s[i]+",");
		}
	}

}
