
public class Pattern73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=9;
		int i=0;
		loopI(i,irange,jrange);

	}

	private static void loopI(int i, int irange, int jrange) {
		// TODO Auto-generated method stub
		if(i<irange)
		{
			int cnt=0;
			int j=0;
			loopJ(i,j,irange,jrange,cnt);
			System.out.println();
			i+=2;
			loopI(i,irange,jrange);
		}
	}

	private static void loopJ(int i, int j, int irange, int jrange,int cnt) {
		// TODO Auto-generated method stub
		if(j<jrange)
		{
			if(j-i<=0)
			{
				if(j<=i/2)
				{
					System.out.print((char)(65+j));
				}
				else
				{
					System.out.print((char)(64+i/2-cnt++));
				}
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
