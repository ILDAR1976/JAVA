package iha;

import java.math.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class First {
	
	public static int ROR3(int Inp)
	{
		return(((Inp & 1) == 0)?(((Inp >> 1 ) ^ 2) & 3):((Inp >> 1) & 3));
	}
	
	public static int ROL3(int Inp)
	{
		return(((Inp & 2) == 0)?(((Inp << 1 ) ^ 1) & 3):((Inp << 1) & 3));
	}
	
	public static void GetCoordinate()
	{
		int a;
		int k = 0;
		float c = 0;
		float b[] = new float[3];
		
		for (int i = 0; i < 6; i++) {
			a = ((k < 12)?1:2);
			for (int j = 0; j < 4; j++) {
				c = (float)Math.pow(-1,i);
				b[0] = ((i==2)||(i==5)?c:0);
				b[1] = ((i==1)||(i==4)?c:0);
				b[2] = ((i==0)||(i==3)?c:0);
				a = ((k < 12)?ROR3(a):ROL3(a));
				System.out.println( 
						            ((b[0]!=0)?b[0]:((a & 2) == 2)?1:0) + "\t" +
  					                ((b[1]!=0)?b[1]:(b[0]!=0)?(((a & 2) == 2)?1:0):(((a & 1) == 1)?1:0)) + "\t" + 
						            ((b[2]!=0)?b[2]:(((a & 1) == 1)?1:0))
						          ); 
				k++;
			}
			System.out.println(b[0] + "\t" + b[1] + "\t" + b[2]);
			System.out.println("");
		}
	}

	public static void Coding(int[] Inp)
	{
		//System.out.println((Inp[0]<0)?Inp[]*Inp[]*4:);
	}
	
	public static void main(String[] args) {
		//GetCoordinate();
		/*
		float[] f = new float[3];
		float A;
		Map foo = new HashMap< String, float[]>();
		f[0] = 1f;
		foo.put("-100", f);
		foo.put("-300", f);
		foo.put("0-10", f);
		//f[0] = 3f;
		foo.put("0-10", f);
		A = ((float[])foo.get("0-10"))[0];
		System.out.println(A);
		*/
		
		int A = 2;
		int B = 0;
		
		B = A ^ 1 ;
		
		System.out.println(B);
	}
}
