package hello;

import java.util.Scanner;

public class rod_cutDP3 {
	
	public static int cut_rod(int p[],int n)
	{
		int arr[]=new int[n+1];
		arr[0]=0;
		for(int i=1;i<=n;i++)
		{	
			arr[i]=Integer.MIN_VALUE;
	       int max=Integer.MIN_VALUE;
	       for(int j=1;j<i;j++)
		   max=Math.max(max,p[j]+arr[i-j-1]);
	       arr[i]=max;
	}
		return arr[n];
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int arr[]=new int[8];
        for(int i=0;i<8;i++)
        {
        arr[i]=sc.nextInt();	
        }
        int n=sc.nextInt();
       int p=cut_rod(arr,n);
		System.out.println(p);
	}


	}


