
public class dupli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		String s="Rangrjneisoou";
		
		char[] chr=s.toCharArray();
		int len=chr.length;

		
		for(int i=0;i<len;i++) 
		
			if(chr[i]=='a'||chr[i]=='e'||chr[i]=='i'||chr[i]=='o'||chr[i]=='u') 
			{
				System.out.println(chr[i]);
			}
			
		
			//

			System.out.println("list of chars are "+ count);

		

	}

}
