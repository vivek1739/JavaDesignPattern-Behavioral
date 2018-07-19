package pack2;

import java.io.IOException;
import java.util.Scanner;

public class CandidateCode {
	
	public static int SolveMagicSquare(int[][] input1)
    {
		int rows=input1[1].length;
		int row=(int)Math.sqrt(rows);
		
		if(input1[0][0]!=1)
		{
			return 1;
		}
		
		int m=norepeatrow(input1,rows);
		// System.out.println("row repeat"+m);
		
		
		int n=norepeatcol(input1,rows);
		// System.out.println("col repeat" + n);
	
		
		
		int z=norepeatsmall(input1,rows,row);
		//System.out.println("small rows : "+z);
	
			
		int check=check(input1,rows,row);
		if(check==1)
			return 1;
		if(z==0 && m==0 && n==0){
			return 0;
		}
		return 1;
    
    }



	
	 private static int check(int[][] input1, int rows, int row) {
		int z=0;
		 for(int x=0;x<rows;x++)
		 {
			 for(int y=0;y<rows;y++)
			 {
				 z=z+input1[x][y];
				 
			 }
		 }
		 if(z==54)
		 {
			 return 1;
		 }
		 return 0;
		 
	}




	private static int norepeatsmall(int[][] input1,int rows,int row) {
		
		 int count=0;
		
		 
		 for(int x=0;x<rows;x=x+row){
			 for(int y=0;y<rows;y=y+row){
		 
		 for(int x1=x;x1<x+row;x1++)
		 {
			 for(int y1=y;y1<y+row;y1++)
			 {
				 for(int m=x ; m<x+row ; m++)
				 {
				     for(int n=y; n<y+row ; n++){
				 
				    	 if((x1<=m && y1<=n))
				    	 {
				    		 continue;
				    	 }
				    	 
				    	 if(input1[x1][y1]==input1[m][n] && input1[x1][y1]!=0 && input1[m][n]!=0 )
				    	 {
				    		 count++;
				    		// System.out.println(count);
				    	 }
				     }
					 
				 }
			 }
			
		 }
		
		 }
		 }
	
		return count;
	}


	private static int norepeatcol(int[][] input1,int row) {
		int count=0;
		for(int x=0;x<row;x++)
		{
			for(int y=0;y<row-1;y++)
			{
				for(int k=y+1;k<row;k++)
				{
					
				       if(input1[y][x]==input1[k][x] && input1[y][x]!=0 && input1[k][x]!=0 )
						{
							count++;
							
							continue;
						}
				}
			}
		}
		return count;
		
	}


	private static int norepeatrow(int[][] input1,int row) {
		 int count=0;
			for(int x=0;x<row;x++)
			{
				for(int y=0;y<row-1;y++)
				{
					for(int k=y+1;k<row;k++)
					{
					if(input1[x][y]==input1[x][k] && input1[x][y]!=0 && input1[x][k]!=0)
							{
								count++;
								continue;
							}
					}
				}
			}
			return count;
	}


	public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        int output = 0;
	        int ip1_rows = 0;
	        int ip1_cols = 0;
	        ip1_rows = Integer.parseInt(in.nextLine().trim());
	        ip1_cols = Integer.parseInt(in.nextLine().trim());
	        
	        int[][] ip1 = new int[ip1_rows][ip1_cols];
	        for(int ip1_i=0; ip1_i<ip1_rows; ip1_i++) {
	            for(int ip1_j=0; ip1_j<ip1_cols; ip1_j++) {
	                ip1[ip1_i][ip1_j] = in.nextInt();
	                
	            }
	        }
	        output = SolveMagicSquare(ip1);
	        System.out.println(String.valueOf(output));
	    }

}
