package divide;

class Divide{
	
	private int a = 0;
	
	public int Dividenum(int x, int y){
		
		return a = x / y;
	}
}

public class Div {
	
	public static void main(String[] args){
		
		Divide d = new Divide();
		System.out.println(d.Dividenum(10, 5));
		System.out.println(d.Dividenum(15, 5));
		System.out.println(d.Dividenum(1000, 20));
	}
}
