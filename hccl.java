
public class hccl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msd="mahi078RAN";
		char[]csk=msd.toCharArray();
		StringBuffer sbb=new StringBuffer();
		//for(char k=0;k<=csk.length-1;k++)
		for(char c: csk)
		{
			//if(Character.isDigit(c)) {
			if(Character.isUpperCase(c)) {
				sbb.append(c);
			}
		}
		System.out.println(sbb);


	}

}
