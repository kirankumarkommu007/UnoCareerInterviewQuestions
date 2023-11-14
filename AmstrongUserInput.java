import java.util.Scanner;
public class AmstrongUserInput {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int temp =n;
		String k= Integer.toString(n);
		int i =k.length();
		int sum =0;
		while(n>0) {
			int ld =n%10;
			n =n/10;
			sum =(int) (sum+Math.pow(ld, i));
		
		}
		if(sum==temp) {
			System.out.println(" the Number is Asmstrong");
		}
		else System.out.println(" the Number is not Armstrong");

	}

}
