package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("n?: ");
		int n = in.nextInt();
		int[] arr = new int[n+1];
		for(int d=2;d<n+1;d++) {
			for(int index = 0;index<n+1;index++) {
				if((index % d) ==0 && index!=d) {
					arr[index] = 1;
				}
			}
		}
		arr[1]=1;
		for(int i = 0;i<n+1;i++) {
			if(arr[i] == 0) {
				System.out.println(i);
			}
		}

	}

}
