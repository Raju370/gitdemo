package demoapp;

class Addition{
	
	int a;
	int b;
		
	public int Addition(int a, int b, int c){
		
		return a+b+c;
		
	}
	
		
}

public class AdditionApplication {

	public static void main(String[] args) {
		
		Addition ad = new Addition();
		
		System.out.println(ad.Addition(2, 4, 2));
		
		
	}

}
