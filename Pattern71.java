
public class Pattern71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=9;
		int i=0;
		loopi(i,irange,jrange);
	}

	private static void loopi(int i, int irange, int jrange) {
		// TODO Auto-generated method stub
		if(i<irange)
		{
			int j=0;
			int cnt=0;
			loopj(i,j,irange,jrange,cnt);
			System.out.println();
			i+=2;
			loopi(i, irange, jrange);
		}
		
	}

	private static void loopj(int i, int j, int irange, int jrange,int cnt) 
	{
		// TODO Auto-generated method stub
		if(j<jrange)
		{
			if(j-i<=0)
			{
				if(j<=i/2)
				{
					System.out.print(1+j);
				}
				else
				{
					System.out.print((i/2)-cnt++);
				}
			}
			else
			{
				System.out.print(" ");
			}
			j++;
			loopj(i, j, irange, jrange, cnt);
		}
		
	}

}
