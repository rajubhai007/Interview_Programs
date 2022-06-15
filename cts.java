
public class cts {

	public static void main(String[] args) {
		String ipl="chennai Super Kings";
		StringBuffer sb=new StringBuffer("tester");
		System.out.println(sb.reverse());
		String g=ipl.toUpperCase();
		char[] ch=ipl.toCharArray();
		int count = 0;
		
		int len=ipl.length()-1;
		for(int i=0;i<len;i++) {
					if(ch[i]=='n'||ch[i]=='i') {
					count++;
					}
		}
			System.out.println(count);
			System.out.println(g);
		
	}

}
