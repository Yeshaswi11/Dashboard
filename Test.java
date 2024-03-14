class Test{

void method(){
System.out.println("1");
}

}

class Test1 extends Test{
void method()
{
System.out.println("2");
}

public static void main(String[] args) {

Test t = new Test();
t.method();
Test1 t1 = new Test1():
t1.method();

	}
