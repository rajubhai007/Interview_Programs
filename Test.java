
public class Test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//int a[]={1,0,1,1,0,1,1};
		int a[]=new int[5];//declaration and instantiation  
		a[0]=1;//initialization
		a[1]=0;
		a[2]=0;
		a[3]=01;
		a[4]=1;

		//printing array
		for(int i=0;i<a.length;i++)//length is the property of array
		if (a[i]==0)
		System.out.println(a[i]);
		for(int j=0;j<a.length;j++)
		if(a[j]==1)
		System.out.println(a[j]);
		
		
		
	}

}
