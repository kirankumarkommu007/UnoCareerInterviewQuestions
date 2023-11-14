import java.util.Scanner;
public class SalesPromotion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println(" enter the number of colonies :");		
        
        int c = input.nextInt();
        System.out.println(" enter the number of buildings : ");		
        int k =(input.nextInt());
        int []building = new int[k];
        int Money1 = input.nextInt();
        int count = 1;
        
        System.out.print(" enter the Heights of buildings : ");		

        for(int i=0, j=1;  i<building.length && j <building.length; j++) {
        	building[i] =input.nextInt();
    

        if(building[j]>building[i]) {
        	building[i]=building[j];
    		count =count+1;
    	}
        }
     System.out.println(" the Money will be "+(count*Money1));
        
	}
}

	/*	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Test Cases");
		int t = sc.nextInt();
		
		for(int i=1;i<=t;i++) {
			System.out.println("Enter Total no of Buildings..");
			int b = sc.nextInt();
			System.out.println("Price of Commision for Each Building..");
			int p = sc.nextInt();
			
			
			
			int[] h = new int[b];
			System.out.println("Enter All .."+b+" buildings Heights....");
			
			for(int k=0;k<b;k++) {
				h[k]= sc.nextInt();
			}
			int res = printResult(h,p);
			System.out.println("Result--->"+res);
			
		}
			
		}

		private static int printResult(int[] h, int p) {
		
			int max = h[0],count=1;
			
			for(int i=1;i<h.length;i++) {
				if(h[i] > max) {
					max=h[i];
					count++;
				}// if
			}// for

			return count * p;
			
		}

	}*/

