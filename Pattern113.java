
public class Pattern113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=17;
		int jrange=17;
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
			if(j-i>=-4&&j+i<=20&&i>=4)
			{
				System.out.print("*");
			}
			else if((j+i>=3&&j-i<=5&&i<=3)||(j+i>=11&&j-i<=13&&i<=3))
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
