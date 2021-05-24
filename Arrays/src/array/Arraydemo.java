package array;

public class Arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=new Integer(20);
		arr[2]=90;
		//for(int i=0;i<arr.length;i++)
		//{
		//	System.out.println(arr[i]);
		//}
		for(int element:arr)
		{
				System.out.println(element);
		}
	}
}


