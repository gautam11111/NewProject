package grooming;

public class Program2 {

	public static void main(String[] args) {
		String arr[]= {"universe","employee","traverse"};
		for(String s:arr)
		{
			String s1=s.toUpperCase();
			String rev="";
			char c[]=s1.toCharArray();
			for(int i=c.length-1;i>=0;i--)
			{
				rev=rev+c[i];
			}
			System.out.print(rev+" ");
		}
	}

}
