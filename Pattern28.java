/*
A    
AB   
ABC  
ABCD 
ABCDE
ABCD 
ABC  
AB   
A    
 */
public class Pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
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
			if(j-i<=0&&j+i<=8)
			{
				System.out.print((char)(65+j));
			}
			else
			{
				System.out.print(" ");
			}
			j++;
			loopJ(i,j,irange,jrange);
		}
	}
}