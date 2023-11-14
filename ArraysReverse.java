import java.util.Scanner;
public class ArraysReverse {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print(" enter the size of Array :");
		int k = input.nextInt();
		int []a= new int[k];
		System.out.print(" enter the Elements of Array :");

        for(int i =a.length-1;i>=0;i--){

         a[i]=input.nextInt();

        }
        
       for(int j =0;j<a.length;j++) {
    	   System.out.println(" the Reversed array is :" +a[j]+" ");
       }
        }

}
