public class basic {
	basic obj;
	basic obj1;
	static int a;

	static void method() {
		basic obk = new basic();
		System.out.println(obk);
		System.out.println(a);
	}
	
	void method2()
	{
		System.out.println("Method 2");
	}
	void method1()
	{
		method();
		method2();
	}

	public static void main(String[] args) {
		System.out.println(args);
		basic obm = new basic();
		System.out.println(obm.obj);
		System.out.println(a);
		a = 100;
		method();
		obm.method1();
		obm.method2();
		System.out.println(obm.obj);
		System.out.println(a);
	}

}
