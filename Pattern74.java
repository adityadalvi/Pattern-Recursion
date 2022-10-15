
public class Pattern74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=9;
		int i=0;
		loopI(i,irange,jrange);

	}

	private static void loopI(int i, int irange, int jrange) {
		// TODO Auto-generated method stub
		if(i<irange)
		{
			int cnt=0;
			int cnt1=0;
			int j=0;
			loopJ(i,j,irange,jrange,cnt,cnt1);
			System.out.println();
			i++;
			loopI(i,irange,jrange);
		}
		
	}

	private static void loopJ(int i, int j, int irange, int jrange, int cnt, int cnt1) {
		// TODO Auto-generated method stub
		if(j<jrange)
		{
			if(j+i>=4&&j-i<=4)
			{
				if(j<=4)
				{
					System.out.print((char)(65+cnt++));
				}
				else
				{
					System.out.print((char)(64+i-cnt1++));
				}
			}
			else
			{
				System.out.print(" ");
			}
			j++;
			loopJ(i,j,irange,jrange,cnt,cnt1);
		}
		
	}
}
