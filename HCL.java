
public class HCL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ct=0;
		String s="ranga rajanthisisautromationr ranga rajan";
		boolean boo=s.contains("ranga");
		System.out.println(boo);
		if(s.contains("ranga")) 
		{
		ct++;	
		}
		System.out.println("No of Ranga present is:" + ct);
		
		int count = 0;
		
		char[] ch=s.toCharArray();
		
		int size=ch.length;
		for(int i=0;i<size;i++) {
		
			
		if(ch[i]=='r')
			{ 
			count++;
			}
		}
		System.out.println("No of r present in given string is :"+ count);

	}
}


		
			
		

	
	
