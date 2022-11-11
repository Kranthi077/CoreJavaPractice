package accessSpecifiers2;

import accessSpecifiers.ClassA;

public class ClassD extends ClassA {

	public static void main(String[] args) {
		ClassA ob = new ClassA();
		ob.getData(); // getData method is made public
		ob.name=""; // name variable is made public
		
		ob.defaultMethod(); // default method hence not accessible
		ob.a = 1;// default variable hence not accessible
		
		ob.privateKeyword();
		ob.data="";
		
		
		ClassD ob2 = new ClassD();
		ob2.protectedKeyword(); // without any inheritance
		
	}

}
