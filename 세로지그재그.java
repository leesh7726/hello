package newProject;

import java.util.Scanner;

public class zigzagArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] arr = new int[a][b];
		int count = 1;
		
		for(int j = 0; j < b; j++)
		{
			for(int i=0; i< a; i++, count++)
			{
				if(j%2==1)
				{
					arr[i][j] = count;
				}
				else
				{
					arr[a-1-i][j] = count;
				}
			}
		}
		
		for(int i = 0; i < a; i++)
		{
			for(int j = 0; j < b; j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
