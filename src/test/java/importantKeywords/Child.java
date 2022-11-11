package importantKeywords;

public class Child extends FinalKeywordDemo {

	// cannot override because it is final
	public void getdata() {

		System.out.println("Good NOon All");
	}
	
	
	public static void main(String[] args) {

		Child ob = new Child();
		ob.getdata();
		
	}

}
