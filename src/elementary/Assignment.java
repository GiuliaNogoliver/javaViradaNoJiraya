package elementary;

public class Assignment {
	public static void main(String[] args) {
		
		int ab;
		int a = 3;
		int b = a;
		int c = a + b;
		
		ab = c++;
		
		c += b; //c = c + b;
		c -= a; //c = c - a;
		c *= b; //c = c * b;
		c /= b; //c = c / b:
		
		c = b + c; // c+= b;
		
		System.out.println(c + ab);
		
		c %= 2; //c = c % 2;
		
		System.out.println(c);
	}
}
