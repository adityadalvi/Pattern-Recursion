/*
*****    
 *****   
  *****  
   ***** 
    *****
   ***** 
  *****  
 *****   
*****    

 */
public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=9;
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
		// TODO Auto-generated method stub
		if(j<jrange)
		{
			if((j-i>=0&&j-i<=4&&i<=4)||(j+i>=8&&j+i<=12&&i>=4))
			{
				System.out.print("*");
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
