/*
    *****
   ***** 
  *****  
 *****   
*****    
 *****   
  *****  
   ***** 
    *****

 */
public class Pattern24 {

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
			loopj(i,j,irange,jrange);
			System.out.println();
			i++;
			loopi(i, irange, jrange);
		}
		
	}

	private static void loopj(int i, int j, int irange, int jrange) {
		// TODO Auto-generated method stub
		if(j<jrange)
		{
			if(((j+i>=4)&&(j+i<=8)&&i<=4)||((j-i>=-4)&&(j-i<=0)&&i>4))
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			j++;
			loopj(i, j, irange, jrange);
		}
		
	}
}
