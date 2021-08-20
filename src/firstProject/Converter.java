package firstProject;

public class Converter {
	
	static String arr(String a,String b,String c,int n) {
		String s = "";
		if(n>0&&n<4) {
			for(int x =0;x<n;x++) {
			s = s + a;}
			return s;
		}
		if(n==4) {
			s = a + b;
			return s;
		}
		if(n==5) {
			return b;
		}
		if(n>5&&n<9) {
			s = s + b;
			for(int x =5;x<n;x++) {
				s = s + a;
			}
			return s;
		}
		if(n==9) {
			s = a + c;
			return s;
		}
		else {return s;}
	}
	
	static String converter(int x) {
		String[] ch = {"I","V","X","L","C","D","M","v","x","l","c","d","m"};
		String s = "";
		int a[] = new int[5];
		int i = 0;
		while(x>0) {
			a[i] = x%10;
			i++;
			x = x/10;
		}
		int k;
		for(int j =i -1;j>=0;j--) {
				k = 2*j;			
				s = s + Converter.arr(ch[k], ch[k+1], ch[k+2], a[j]);
			
		}
		return s;
	}
	
}
