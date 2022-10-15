/*
F E D C B A 
E D C B A  
D C B A   
C B A    
B A     
A      
A      
B A     
C B A    
D C B A   
E D C B A  
F E D C B A 

 */
public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=12;
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
			if(j+i<=5||j-i<=-6)
			{
				if(i<=5)
				{
				System.out.print((char)(70-i-cnt++)+" ");
				}
				else
				{
					System.out.print((char)(59+i-cnt++)+" ");
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
