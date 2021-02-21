package TestPractice;

import java.util.Random;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r =  new Random();
		//Size from 10 to 20 elements
		int sz = r.nextInt(11) + 10;
		int [] arr = new int[sz];
		for(int i = 0; i < sz; i++) {
			//Fill with numbers from -9999 to 9999
			arr[i] = r.nextInt(10000) * ((r.nextInt() % 2 == 1) ? -1 : 1);
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nMin for arr: " + min(arr));
		
	}
	//Helper function
	public static int min(int[] x) {
		return min(x, 1, x[0]);
	}
	public static int min(int[] x, int pos, int ans) {
		if(pos >= x.length) {
			return ans;
		}
		//We increase the position and calculate min for the current element and the minimal element 
		return min(x, pos + 1, Math.min(x[pos], ans));
	}

}
