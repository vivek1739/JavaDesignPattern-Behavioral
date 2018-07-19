package pack1;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CandidateCode {
	
	static int count=0;
	static String input4=null;
	
	public static void appearanceCount(int input1,int input2,String input3,String input4)
    {
		CandidateCode cd=new CandidateCode();
		CandidateCode.input4=input4;
		cd.permute(input3, 0, input1-1);
		System.out.println(count);
    }
	
	private  void permute(String str, int l, int r)
    {
		int repeat;
        if (l == r)
        {
        	System.out.println(str);
        	if(CandidateCode.input4.contains(str))
        	{
        		repeat=0;
        		repeat=repeat(CandidateCode.input4,str);
        		count=count+repeat;
        	}
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }
 
    private int repeat(String input4, String strsmall) {
		
    	String str=input4;
    	String findStr = strsmall;
    	int lastIndex = 0;
    	int count = 0;

    	while(lastIndex != -1){

    	    lastIndex = str.indexOf(findStr,lastIndex);

    	    if(lastIndex != -1){
    	        count ++;
    	        lastIndex += findStr.length();
    	    }
    	}
    	System.out.println(strsmall+" repeated "+count);
		return count;
	}

	
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
	 public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        int output = 0;
	        int ip1 = Integer.parseInt(in.nextLine().trim());
	        int ip2 = Integer.parseInt(in.nextLine().trim());
	        String ip3 = in.nextLine().trim();
	        String ip4 = in.nextLine().trim();
	      appearanceCount(ip1,ip2,ip3,ip4);
	       
	    }


}
