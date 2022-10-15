/*
*****
*****
*****
*****
*****
 */
public class Pattern1 {

	public static void main(String[] args) 
	{
		int irange=5;
		int jrange=5;
		int i=0;
		loopI(i,irange,jrange);
	}

	private static void loopI(int i, int irange, int jrange)
	{
		if(i<irange)
		{
			int j=0;
			loopJ(i,j,irange,jrange);
			System.out.println();
			i++;
			loopI(i,irange,jrange);
		}
		
	}

	private static void loopJ(int i, int j, int irange, int jrange)
	{
		if(j<jrange)
		{
			System.out.print("*");
			j++;
			loopJ(i,j,irange,jrange);
		}
		
	}

	

}
