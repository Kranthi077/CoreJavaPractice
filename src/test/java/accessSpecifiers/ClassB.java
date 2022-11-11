package accessSpecifiers;

public class ClassB{

	public static void main(String[] args) {
		ClassA ob = new ClassA();
		ob.getData();
		ob.name = "";

		ob.defaultMethod();
		ob.a = 1;
		
		ob.privateKeyword();
		ob.data="";
		
		ob.protectedKeyword(); // without any inheritance
		ob.type="";

	}

}
