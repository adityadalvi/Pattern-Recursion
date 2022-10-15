
public class Pattern57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		int cnt=0;
		int i=0;
		cnt=loopI(i,irange,jrange,cnt);

	}

	private static int loopI(int i, int irange, int jrange, int cnt) {
		// TODO Auto-generated method stub
		if(i<irange)
		{
			int j=0;
			cnt=loopJ(i,j,irange,jrange,cnt);
			System.out.println();
			i++;
			return loopI(i,irange,jrange,cnt);
		}
		return cnt;
		
	}

	private static int loopJ(int i, int j, int irange, int jrange, int cnt) {
		// TODO Auto-generated method stub
		if(j<jrange)
		{
			if(j-i<=0)
			{
				System.out.print(1+cnt+++" ");
			}
			else
			{
				System.out.print(" ");
			}
			j++;
			return loopJ(i,j,irange,jrange,cnt);
		}
		return cnt;
		
	}

}
