package nbhgfhj_jh;

public class String_Practice {

	public static void main(String[] args) {
		String str ="This is Java class";
        //sihT si avaJ ssalc 

String[]x= str.split(" ");
//x[0]=This
//x[1]= is
//x[2]=java
//x[3]=class
for(int i=0; i< x.length; i++) {
for(int j=x[i].length()-1; j>=0; j--) {
System.out.print(x[i].charAt(j));

}
System.out.print(" ");

	
}
			
		}
	}

