package p2;
import p1 A;
public class C extends A {
	A aobj=new A();
	
	
	System.out.println(aobj.d);
	C cobj=new C();
	System.out.println(cobj.c);
	System.out.println(cobj.d);

}
