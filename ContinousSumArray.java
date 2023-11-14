/*{10,20,-3,5,0,1,-11,55,-77}---
// 10+20+5+1+55-91
 -3-11-77--91
 0  
 77
 */
public class ContinousSumArray {

	public static void main(String[] args) {

		int a[] = {-10,2, -5,11, 89, -23};
		int res[]= new int [a.length];
		int posibilsesums[] =new int [50];
		int max = a[0];
		int min =a[0];
		int rindex = 0;
		int pindex = 0;
		int lastlimit =0;
		int firstlimit =0;
		
		for (int i = 0; i < a.length; i++) {
			int count = 0;

			for (int j = i; j < a.length; j++) {
					count = count + a[j];            //100, 100+2, 100+2+3.......-10;
					posibilsesums[pindex] =count;    //2, 2+3, 2.......-10;
					pindex++;                        //3,3+(-5), 3.....-10;
					if (count > max) {
						lastlimit =j;
						firstlimit =i;
						max = count;					
					}//if
					
                    if (count < min) {						
                    	min = count;						
					}//if
			}//for
		}//for
		
		System.out.println(" the Maximum sum is : "+max);
		System.out.println(" the Minimum sum is : "+min);
		System.out.println(" the first limit is : "+firstlimit);
		System.out.println(" the last limit is : "+lastlimit);
 
		for(int i =firstlimit;i<=lastlimit;i++){
			res[rindex]=a[i];
			rindex++;
		}
		System.out.print(" the sub array is : ");
		for(int i =0;i<rindex;i++){
			System.out.print(res[i]+" ");
		}
		System.out.println("\n");
		for(int i =0;i<pindex;i++){
			System.out.print(posibilsesums[i]+" ");
		}
	}

	

}
