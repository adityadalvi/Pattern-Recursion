
public class Pattern75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=11;
		int jrange=11;
		int i=2;
		loopI(i,irange,jrange);

	}

	private static void loopI(int i, int irange, int jrange) {
		// TODO Auto-generated method stub
		if(i<irange)
		{
			int j=0;
			loopJ(i,j,irange,jrange);
			System.out.println();
			i+=2;
			loopI(i,irange,jrange);
		}
		
	}

	private static void loopJ(int i, int j, int irange, int jrange) {
		// TODO Auto-generated method stub
		if(j<jrange)
		{
			if(j-i<=0)
			{
				if(j==i/2)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
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
