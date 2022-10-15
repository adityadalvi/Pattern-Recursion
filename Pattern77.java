
public class Pattern77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=5;
		int jrange=5;
		int i=0;
		int rcnt=0;
		rcnt=loopi(i,rcnt,irange,jrange);
	}

	private static int loopi(int i, int rcnt, int irange, int jrange) {
		// TODO Auto-generated method stub
		if(i<irange)
		{
			rcnt++;
			int ecnt=rcnt;
			int diff=4;
			int j=0;
			ecnt=loopj(i,j,irange,jrange,rcnt,ecnt,diff);
			System.out.println();
			i++;
			return loopi(i, rcnt, irange, jrange);
		}
		return rcnt;
		
	}

	private static int loopj(int i, int j, int irange, int jrange, int rcnt, int ecnt,int diff) {
		// TODO Auto-generated method stub
		if(j<jrange)
		{
			if(j-i<=0)
			{
				System.out.print(ecnt);
				ecnt=ecnt+diff--;
			}
			j++;
			return loopj(i, j, irange, jrange, rcnt, ecnt,diff);
		}
		return ecnt;
		
	}

}
