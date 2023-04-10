package grooming;

public class Program4 {

	public static void main(String[] args) {
		String s="AbbcD1233@gmail.com";
		char ch[]=s.toCharArray();int countCap=0;int countSmall=0;
		int countNum=0;int countSpl=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				countCap++;
			}
			else if(ch[i]>='a'&&ch[i]<='z')
			{
				countSmall++;
			}
			else if(ch[i]>='0'&&ch[i]<='9')
			{
				countNum++;
			}
			else
			{
				countSpl++;
			}
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j])
				System.out.println(ch[j]);
			}
			
		}
		System.out.println(countCap+"countCap");
		System.out.println(countSmall+"countSmall");
		System.out.println(countNum+"countNum");
		System.out.println(countSpl+"countSpl");
	}

}
