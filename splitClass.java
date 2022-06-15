
public class splitClass {
	
		

	public static void main(String[] args) {
		String str="ranga67y898!";
		StringBuffer num=new StringBuffer(),
				alpha=new StringBuffer(),
				symbols=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
				num.append(str.charAt(i));
			
			//else if
			//alpha.append(str.charAt(i));
			
			
			else 
			symbols.append(str.charAt(i));
		}
		   System.out.println(alpha);
	        System.out.println(num);
	        System.out.println(symbols);
	}
	
	}


