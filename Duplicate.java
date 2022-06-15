
public class Duplicate {

	public static void main(String[] args) {
		String str="RangarajanRanga";
		StringBuffer sb=new StringBuffer("Sachin");
            sb.append("Ganguly");
            System.out.println(sb);		

            sb.insert(2, "RAHUL");
            System.out.println(sb);		

            sb.replace(2, 6, "Dhoni");
System.out.println(sb);	
sb.delete(2, 6);
System.out.println(sb);	
sb.reverse();
System.out.println(sb);	


	}

}
