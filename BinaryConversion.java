	/*
		 * 
		 * Given an unsigned integer, swap all 0 bits with 1 bitsand 1 bit to 0. For example, 
		 * if the given number is 23 (10111),
		 * then 1000---8
		 
		 */

public class BinaryConversion {

public static void main(String[] args) {
	
		
		int n =23,r,p=1,bn=0,res =0,p2=1,p3= 1;
		int Sbn =0,s =1,l;
		
		int temp =n;
		while( n != 0) {
			 r = n % 2;
			 l =n%2;
			 n= n / 2;
			 if( l == 0) {l=1;}
			 else if(l==1) l=0;
			 
			 bn = bn +r * p;
			 Sbn =Sbn+l*p2;
			 res = res + l * p3;
			
			
			 p3 =p3*2;
			 p2 = p2 * 10;
			 p =p*10;
			 
			 

		
		}
		
		System.out.println(" The Original Number is"+temp);
		System.out.println(" Binar number--->"+bn);
		System.out.println(" Swapped binary number---->"+Sbn);
		System.out.println(" the Number is ----->"+res);
	}

	
	
	

}
