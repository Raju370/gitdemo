package sweetbox;

class Division{
	int a;
	int b;
	
	public int Division(int a, int b) {
		return a/b; 
		
	}
	
}

public class DivisionApplication {

	public static void main(String[] args) {
		
		Division div = new Division();
		
		System.out.println(div.Division(4, 2));
		
			
	}

}
