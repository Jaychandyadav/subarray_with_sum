class Subsearch
{
	public void search(int arr[], int n, int search)
	{
		
		for(int i=0;i<n;i++)
		{
			int sum = 0;
			int first = arr[i];
			
			for(int j=i;j<n;j++)           //sum of no. in array and check is equal
			{
				if(arr[j]==search)
				{
					System.out.println("pos" + arr[j]);
					break;
				}
				sum = arr[j] + sum;
				
				if(sum==search)
				{
					int t = i+1;
					int s = j+1;
					System.out.println("pos "+t + " " + s);
					return;
				}
			}
			
		}
		return;
	}
	public static void main(String[] args)
	{
	Subsearch s = new Subsearch();
	int arr[] = {1,2,3,4,5,6,7,8,9,10};
	int n = arr.length;
	int search = 15;
	s.search(arr,n,search);
	}
}