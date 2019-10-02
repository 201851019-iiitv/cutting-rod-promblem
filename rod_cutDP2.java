package hello;

import java.util.Scanner;

public class rod_cutDP2 {
	// top down memoized approach;
	public static int cut_rod(int p[],int n)
	{
		int arr[]=new int[n+1];
		for(int i=0;i<=n;i++)
			arr[i]=Integer.MIN_VALUE;
		return cut_rod_Aux(p,n,arr);
	}
 public static int cut_rod_Aux(int p[],int n,int arr[])
 {
	 int max;
	if(arr[n]>=0)
		return arr[n];
	if(n==0)
		max=0;
	else
	{
		max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
			max=Math.max(max,p[i]+cut_rod_Aux(p,n-i-1,arr));
		arr[n]=max;
	}
	return max;
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
