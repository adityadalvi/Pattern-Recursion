
public class Pattern50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=7;
		int jrange=10;
		int i=0;
		loopI(i,irange,jrange);

	}

	private static void loopI(int i, int irange, int jrange) {
		// TODO Auto-generated method stub
		if(i<irange)
		{
			int j=0;
			loopJ(i,j,irange,jrange);
			System.out.println();
			i++;
			loopI(i,irange,jrange);
		}
		
	}

	private static void loopJ(int i, int j, int irange, int jrange) {
		// TODO Auto-generated method stub
		if(j<jrange)
		{
			System.out.print(j+""+j+""+j);
			j++;
			loopJ(i,j,irange,jrange);
		}
		
	}

}
