import java.io.*;
import java.util.*;

class intPrime
{
	
	public static void main(String[] args) throws IOException
	{
		ArrayList<Integer> prime = new ArrayList<Integer>();
		prime.add(2);
		int range = Integer.MAX_VALUE >>1;
		for(int i=3;i<= range;i+=2)
		{
			if(isPrime(i,prime))
			{
				prime.add(i);
			}
		}
		PrintWriter out= new PrintWriter(new BufferedWriter(new FileWriter("prime.txt")));
		int count =0;
		for(Integer i : prime)
		{
			out.print(i+", ");
			count /= 100;
			if(count ==0) out.flush();
		}
		out.flush();
		out.close();
	}
	
	static boolean isPrime(int num, ArrayList<Integer> prime)
	{
		for(Integer i: prime)
		{
			if(num % i ==0) return false;
		}
		return true;
	}
}