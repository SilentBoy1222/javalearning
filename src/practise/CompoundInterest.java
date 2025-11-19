package codepractise;

public class CompoundInterest
{
	public static void main(String[]args)
	{
		final double STARTRATE=10;
		final int NRATES=6;
		final int NYEARS=10;
		
		//计算得出6个等级的利率表，该利率表从10%，以加1%的幅度递增；
		double[]interestRate=new double[NRATES];
		for (int j=0;j<interestRate.length;j++)
		{
			interestRate[j]=(STARTRATE+j)/100;
		}
		
		//创建一个空二维数组，年数为行，利率等级为列；第一行各利率的初始本金设置为10000元
		double[][]balance=new double[NYEARS][NRATES];
		for (int j=0;j<balance[0].length;j++)
			balance[0][j]=10000;
		
		//以该初始本金为基础，计算每一年在每一种利率等级下的总金额；
		for (int i=1;i<balance.length;i++)
		{
			for (int j=0;j<balance[i].length;j++)
			{
				double oldBalance=balance[i-1][j];
				double interest=oldBalance*interestRate[j];
				balance[i][j]=oldBalance+interest;
			}
		}
		//打印结果,第一行为利率等级；
		for (int j=0;j<interestRate.length;j++)
			System.out.printf("%9.0f%%",100*interestRate[j]);
		System.out.println();
		//逐行打印结果
		for (double []row:balance)
		{
			for(double b:row)
				System.out.printf("%10.2f", b);
			System.out.println();			
		}
	}
}