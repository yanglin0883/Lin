public class Solution{

	public long TrailingZero(long x){
		if(x == 0)
			return 0;
		long temp = x / 5;
		retrun temp + TrailingZero(temp);
	}
}