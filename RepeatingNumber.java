//Given an array where every element occurs three times, except one element which occurs only once.
 //Find the element that occurs once.

//Input: arr[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3} Output: 2

public class RepeatingNumber {

	public static void main(String[] args) {
		int arr[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3};
		int res =0;
		int resindex =0;
		int []threeTimes =new int[resindex];
		
		for(int i =0;i<arr.length;i++) {
			int Count  =0;
			
			for(int j =0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					Count++;
				}
			}
			 if(Count ==3) {
					continue;
				}
			else  {
				res =arr[i];
			}
			
		}
		System.out.println("the element occured only once :"+res);
		for(int  i =0;i<resindex;i++) {
			System.out.print(threeTimes[i]+" ");
		}
	}

}
