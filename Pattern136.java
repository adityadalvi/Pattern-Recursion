
public class Pattern136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=4;
		int jrange=7;
		int i=0;
		loopi(i,irange,jrange);

	}

	private static void loopi(int i, int irange, int jrange) {
		// TODO Auto-generated method stub
		if(i<irange)
		{
			int j=0;
			loopj(i,j,irange,jrange);
			System.out.println();
			i++;
			loopi(i,irange,jrange);
		}
			
		
	}

	private static void loopj(int i, int j, int irange, int jrange) {
		// TODO Auto-generated method stub
		if(j<jrange)
		{
			if(j==0||j==6||j+i==3||j-i==3)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			j++;
			loopj(i,j,irange,jrange);
		}
		
	}

}
