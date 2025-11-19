package codepractise;

public class Words 
{
	public static int solution(String s)
	{
		//将s转化为小写
		String n=s.toLowerCase();
		int m=0;
		int j=0;
		for (char a:n.toCharArray())
			switch(a)
			{
				case'k':m++;
				case'u':j++;
			}
		return Math.min(m, j);		
	}
	
	public static void main(String[]args)
	{
		System.out.println(solution("abccgkukddjudkfu")==3);
	}
}
