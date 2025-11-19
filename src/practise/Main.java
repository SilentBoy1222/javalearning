package codepractise;

public class Main 
{
	public static int solution(int[]cards)
	{
		int result=0;
		for (int a:cards)
			result^=a;
		return result;
	}
		
	public static void main(String[]args)
	{
		System.out.println(solution (new int[]{1,2,2,3,3,4,4})==1);
	}
	

}
