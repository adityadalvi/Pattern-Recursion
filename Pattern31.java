/*
     A 
    A B 
   A B C 
  A B C D 
 A B C D E 
A B C D E F 
 */
public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=6;
		int jrange=6;
		int i=0;
		loopI(i,irange,jrange);

	}

	private static void loopI(int i, int irange, int jrange)
	{
		if(i<irange)
		{
			int cnt=0;
			int j=0;
			loopJ(i,j,irange,jrange,cnt);
			System.out.println();
			i++;
			loopI(i,irange,jrange);
		}
		
	}

	private static void loopJ(int i, int j, int irange, int jrange,int cnt) 
	{
		if(j<jrange)
		{
			if(j+i>=5)
			{
				System.out.print((char)(65+cnt++)+" ");
			}
			else
			{
				System.out.print(" ");
			}
			j++;
			loopJ(i,j,irange,jrange,cnt);
		}
	}
}
